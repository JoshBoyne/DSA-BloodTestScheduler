/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author Josh
 */
public class Person {
    
    private String name;
    private int age;
    private String priority;
    private String gpDetails;
    private boolean fromHospital;

    public Person(String name, int age, String priority, String gpDetails, boolean fromHospital) {
        this.name = name;
        this.age = age;
        this.priority = priority;
        this.gpDetails = gpDetails;
        this.fromHospital = fromHospital;
    }
    
    public String getPriority(){
        return priority;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + ", priority=" + priority + ", gpDetails=" + gpDetails + ", fromHospital=" + fromHospital + '}';
    }
    
}
