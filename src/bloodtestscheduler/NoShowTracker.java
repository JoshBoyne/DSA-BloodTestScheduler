/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author Josh
 */

public class NoShowTracker implements StackADT<Person> {
    private Stack<Person> stack;
    private static final int MAX_NO_SHOWS = 5;

    public NoShowTracker() {
        stack = new Stack<>();
    }

    @Override
    public void push(Person item) {
        if (stack.size() >= MAX_NO_SHOWS) {
            stack.remove(0); // removes the oldest no show
        }
        stack.push(item);
    }

    @Override
    public Person pop() {
        return stack.pop();
    }

    @Override
    public Person peek() {
        return stack.peek();
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    //returns all the no shows
    public List<Person> getAllNoShows() {
        return new ArrayList<>(stack);
    }
    
    //recursion method to display all the no show patients
    public void displayNoShowsRecursively(int index, StringBuilder sb) {
        if (index >= stack.size()) {
            return; // end of stack
        }
        sb.append(stack.get(index).toString()).append("\n"); //append patient details
        displayNoShowsRecursively(index + 1, sb); // display next patient
    }

    //start recursion and return the result as a string
    public String startDisplayNoShows() {
        StringBuilder sb = new StringBuilder();
        displayNoShowsRecursively(0, sb); //start recursion from the first element
        return sb.toString(); //return string
    }
}