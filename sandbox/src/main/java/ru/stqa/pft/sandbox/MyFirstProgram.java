package ru.stqa.pft.sandbox;

import java.sql.SQLOutput;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("Natalya");


        Point p1 = new Point(10, 5);
        Point p2 = new Point(15, 8);
        System.out.println("Расстояние между точками = " + p1.distance(p2));
    }
    public static void hello (String somebody) {
        System.out.println("Hello, " + somebody +"!");
    }

}