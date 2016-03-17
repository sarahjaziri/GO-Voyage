/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voy.govoyage.entities;

/**
 *
 * @author Administrateur
 */
public class Maison {
    private int id;
    private String pays;
    private String ville;
    private String adresse;
    private String type;
    private int prix;
    private String description;
    private int etat;

    public Maison() {
    }

    public Maison(int id, String pays, String ville, String adresse, String type, int prix, String description,int etat) {
        this.id = id;
        this.pays = pays;
        this.ville = ville;
        this.adresse = adresse;
        this.type = type;
        this.prix = prix;
        this.description = description;
        this.etat=etat;
    }

    public Maison(String pays, String ville, String adresse, String type, int prix, String description) {
        this.pays = pays;
        this.ville = ville;
        this.adresse = adresse;
        this.type = type;
        this.prix = prix;
        this.description = description;
        this.etat=etat;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }
    
    
     public Maison(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getPays() {
        return pays;
    }

    public String getVille() {
        return ville;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getType() {
        return type;
    }

    public int getPrix() {
        return prix;
    }

    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.id;
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
        final Maison other = (Maison) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Maison{" + "id=" + id + ", pays=" + pays + ", ville=" + ville + ", adresse=" + adresse + ", type=" + type + ", prix=" + prix + ", description=" + description + ", etat=" + etat + '}';
    }

  
    
    
    
}
