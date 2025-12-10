package org.java.introduction;

import java.math.BigDecimal;
import java.util.Scanner;

public class MediaArithmetic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a primeira nota: ");
        BigDecimal number1 = sc.nextBigDecimal();

        System.out.print("Informe a segunda nota: ");
        BigDecimal number2 = sc.nextBigDecimal();

        BigDecimal media = (number1.add(number2))
                .divide(BigDecimal.valueOf(2));

        System.out.println("Media final: " + media);

    }
}
