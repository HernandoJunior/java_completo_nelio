package org.java.structureconditional.exercises;

import java.util.Scanner;

public class ConditionalExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        //Exercise 1
        number = sc.nextInt();
        if (number > 0) System.out.println("Nao negativo");
        else {
            System.out.println("Negativo");
        }

        //Exercise 2
        number = sc.nextInt();
        if (number % 2 == 0) System.out.println("PAR");
        else {
            System.out.println("Impar");
        }

        //Exercise 3
        number = sc.nextInt();
        int number2 = sc.nextInt();
        int divisao;
        if (number > number2 && number % number2 == 0) {
            System.out.println("Sao numeros multiplos");
        } else if (number2 > number && number2 % number == 0) {
            System.out.println("Sao numeros multiplos");
        } else {
            System.out.println("Nao sao multiplos");
        }

        //Exercise 4
        int timeInitial, timeFinal, hourDuration;
        timeInitial = sc.nextInt();
        timeFinal = sc.nextInt();
        if (timeInitial < timeFinal) {
            hourDuration = timeInitial - timeFinal;
            System.out.printf("A duraçao do jogo foi de: %d horas.", hourDuration);
        } else if (timeInitial == timeFinal) {
            System.out.println("O jogo durou 24 horas");
        } else {
            hourDuration = 24 - timeInitial + timeFinal;
            System.out.printf("A duraçao do jogo foi de: %d horas.", hourDuration);
        }

        //Exercise 5
        int codeNumber, amountProduct;
        double price, priceTotal;
        codeNumber = sc.nextInt();
        amountProduct = sc.nextInt();
        switch (codeNumber) {
            case 1:
                price = 4;
                priceTotal = price * amountProduct;
                System.out.println("Total: " + priceTotal);
                break;
            case 2:
                price = 4.50;
                priceTotal = price * amountProduct;
                System.out.println("Total: " + priceTotal);
                break;
            case 3:
                price = 5;
                priceTotal = price * amountProduct;
                System.out.println("Total: " + priceTotal);
                break;
            case 4:
                price = 2;
                priceTotal = price * amountProduct;
                System.out.println("Total: " + priceTotal);
                break;
            case 5:
                price = 1.50;
                priceTotal = price * amountProduct;
                System.out.println("Total: " + priceTotal);
                break;
            default:
                System.out.println("Produto inválido");
        }

        //Exercise 6
        double aleatoryNumber;
        aleatoryNumber = sc.nextDouble();
        if (aleatoryNumber >= 0 && aleatoryNumber <= 25){
            System.out.println("Intervalo [0, 25]");
        } else if (aleatoryNumber > 25 && aleatoryNumber <= 50) {
            System.out.println("Intervalo [25, 50]");
        } else if (aleatoryNumber >= 75 && aleatoryNumber <= 100) {
            System.out.println("Intervalo [75, 100]");
        }
        else {
            System.out.println("Fora do intervalo");
        }
    }
}
