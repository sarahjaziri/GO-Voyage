/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voy.govoyage.test;

import voy.govoyage.dao.AdminDAO;
import voy.govoyage.dao.HotelDAO;
import voy.govoyage.entities.Admin;
import voy.govoyage.entities.Hotel;
import voy.govoyage.util.DataSource;


/**
 *
 * @author Cherni Mohamed
 */
public class Test {
    
    public static void main(String[] args) {
      Admin admin = new Admin("cherni","med","med@esprit.tn",28145,"admin","admin");
      Admin admin1 = new Admin("jaiz","said","said@esprit.tn",20096822,"system","system");
      AdminDAO admindao = new AdminDAO();
         Hotel hotel=new Hotel("andaloussia", 5, "bizerte", 40, "tunis", "bizerte","hghgh",55);
        HotelDAO hoteldao=new HotelDAO();
      //admindao.add(admin1);
      //admin.setTelephoneAdmin(21009646);
      //admindao.update(admin,5);
//      admin1.setPasswordAdmin("qwerty");
//      admindao.update(admin1);
      admindao.delete(admin1);
      
     
    }
    
}
