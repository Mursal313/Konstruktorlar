/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.constructor;

/**
 *
 * @author mrust
 */
public class User {

    private String name;
    private String surname;
    private int age;

    public User() {// Constructor parametrsiz
        this("Mursel","Rustemli");
        System.out.println("User1");
    }

    public User(String name, String surname) {// Constructor parametrli
        this("Mursel","Rustemli",20);
        System.out.println("User2");

    }

    public User(String name, String surname, int age) {// Constructor parametrli
        System.out.println("User3");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
