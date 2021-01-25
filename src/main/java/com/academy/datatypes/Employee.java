package com.academy.datatypes;

public class Employee {
    public static String name;
    public static int salary = 1000;


    public void setName(String name) {
        this.name = name;
    }

/*    public void setSalary(int salary) {
        salary = salary;
    }*/

    public String getName(){
        return name;
    }

    public int getSalary(){
        return salary;
    }


}
