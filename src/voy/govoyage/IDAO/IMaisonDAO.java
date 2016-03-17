/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voy.govoyage.IDAO;


import java.util.List;
import javax.swing.JComboBox;
import voy.govoyage.entities.Maison;

/**
 *
 * @author Administrateur
 */
public interface IMaisonDAO<T> {
    void add(T t);
    void update(T t);
    void updateEtat(T t);
    void delete (T t);
    List<T> displayAll();
     
    List<T> findMaisonByName(String name);
    boolean login(String log, String pass);
    void Fillcombo(JComboBox cb);
     void FillcomboT(JComboBox cb);
    
}
