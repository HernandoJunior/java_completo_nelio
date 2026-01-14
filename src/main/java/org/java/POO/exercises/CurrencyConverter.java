package org.java.POO.exercises;

public class CurrencyConverter {

    public static double dollarValue;
    public static double dollarBought;

    public static double dollarCalculate(){
        double total = dollarValue * dollarBought;
        return  total + (total * 0.06);
    }
}
