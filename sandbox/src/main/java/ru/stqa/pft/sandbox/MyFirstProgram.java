package ru.stqa.pft.sandbox;

import java.sql.SQLOutput;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("Natalya");


        Point P = new Point(10, 5, 12, 30);
        System.out.println("Расстояние между точками = " + P.distance());
    }
    public static void hello (String somebody) {
        System.out.println("Hello, " + somebody +"!");
    }

}