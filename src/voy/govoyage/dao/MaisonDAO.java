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
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import voy.govoyage.IDAO.IMaisonDAO;
import voy.govoyage.entities.Hotel;
import voy.govoyage.entities.Maison;
import voy.govoyage.entities.ReservationM;
import voy.govoyage.util.DataSource;

/**
 *
 * @author Administrateur
 */
public class MaisonDAO implements IMaisonDAO<Maison> {
     Connection cnx;
     public MaisonDAO(){
     cnx = DataSource.getInstance().getConnection();}

    @Override
    public void add(Maison maison) {
         try {
             PreparedStatement pst = cnx.prepareStatement("insert into maison(pays,ville,adresse,type,prix,description) values(?,?,?,?,?,?)");
             pst.setString(1, maison.getPays());
             pst.setString(2, maison.getVille());
             pst.setString(3, maison.getAdresse());
             pst.setString(4, maison.getType());
             pst.setInt(5, maison.getPrix());
             pst.setString(6, maison.getDescription());
           
             pst.executeUpdate();
         } catch (SQLException ex) {
             Logger.getLogger(MaisonDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
    }

    @Override
    public void update(Maison maison) {
         try {
             PreparedStatement pst = cnx.prepareStatement("update maison set pays=?,ville=?,adresse=?,type=?,prix=?,description=? where id=?");
              pst.setString(1, maison.getPays());
             pst.setString(2, maison.getVille());
             pst.setString(3, maison.getAdresse());
             pst.setString(4, maison.getType());
             pst.setInt(5, maison.getPrix());
             pst.setString(6, maison.getDescription());
              pst.setInt(7, maison.getId());
             pst.executeUpdate();
             
         } catch (SQLException ex) {
             Logger.getLogger(MaisonDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
    }

    @Override
    public void delete(Maison maison) {
         try {
             PreparedStatement pst = cnx.prepareStatement("delete from maison where id=?");
             pst.setInt(1, maison.getId());
             pst.executeUpdate();
         } catch (SQLException ex) {
             Logger.getLogger(MaisonDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
    }

    @Override
    public List<Maison> displayAll() {
        List<Maison> myList = new ArrayList<>();
       String requete = "SELECT * FROM maison";
         try {
             Statement st =  cnx.createStatement();
             ResultSet rs = st.executeQuery(requete);
             while(rs.next()){
                Maison m = new Maison();
                m.setId(rs.getInt("id"));
                m.setPays(rs.getString("pays"));
                m.setVille(rs.getString("ville"));
                m.setAdresse(rs.getString("adresse"));
                m.setType(rs.getString("type"));
                m.setPrix(rs.getInt("prix"));
                m.setDescription(rs.getString("description"));
                
             
             
             myList.add(m);}
             
         } catch (SQLException ex) {
             Logger.getLogger(MaisonDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
         return myList;
    }

   
    @Override
    public boolean login(String log, String pass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Maison> findMaisonByName(String name) {
        List<Maison> myList = new ArrayList<>();
        String requete = "select * from maison where id like'"+name.toString()+"%'or pays like'"+name+"%'";
  
         try {
            PreparedStatement ps =  cnx.prepareStatement(requete);
           // ps.setString(1, name);
            
            ResultSet rs = ps.executeQuery(requete);
            System.out.println(rs);
            while(rs.next()){
               Maison m = new Maison();
                m.setId(rs.getInt("id"));
                 m.setPays(rs.getString("pays"));
                m.setVille(rs.getString("ville"));
                m.setAdresse(rs.getString("adresse"));
                m.setType(rs.getString("type"));
                m.setPrix(rs.getInt("prix"));
                m.setDescription(rs.getString("description"));
                
                
                
                myList.add(m);
              
                
          
                
                    
                  
                

                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       return myList;
        
        
        
}

    @Override
    public void Fillcombo(JComboBox cb) {
        try{
        
        String sql="select *from paysm";
        Statement st =  cnx.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                String pays=rs.getString("nom_pays");
                cb.addItem(pays);
              
                
            }
    
    
    
    } catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
    
    }

    @Override
    public void FillcomboT(JComboBox cb) {
        try{
        
        String sql="select *from typem";
        Statement st =  cnx.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                String type=rs.getString("nom_type");
                cb.addItem(type);
              
                
            }
    
    
    
    } catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
    }

    @Override
    public void updateEtat(Maison maison) {
         try {
             PreparedStatement pst = cnx.prepareStatement("update maison set etat = 1 where id=?");
              pst.setInt(1, maison.getId());
             pst.executeUpdate();
             
         } catch (SQLException ex) {
             Logger.getLogger(MaisonDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
    }

   
    }

