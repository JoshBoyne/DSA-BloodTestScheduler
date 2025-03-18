/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Josh
 */


public class PatientQueue implements PriorityQueueADT<Person> {
    private PriorityQueue<Person> queue;

    public PatientQueue() {
        // comparator that sorts the patients by their priority, age and their hospital status
        Comparator<Person> comparator = Comparator
                .comparing((Person p) -> p.getPriorityLevel())
                .thenComparingInt(Person::getAge)
                .thenComparing(Person::isFromHospital)
                .reversed(); // highest priority first
        queue = new PriorityQueue<>(comparator);
    }

    @Override
    public void enqueue(Person patient) {
        queue.add(patient);
    }

    @Override
    public Person dequeue() {
        return queue.poll();
    }

    @Override
    public Person peek() {
        return queue.peek();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // returns the list of all the patients
    public List<Person> getAllPatients() {
        PriorityQueue<Person> tempQueue = new PriorityQueue<>(queue);
        List<Person> patientList = new ArrayList<>();
        while (!tempQueue.isEmpty()) {
            patientList.add(tempQueue.poll());
        }
        return patientList;
    }
    
    //method to remove a specific patient from the queue
    public void remove(Person patient) {
        queue.remove(patient);
    }
}               