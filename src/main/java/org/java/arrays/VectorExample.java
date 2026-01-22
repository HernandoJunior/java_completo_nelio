package org.java.arrays;

import java.util.Locale;
import java.util.Scanner;

public class VectorExample {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vector = new double[n];
        double average = 0.0;

        for (int i = 0; i < n; i++){
            vector[i] = sc.nextDouble();
            average += vector[i];
        }

        average = average / vector.length;

        System.out.printf("Average Height = %.2f", average);

        sc.close();
    }
}
