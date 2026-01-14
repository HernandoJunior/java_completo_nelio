package org.java.POO.exercises;

import java.util.Locale;
import java.util.Scanner;

public class DolarExercise {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("What is dollar price? ");
        CurrencyConverter.dollarValue = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        CurrencyConverter.dollarBought = sc.nextDouble();

        double paymentTotal = CurrencyConverter.dollarCalculate();
        System.out.println("Amount to be paid in reais: " + paymentTotal);

    }


}
