/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author Josh
 */
public interface PriorityQueueADT<T> {
    void enqueue(T item); //adds into queue
    T dequeue(); //removes and returns the highest priority from the queue
    T peek(); //returns the highest priority without removing it 
    boolean isEmpty(); //checks if the queue is empty
}
