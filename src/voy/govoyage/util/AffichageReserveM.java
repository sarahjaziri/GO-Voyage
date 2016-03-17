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
import voy.govoyage.entities.ReservationM;

/**
 *
 * @author Administrateur
 */
public class AffichageReserveM extends AbstractTableModel {
     List<ReservationM> lst;
String [] columns = {"client","id","Date de Reservation","Nombre de jours","Total"};

public AffichageReserveM() {
        
        ReservationMDAO dao=new ReservationMDAO();
        lst=dao.displayAll2();
        
        
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
return lst.get(rowIndex).getClient();
    case 1 :
return lst.get(rowIndex).getId();
case 2 :
return lst.get(rowIndex).getDate();
case 3 :
return lst.get(rowIndex).getNbre_jrs();
case 4:
return lst.get(rowIndex).getTotal();
    default: return null;}}
         @Override
    public String getColumnName(int i){return columns[i];}
        
    }









