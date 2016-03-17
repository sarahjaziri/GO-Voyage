/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voy.govoyage.IDAO;

import java.util.List;

/**
 *
 * @author Cherni Mohamed
 */
public interface IAdminDAO<T> {
    void add(T t);
    void update(T t);
    void delete (T t);
    List<T> displayAll();
    List<T> findByName(String name);
    boolean login(String log, String pass);
    
}
