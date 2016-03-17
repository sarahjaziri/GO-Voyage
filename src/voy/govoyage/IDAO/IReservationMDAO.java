/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voy.govoyage.IDAO;

import java.util.List;
import voy.govoyage.entities.Maison;
import voy.govoyage.entities.ReservationM;

/**
 *
 * @author Administrateur
 */
public interface IReservationMDAO<T> {
     void add(ReservationM m);
   
    List<Maison> displayAll();
    List<T> displayAll2();
    void update(T t);
    void delete (T t);
    List<T> findMaisonByName(String name);
     List<T> displayAllAdmin();
   
   
    
}
