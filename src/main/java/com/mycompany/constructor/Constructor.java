/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.constructor;

/**
 *
 * @author mrust
 */
public class Constructor {

    public static void main(String[] args) {

        User u = new User();

    }

    public static void foo() {
        System.out.println("foo");
        foo2();
    }

    public static void foo2() {
        System.out.println("foo2");
        foo3();
    }

    public static void foo3() {
        System.out.println("foo3");
    }

    public static void change(int a) {

    }
}
