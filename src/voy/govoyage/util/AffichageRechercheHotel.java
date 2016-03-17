/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voy.govoyage.util;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import voy.govoyage.dao.HotelDAO;
import voy.govoyage.entities.Hotel;

/**
 *
 * @author user
 */
public class AffichageRechercheHotel extends AbstractTableModel{
    List<Hotel> lst;
String [] columns = {"Id","Nom","N°Etoiles","Ville","localisation","pays","capacite","description","Telephone"};

 public AffichageRechercheHotel(String name) {
        
        HotelDAO dao=new HotelDAO();
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
return lst.get(rowIndex).getNom();
case 2:
return lst.get(rowIndex).getNombre_e();
case 3 :
return lst.get(rowIndex).getVille();
case 4:
return lst.get(rowIndex).getLocalisation();
case 5:
return lst.get(rowIndex).getPays();
case  6:
return lst.get(rowIndex).getCapacite();
case 7:
    return lst.get(rowIndex).getDescription();
    
case 8:
    return lst.get(rowIndex).getTelephone();    
default: return null;}
    
    
}
    @Override
    public String getColumnName(int i){return columns[i];}
}