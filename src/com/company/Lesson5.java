/**
 * Java 1. Homework 5
 *
 * @author Yuri Antufev
 * @version 31.01.2022
 */
package com.company;

public class Lesson5 {

    public static void main(String[] args) {
        Employee[] employee = {
                new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "89212524545", 30000, 30),
                new Employee("Stepan Stepanch", "DevOps-Engineer", "Stepan@mailbox.com", "89231255454", 40000, 45),
                new Employee("Volkova Irina", "QA-Engineer", "Irina@mailbox.com", "89236597854", 40000, 61),
                new Employee("Fedorov Fedor", "Team Lead", "Fedorov@mailbox.com", "8923544515", 50000, 24),
                new Employee("Sidorov Maxsim", "Engineer", "Max@mailbox.com", "8923331558", 30000, 33)
        };
        for (Employee empl : employee){
            if(empl.getAge()>40){
                System.out.println(empl);
            }
        }
    }
}

class Employee{
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salsry;
    private int age;

    public Employee(String name,String position,String email,String phone,int salsry,int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salsry = salsry;
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public String toString(){
        return (name+ ":"+
                "\n Position: "+position+
                "\n Email: " + email+
                "\n Phone: "+phone+
                "\n Salsry: "+ salsry+
                "\n Age: "+age);
    }
}
