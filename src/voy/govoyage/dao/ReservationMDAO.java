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
import voy.govoyage.IDAO.IReservationMDAO;
import voy.govoyage.entities.Maison;
import voy.govoyage.entities.ReservationM;
import voy.govoyage.util.DataSource;


/**
 *
 * @author Administrateur
 */
public class ReservationMDAO implements IReservationMDAO<ReservationM>{
    
    
    Connection cnx;
     public ReservationMDAO(){
     cnx = DataSource.getInstance().getConnection();}

    @Override
    public void add(ReservationM reservation) {
        try {
            PreparedStatement pst = cnx.prepareStatement("insert into reservationm(maison,client,date,nbre_jrs,total) values(?,?,?,?,?)");
            pst.setInt(1, reservation.getMaison());
            pst.setInt(2, reservation.getClient());
            pst.setString(3, reservation.getDate());
            pst.setInt(4, reservation.getNbre_jrs());
            pst.setInt(5, reservation.getTotal());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ReservationMDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Maison> displayAll() {
         List<Maison> myList = new ArrayList<>();
       String requete = "SELECT * FROM maison where etat is NULL";
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
                m.setEtat(rs.getInt("etat"));
                m.setDescription(rs.getString("description"));
                
             
             
             myList.add(m);}
        } catch (SQLException ex) {
            Logger.getLogger(ReservationMDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       return myList;
    }
   
     @Override
    public List<ReservationM> displayAll2() {
         List<ReservationM> myList = new ArrayList<>();
       String requete = "SELECT * FROM reservationm where client=0";
         
        try {
          Statement st =  cnx.createStatement();
             ResultSet rs = st.executeQuery(requete);
             while(rs.next()){
                ReservationM R = new ReservationM();
                R.setId(rs.getInt("id"));
                 R.setClient(rs.getInt("client"));
                R.setDate(rs.getString("date"));
                R.setNbre_jrs(rs.getInt("nbre_jrs"));
                R.setTotal(rs.getInt("total"));
             
                 myList.add(R);
        }} catch (SQLException ex) {
            Logger.getLogger(ReservationMDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    return myList;
        
        
        
    
    } 
    
   

    

   



   

    @Override
    public void update(ReservationM reservation) {
        try {
            PreparedStatement pst = cnx.prepareStatement("update reservationm set date=?,nbre_jrs=? where id=?");
           
            pst.setString(1, reservation.getDate());
             pst.setInt(2, reservation.getNbre_jrs());
              
             pst.setInt(3, reservation.getId());
             
             pst.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(ReservationMDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(ReservationM reservation) {
        try {
            PreparedStatement pst = cnx.prepareStatement("delete from reservationm where id=?");
             pst.setInt(1, reservation.getId());
             pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ReservationMDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<ReservationM> findMaisonByName(String name) {
       List<ReservationM> myList = new ArrayList<>();
        String requete = "select * from reservationm where id like'"+name.toString()+"%'";
  
         try {
            PreparedStatement ps =  cnx.prepareStatement(requete);
           // ps.setString(1, name);
            
            ResultSet rs = ps.executeQuery(requete);
            System.out.println(rs);
            while(rs.next()){
               ReservationM R = new ReservationM();
                R.setId(rs.getInt("id"));
                 R.setMaison(rs.getInt("maison"));
                R.setClient(rs.getInt("client"));
                R.setDate(rs.getString("date"));
                R.setNbre_jrs(rs.getInt("nbre_jrs"));
                R.setTotal(rs.getInt("total"));
                
                
                
                
                myList.add(R);
              
                
          
                
                    
                  
                

                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       return myList;
        
        
    }

    @Override
    public List<ReservationM> displayAllAdmin() {
         List<ReservationM> myList = new ArrayList<>();
       String requete = "SELECT * FROM reservationm ";
       
        try {
            Statement st =  cnx.createStatement();
             ResultSet rs = st.executeQuery(requete);
             while(rs.next()){
                ReservationM R = new ReservationM();
                R.setId(rs.getInt("id"));
                 R.setClient(rs.getInt("client"));
                R.setDate(rs.getString("date"));
                R.setNbre_jrs(rs.getInt("nbre_jrs"));
                R.setTotal(rs.getInt("total"));
             
                 myList.add(R);
        }
            
        } catch (SQLException ex) {
            Logger.getLogger(ReservationMDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return myList;
    }

   

   
    
}
