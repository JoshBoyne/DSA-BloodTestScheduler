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
    void push(T item); // Adds item to stack
    T pop(); // removes and returns the top item from the stack
    T peek(); // returns the top item without removing it
    boolean isEmpty(); // checks if the stack is empty
}