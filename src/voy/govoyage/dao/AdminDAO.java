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
import voy.govoyage.IDAO.IAdminDAO;
import voy.govoyage.entities.Admin;
import voy.govoyage.util.DataSource;

/**
 *
 * @author Cherni Mohamed
 */
public class AdminDAO implements IAdminDAO<Admin>{

    Connection cnx;
    public AdminDAO() {
        cnx = DataSource.getInstance().getConnection();
    }

    @Override
    public void add(Admin admin) {
        try {
            PreparedStatement pst = cnx.prepareStatement("insert into admin(nom_admin,prenom_admin,mail_admin,telephone_admin,login_admin,password_admin) values(?,?,?,?,?,?)");
            pst.setString(1, admin.getNomAdmin());
            pst.setString(2, admin.getPrenomAdmin());
            pst.setString(3, admin.getMailAdmin());
            pst.setInt(4, admin.getTelephoneAdmin());
            pst.setString(5, admin.getLoginAdmin());
            pst.setString(6, admin.getPasswordAdmin());
            
            pst.executeUpdate();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Admin admin) {
        try {
            PreparedStatement pst = cnx.prepareStatement("update admin set nom_admin=?,prenom_admin=?,mail_admin=?,telephone_admin=?,password_admin=? where id=?");
            pst.setString(1, admin.getNomAdmin());
            pst.setString(2, admin.getPrenomAdmin());
            pst.setString(3, admin.getMailAdmin());
            pst.setInt(4, admin.getTelephoneAdmin());
            pst.setString(5, admin.getPasswordAdmin());
            pst.setInt(6, admin.getId());
            
           
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

    @Override
    public void delete(Admin admin) {
        try {
            PreparedStatement pst = cnx.prepareStatement("delete from admin where id=?");
            pst.setInt(1, admin.getId());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Admin> displayAll() {
        
        List<Admin> myList = new ArrayList<>();
       String requete = "SELECT * FROM admin";
        try {
            Statement st =  cnx.createStatement();
            ResultSet rs = st.executeQuery(requete);
            while(rs.next()){
                Admin p = new Admin();
                p.setId(rs.getInt("id"));
                p.setNomAdmin(rs.getString("nom_admin"));
                p.setPrenomAdmin(rs.getString("prenom_admin"));
                p.setMailAdmin(rs.getString("mail_admin"));
                p.setTelephoneAdmin(rs.getInt("telephone_admin"));
                p.setLoginAdmin(rs.getString("login_admin"));
                p.setPasswordAdmin(rs.getString("password_admin"));
                
                myList.add(p);

                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       return myList;
    }

    @Override
    public List<Admin> findByName(String name) {
        System.out.println("*************************************************"+name);
        List<Admin> myList = new ArrayList<>();
       String requete = "SELECT * from admin where nom_admin like'"+name+"%' or prenom_admin like'"+name+"%' or login_admin like'"+name+"%' or mail_admin like'"+name+"%' or telephone_admin like'"+name.toString()+"%' or id like'"+name.toString()+"%'";
        try {
            PreparedStatement ps =  cnx.prepareStatement(requete);
           // ps.setString(1, name);
            
            ResultSet rs = ps.executeQuery(requete);
            System.out.println(rs);
            while(rs.next()){
                Admin p = new Admin();
              p.setId(rs.getInt("id"));
                    p.setNomAdmin(rs.getString("nom_admin"));
                p.setPrenomAdmin(rs.getString("prenom_admin"));
                p.setMailAdmin(rs.getString("mail_admin"));
                p.setTelephoneAdmin(rs.getInt("telephone_admin"));
                p.setLoginAdmin(rs.getString("login_admin"));
                p.setPasswordAdmin(rs.getString("password_admin"));
                
                myList.add(p);
                
                    
                    
                
                

                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       return myList;
    }

    @Override
    public boolean login(String log, String pass) {
        boolean result = false;
        try {
            PreparedStatement pst = cnx.prepareStatement("select * from admin where login_admin=? and password_admin=?");
            pst.setString(1, log);
            pst.setString(2, pass);
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                result=true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    
   
    
}
