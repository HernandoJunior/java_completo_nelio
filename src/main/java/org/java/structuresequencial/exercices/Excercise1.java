package org.java.structuresequencial.exercices;

import java.util.Locale;

public class Excercise1 {
    public static void main(String[] args){
        String product1 = "Computer";
        String product2 = "Office Desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf("Products: " +
                "\n%s, which price is $ %.2f" +
                "\n%s, which price is $ %.2f" +
                "\nRecord: %d years old, code %d and gender %s" +
                "\n\nMeasue with eight decimal places: %.8f" +
                "\nRoudede (three decimals places): %.3f",
                 product1, price1, product2, price2, age, code, gender, measure, measure);

        Locale.setDefault(Locale.ENGLISH);
        System.out.printf("\nUS decimal point: %.3f", measure);
    }
}
