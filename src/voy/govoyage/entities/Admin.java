/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voy.govoyage.entities;

import java.util.Objects;

/**
 *
 * @author Cherni Mohamed
 */
public class Admin {
    private int id;
    private String nomAdmin;
    private String prenomAdmin;
    private String mailAdmin;
    private int telephoneAdmin;
    private String loginAdmin;
    private String passwordAdmin;

    public Admin() {
    }

    public Admin(int id) {
        this.id = id;
    }
    

    public Admin(int id, String nomAdmin, String prenomAdmin, String mailAdmin, int telephoneAdmin, String loginAdmin, String passwordAdmin) {
        this.id = id;
        this.nomAdmin = nomAdmin;
        this.prenomAdmin = prenomAdmin;
        this.mailAdmin = mailAdmin;
        this.telephoneAdmin = telephoneAdmin;
        this.loginAdmin = loginAdmin;
        this.passwordAdmin = passwordAdmin;
    }
    
    public Admin(String nomAdmin, String prenomAdmin, String mailAdmin, int telephoneAdmin, String loginAdmin, String passwordAdmin) {
        this.nomAdmin = nomAdmin;
        this.prenomAdmin = prenomAdmin;
        this.mailAdmin = mailAdmin;
        this.telephoneAdmin = telephoneAdmin;
        this.loginAdmin = loginAdmin;
        this.passwordAdmin = passwordAdmin;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomAdmin() {
        return nomAdmin;
    }

    public void setNomAdmin(String nomAdmin) {
        this.nomAdmin = nomAdmin;
    }

    public String getPrenomAdmin() {
        return prenomAdmin;
    }

    public void setPrenomAdmin(String prenomAdmin) {
        this.prenomAdmin = prenomAdmin;
    }

    public String getMailAdmin() {
        return mailAdmin;
    }

    public void setMailAdmin(String mailAdmin) {
        this.mailAdmin = mailAdmin;
    }

    public int getTelephoneAdmin() {
        return telephoneAdmin;
    }

    public void setTelephoneAdmin(int telephoneAdmin) {
        this.telephoneAdmin = telephoneAdmin;
    }

    public String getLoginAdmin() {
        return loginAdmin;
    }

    public void setLoginAdmin(String loginAdmin) {
        this.loginAdmin = loginAdmin;
    }

    public String getPasswordAdmin() {
        return passwordAdmin;
    }

    public void setPasswordAdmin(String passwordAdmin) {
        this.passwordAdmin = passwordAdmin;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.nomAdmin);
        hash = 59 * hash + Objects.hashCode(this.prenomAdmin);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Admin other = (Admin) obj;
        if (!Objects.equals(this.nomAdmin, other.nomAdmin)) {
            return false;
        }
        if (!Objects.equals(this.prenomAdmin, other.prenomAdmin)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Admin{" + "id=" + id + ", nomAdmin=" + nomAdmin + ", prenomAdmin=" + prenomAdmin + ", mailAdmin=" + mailAdmin + ", telephoneAdmin=" + telephoneAdmin + ", loginAdmin=" + loginAdmin + ", passwordAdmin=" + passwordAdmin + '}';
    }
    
    
    
    
    
    
    
    
}
