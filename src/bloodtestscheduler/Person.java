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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getGpDetails() {
        return gpDetails;
    }

    public void setGpDetails(String gpDetails) {
        this.gpDetails = gpDetails;
    }

    public boolean isFromHospital() {
        return fromHospital;
    }

    public void setFromHospital(boolean fromHospital) {
        this.fromHospital = fromHospital;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + ", priority=" + priority + ", gpDetails=" + gpDetails + ", fromHospital=" + fromHospital + '}';
    }
    
    
    
}
