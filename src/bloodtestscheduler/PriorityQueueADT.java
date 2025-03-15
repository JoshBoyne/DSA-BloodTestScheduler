/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author Josh
 */
public interface PriorityQueueADT<T>{
    
    void enqueue(T item);
    T dequeue();
    T peek();
    boolean isEmpty();
}
