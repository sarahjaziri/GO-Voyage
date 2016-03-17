/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voy.govoyage.util;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import voy.govoyage.dao.ReservationMDAO;
import voy.govoyage.entities.Maison;

/**
 *
 * @author Administrateur
 */
public class AffichageReservationM extends AbstractTableModel{
      List<Maison> lst;
String [] columns = {"Id","Pays","Ville","Adresse","Type","Prix","Description","Etat"};
public AffichageReservationM() {
        
        ReservationMDAO dao=new ReservationMDAO();
        lst=dao.displayAll();
        
        
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
return lst.get(rowIndex).getPays();
case 2:
return lst.get(rowIndex).getVille();
case 3 :
return lst.get(rowIndex).getAdresse();
case 4:
return lst.get(rowIndex).getType();
case 5:
return lst.get(rowIndex).getPrix();
case  6:
return lst.get(rowIndex).getDescription();
    case  7:
return lst.get(rowIndex).getEtat();
  
default: return null;}
    }
     @Override
    public String getColumnName(int i){return columns[i];}
    
}
