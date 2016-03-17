/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voy.govoyage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import voy.govoyage.IDAO.IHotelDAO;
import voy.govoyage.entities.Admin;
import voy.govoyage.entities.Hotel;
import voy.govoyage.util.DataSource;

/**
 *
 * @author user
 */
public class HotelDAO implements IHotelDAO<Hotel> {
    Connection cnx;
    public HotelDAO(){
        cnx = DataSource.getInstance().getConnection();
    }

    @Override
    public void add(Hotel hotel) {
        try {
            PreparedStatement pst = cnx.prepareStatement("insert into hotel(nom,nombre_e,ville,localisation,pays,capacite,description,telephone) values(?,?,?,?,?,?,?,?)");
             pst.setString(1,hotel.getNom());
            pst.setInt(2, hotel.getNombre_e());
            pst.setString(3, hotel.getVille());
            pst.setString(4, hotel.getLocalisation());
            pst.setString(5, hotel.getPays());
            pst.setInt(6, hotel.getCapacite());
            pst.setString(7, hotel.getDescription());
            pst.setInt(8, hotel.getTelephone());
             pst.executeUpdate();
       
        } catch (SQLException ex) {
            Logger.getLogger(HotelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Hotel hotel) {
          try {
            PreparedStatement pst = cnx.prepareStatement("update hotel set nom=?,nombre_e=?,ville=?,localisation=?,pays=?,capacite=?,description=?,telephone=? where id=?");
            pst.setString(1,hotel.getNom());
            pst.setInt(2, hotel.getNombre_e());
            pst.setString(3, hotel.getVille());
            pst.setString(4, hotel.getLocalisation());
            pst.setString(5, hotel.getPays());
            pst.setInt(6, hotel.getCapacite());
            pst.setString(7, hotel.getDescription());
            pst.setInt(8, hotel.getTelephone());
            pst.setInt(9, hotel.getId());
            
             pst.executeUpdate();
            
           
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(Hotel hotel) {
        try {
            PreparedStatement pst = cnx.prepareStatement("delete from hotel where id=?");
            pst.setInt(1, hotel.getId());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Hotel> displayAll() {
        
        List<Hotel> myList = new ArrayList<>();
       String requete = "SELECT * FROM hotel";
        try {
            Statement st =  cnx.createStatement();
            ResultSet rs = st.executeQuery(requete);
            while(rs.next()){
                Hotel h = new Hotel();
                h.setId(rs.getInt("id"));
                h.setNom(rs.getString("nom"));
                h.setNombre_e(rs.getInt("nombre_e"));
                h.setVille(rs.getString("ville"));
                h.setLocalisation(rs.getString("localisation"));
                h.setPays(rs.getString("pays"));
                h.setCapacite(rs.getInt("capacite"));
                 h.setDescription(rs.getString("description"));
                  h.setTelephone(rs.getInt("telephone"));
                
                myList.add(h);
              
            }
                 
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       return myList;
       
    }

    @Override
    public List<Hotel> findByName(String name) {
List<Hotel> myList = new ArrayList<>();
       String requete = "SELECT * from hotel where nom like'"+name+"%' or nombre_e like'"+name.toString()+"%' or ville like'"+name+"%' or localisation like'"+name+"%' or telephone like'"+name.toString()+"%' or id like'"+name.toString()+"%' or capacite like'"+name.toString()+"%' or pays like'"+name+"%'";
        try {
            PreparedStatement ps =  cnx.prepareStatement(requete);
           // ps.setString(1, name);
            
            ResultSet rs = ps.executeQuery(requete);
            System.out.println(rs);
            while(rs.next()){
                Hotel h = new Hotel();
                h.setId(rs.getInt("id"));
                h.setNom(rs.getString("nom"));
                h.setNombre_e(rs.getInt("nombre_e"));
                h.setVille(rs.getString("ville"));
                h.setLocalisation(rs.getString("localisation"));
                h.setPays(rs.getString("pays"));
                h.setCapacite(rs.getInt("capacite"));
                 h.setDescription(rs.getString("description"));
                  h.setTelephone(rs.getInt("telephone"));
                
                myList.add(h);
              
                
          
                
                    
                    
                
                

                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       return myList;    }

    @Override
    public boolean login(String log, String pass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
