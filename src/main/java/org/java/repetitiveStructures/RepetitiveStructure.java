package org.java.repetitiveStructures;

import java.util.Scanner;

public class RepetitiveStructure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Test 1 -> While
        int x = sc.nextInt();
        int sum = 0;
        while(x != 0){
            x = sc.nextInt();
            sum += x;
        }
        System.out.println("Valor total da soma: " + sum);

        //Test 2 -> For
        x = 3;
        for(int i = 0; i < x; i++){
            System.out.println("Valor de I: " + i);
        }

        //Test 3 -> Do-While
        char s;
        do {
            double c = sc.nextDouble();
            double f = 9.0 * c / 5.0 + 32;
            System.out.printf("Temperatura em Farenheit: %.2f", f);
            System.out.printf("Deseja repetir o teste? (y - sim / n - nao) : ");
            s = sc.next().charAt(0);
        } while (s != 'n');


    }
}
