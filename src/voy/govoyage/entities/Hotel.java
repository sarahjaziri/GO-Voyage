/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voy.govoyage.entities;

import java.util.Objects;

/**
 *
 * @author user
 */
public class Hotel {
    
    private int id;
    private String nom;
    private int nombre_e;
    private String ville;
    private int capacite;
    private String pays;
    private String localisation;
    private String description;
    private int Telephone;

    public Hotel() {
    }

    public Hotel(int id, String nom, int nombre_e, String ville, int capacite, String pays, String localisation, String description, int Telephone) {
        this.id = id;
        this.nom = nom;
        this.nombre_e = nombre_e;
        this.ville = ville;
        this.capacite = capacite;
        this.pays = pays;
        this.localisation = localisation;
        this.description = description;
        this.Telephone = Telephone;
    }

    public Hotel(String nom, int nombre_e, String ville, int capacite, String pays, String localisation, String description, int Telephone) {
        this.nom = nom;
        this.nombre_e = nombre_e;
        this.ville = ville;
        this.capacite = capacite;
        this.pays = pays;
        this.localisation = localisation;
        this.description = description;
        this.Telephone = Telephone;
    }



   

    public Hotel(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNombre_e() {
        return nombre_e;
    }

    public void setNombre_e(int nombre_e) {
        this.nombre_e = nombre_e;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public int getCapacite() {
        
        return  capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTelephone() {
        return Telephone;
    }

    public void setTelephone(int Telephone) {
        this.Telephone = Telephone;
    }

    @Override
    public String toString() {
        return "Hotel{" + "id=" + id + ", nom=" + nom + ", nombre_e=" + nombre_e + ", ville=" + ville + ", capacite=" + capacite + ", pays=" + pays + ", localisation=" + localisation + ", description=" + description + ", Telephone=" + Telephone + '}';
    }
    
    
    

  
  

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.nom);
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
        final Hotel other = (Hotel) obj;
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (this.nombre_e != other.nombre_e) {
            return false;
        }
        if (!Objects.equals(this.ville, other.ville)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
    
    
    
}
