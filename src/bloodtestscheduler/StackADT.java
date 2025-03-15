/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author Josh
 */
public interface StackADT<T> {
    
    void push(T item);
    T pop();
    T peek();
    boolean isEmpty();
}
