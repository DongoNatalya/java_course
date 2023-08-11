package ru.stqa.pft.sandbox;

import java.sql.SQLOutput;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("Natalya");


        Point p1 = new Point(10, 5);
        Point p2 = new Point(12, 30);
        System.out.println("Расстояние между точками = " + distance(p1,p2));
    }
    public static void hello (String somebody) {
        System.out.println("Hello, " + somebody +"!");
    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y));
    }

}