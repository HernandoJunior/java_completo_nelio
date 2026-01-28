package org.java.matrix;

import java.util.Scanner;

public class Examples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        int count = 0;

        for (int i =0; i < n; i++){
            for (int j = 0; j < n; j++){
                mat[i][j] = sc.nextInt();
                if (mat[i][j] < 0){
                    count += 1;
                }
            }
        }

        System.out.print("Main diagonal: ");
        for (int i = 0; i< mat.length; i++){
            System.out.print(mat[i][i] + " ");
        }

        System.out.println("\nQuantity at negative numbers: " + count);
    }
}
