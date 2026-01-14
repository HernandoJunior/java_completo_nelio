package org.java.POO.classIntroduction;

import java.util.Scanner;

public class ProblemTriangleSolving {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangle triangleX = new Triangle();
        Triangle triangleY = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        triangleX.a = sc.nextDouble();
        triangleX.b = sc.nextDouble();
        triangleX.c = sc.nextDouble();

        double areaX = triangleX.calculateArea();

        System.out.println("Enter the measures of triangle Y: ");
        triangleY.a = sc.nextDouble();
        triangleY.b = sc.nextDouble();
        triangleY.c = sc.nextDouble();

        double areaY = triangleY.calculateArea();

        if (areaX > areaY) {
            System.out.println("Larger area: X. Value: " + areaX);
        } else {
            System.out.println("Larger area: Y. Value: " + areaY);
        }
    }
}
