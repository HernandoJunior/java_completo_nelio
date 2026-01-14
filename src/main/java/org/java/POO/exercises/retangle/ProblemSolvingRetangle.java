package org.java.POO.exercises.retangle;

import java.util.Locale;
import java.util.Scanner;

public class ProblemSolvingRetangle {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Retangle retangle = new Retangle();

        System.out.println("Enter retangle width and height: ");
        retangle.widht = sc.nextDouble();
        retangle.height = sc.nextDouble();

        System.out.println("Area: " + retangle.area());
        System.out.println("Perimeter: " + retangle.perimeter());
        System.out.println("Diagonal: : " + retangle.diagonal());
    }
}
