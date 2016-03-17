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
public class ReservationM {
    private int id;
    private int maison;
    private int client;
    private String date;
    private int nbre_jrs;
    private int total;

    public ReservationM() {
    }

    public ReservationM(int maison, int client, String date, int nbre_jrs, int total) {
        this.maison = maison;
        this.client = client;
        this.date = date;
        this.nbre_jrs = nbre_jrs;
        this.total = total;
    }

    public ReservationM(int id, String date, int nbre_jrs) {
        this.id = id;
        this.date = date;
        this.nbre_jrs = nbre_jrs;
    }
    

    public ReservationM(String date, int nbre_jrs, int total) {
        this.date = date;
        this.nbre_jrs = nbre_jrs;
        this.total = total;
    }

    public ReservationM(int id, int maison, int client, String date, int nbre_jrs, int total) {
        this.id = id;
        this.maison = maison;
        this.client = client;
        this.date = date;
        this.nbre_jrs = nbre_jrs;
        this.total = total;
    }

    public ReservationM(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getMaison() {
        return maison;
    }

    public int getClient() {
        return client;
    }

    public String getDate() {
        return date;
    }

    public int getNbre_jrs() {
        return nbre_jrs;
    }

    public int getTotal() {
        return total;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMaison(int maison) {
        this.maison = maison;
    }

    public void setClient(int client) {
        this.client = client;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setNbre_jrs(int nbre_jrs) {
        this.nbre_jrs = nbre_jrs;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.id;
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
        final ReservationM other = (ReservationM) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ReservationM{" + "id=" + id + ", maison=" + maison + ", client=" + client + ", date=" + date + ", nbre_jrs=" + nbre_jrs + ", total=" + total + '}';
    }
    
    
    
}
