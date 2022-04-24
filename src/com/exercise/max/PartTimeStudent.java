package com.exercise.max;

import java.util.Scanner;

public class PartTimeStudent extends Student {

    private static Scanner sc = new Scanner(System.in);

    private boolean type;

    public PartTimeStudent() {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.type = true;
    }

    public boolean getType() {
        return this.type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getSurname() {
        return this.surname;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    public void recordingStudentData() {
        System.out.println("What is your name?");
        setName(sc.nextLine());
        System.out.println("What is your surname?");
        setSurname(sc.nextLine());
        System.out.println("How old are you?");
        setAge(sc.nextInt());
        System.out.println("Are you part-time student? (The answer can be true or false)");
        setType(sc.nextBoolean());
        sc.close();


    }

    public void printStudentData() {
        System.out.println("Student information: "
                + "\n" + "Name: " + getName()
                + "\n" + "Surname: " + getSurname()
                + "\n" + "Age: " + getAge()
                + "\n" + "Type: " + getType());
    }

}