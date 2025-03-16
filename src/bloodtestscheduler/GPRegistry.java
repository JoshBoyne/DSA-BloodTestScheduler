/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author Josh
 */
import java.util.LinkedList;

public class GPRegistry implements DLLADT<String> {
    private LinkedList<String> gpList;

    public GPRegistry() {
        gpList = new LinkedList<>();
    }

    @Override
    public void add(String item) {
        gpList.add(item);
    }

    @Override
    public void remove(String item) {
        gpList.remove(item);
    }

    @Override
    public String get(int index) {
        return gpList.get(index);
    }

    @Override
    public void display() {
        for (String gp : gpList) {
            System.out.println(gp);
        }
    }
}