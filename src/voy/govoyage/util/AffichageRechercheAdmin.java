/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voy.govoyage.util;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import voy.govoyage.dao.AdminDAO;
import voy.govoyage.entities.Admin;

/**
 *
 * @author Cherni Mohamed
 */
public class AffichageRechercheAdmin extends AbstractTableModel{
    List<Admin> lst;
String [] columns = {"Id","Nom","Prenom","Mail","Tel","Login","Password"};
    public AffichageRechercheAdmin(String name) {
        
        AdminDAO dao=new AdminDAO();
        lst=dao.findByName(name);
        
        
    }

    

    @Override
    public int getRowCount() {
    return lst.size();
    }

    @Override
    public int getColumnCount() {
    return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
   
    
     switch(columnIndex){
         case 0 :
return lst.get(rowIndex).getId();
case 1 :
return lst.get(rowIndex).getNomAdmin();
case 2:
return lst.get(rowIndex).getPrenomAdmin();
case 3 :
return lst.get(rowIndex).getMailAdmin();
case 4:
return lst.get(rowIndex).getTelephoneAdmin();
case 5:
return lst.get(rowIndex).getLoginAdmin();
case 6:
    return lst.get(rowIndex).getPasswordAdmin() ;
default: return null;}
    
    
    
    
    }
      @Override
    public String getColumnName(int i){return columns[i];}
}
