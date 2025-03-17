/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bloodtestscheduler;
import java.util.ArrayList;

/**
 *
 * @author Josh
 * Student Number - 23343338
 */
import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {
        // hardcoded patients
        ArrayList<Person> patients = new ArrayList<>();
        patients.add(new Person("John Smith", 54, "Urgent", "Dr. Adams", true, true));
        patients.add(new Person("Sarah Smith", 32, "Urgent", "Dr. Donnelly", true, true));
        patients.add(new Person("Ryan Sheridan", 22, "Medium", "Dr. Fuchs", false, false));
        patients.add(new Person("Jonathon Smith", 54, "Low", "Dr. Byrne", false, true));
        patients.add(new Person("Sean Byrne", 54, "Urgent", "Dr. Sheridan", true, false));
        patients.add(new Person("Jason Donnelly", 54, "Low", "Dr. Mysterio", false, true));
        patients.add(new Person("Owen Brown", 54, "Low", "Dr. Pablo", false, false));
        patients.add(new Person("Conor Fuchs", 54, "Low", "Dr. Clark", false, false));
        patients.add(new Person("John Paul", 54, "Medium", "Dr. White", false, true));
        patients.add(new Person("Jane Doe", 54, "Medium", "Dr. Green", false,true));

        //initialising the PatientQueue, NoShowTracker and PatientList classes
        PatientQueue pqueue = new PatientQueue();
        NoShowTracker noShowTracker = new NoShowTracker();

        // queues the patients
        for (Person patient : patients) {
            pqueue.enqueue(patient);
            if (patient.isNoShow()) {
                noShowTracker.push(patient); // add no-show patients to the tracker
            }
        }

        //initialising the GPRegistry class
        GPRegistry gpRegistry = new GPRegistry();
        gpRegistry.add("Dr. Adams");
        gpRegistry.add("Dr. Donnelly");

         
        BloodTestSchedulerGUI myGUI = new BloodTestSchedulerGUI(pqueue, noShowTracker, gpRegistry);
        myGUI.setVisible(true);
    }
}