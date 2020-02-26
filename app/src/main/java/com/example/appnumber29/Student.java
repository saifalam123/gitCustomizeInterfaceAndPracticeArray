package com.example.appnumber29;

public class Student implements LifeInsurance {

    private String name;
    private  String courseName;
    private int costOfinsurance;

    public Student(String name , String courseName , int costOfinsurance){
        this.costOfinsurance = costOfinsurance;
        this.courseName = courseName;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCostOfinsurance() {
        return costOfinsurance;
    }

    public void setCostOfinsurance(int costOfinsurance) {
        this.costOfinsurance = costOfinsurance;
    }

    @Override
    public double evaluteCostOfinsurance() {
        return getCostOfinsurance();
    }


    @Override
    public String toString() {
        return String.format("%s: %s%n%s: %s" , getName() , "Course Name" , getCourseName());
    }
}
