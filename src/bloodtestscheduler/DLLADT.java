/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author Josh
 * Student Number - 23343338
 */
public interface DLLADT<T> {
    void add(T item);//adds item to the list
    void remove(T item);  //removes items from list
    T get(int index); //gets the item from a certain index
    void display(); //displays all the items 
}