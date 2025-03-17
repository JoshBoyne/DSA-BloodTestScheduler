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
    private boolean noShow;

    public Person(String name, int age, String priority, String gpDetails, boolean fromHospital, boolean noShow) {
        this.name = name;
        this.age = age;
        this.priority = priority;
        this.gpDetails = gpDetails;
        this.fromHospital = fromHospital;
        this.noShow = noShow;
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

    public boolean isNoShow() {
        return noShow;
    }

    public void setNoShow(boolean noShow) {
        this.noShow = noShow;
    }

    //switch case that gets the priority level as an int
    public int getPriorityLevel() {
        switch (priority) {
            case "Urgent":
                return 3; // highest priority
            case "Medium":
                return 2;
            case "Low":
                return 1; // lowest priority
            default:
                return 0; 
        }
    }

    @Override
    public String toString() {
        return "Name = " + name + 
               ", Age = " + age + 
               ", Priority = " + priority + 
               ", From Hospital = " + (fromHospital ? "Yes" : "No");
    }

    
}