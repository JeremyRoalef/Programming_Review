package com.example.javafxgui;

//This class will create person objects
//Attributes: ID, name, age
public class Person {
    int id;
    int age;
    String name;

    public Person(int id, int age, String name){
        this.id = id;
        this.age = age;
        this.name = name;
    }
    public int getId(){return this.id;}
    public int getAge(){return this.age;}
    public String getName(){return this.name;}
}
