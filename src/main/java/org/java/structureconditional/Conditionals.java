package org.java.structureconditional;

import java.util.Locale;
import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Escolhe um numero informar o dia da semana: ");
        int numberAtDay = sc.nextInt();
        String dayAtWeek = null;

        switch (numberAtDay) {
            case 1:
                dayAtWeek = "domingo";
                break;

            case 2:
                dayAtWeek = "segunda";
                break;
            case 3:
                dayAtWeek = "terça";
                break;
            case 4:
                dayAtWeek = "terça";
                break;
            case 5:
                dayAtWeek = "terça";
                break;
            case 6:
                dayAtWeek = "terça";
                break;
            case 7:
                dayAtWeek = "terça";
                break;
            default:
                dayAtWeek = "valor invalido";
                break;
        }
        System.out.println("Dia escolhido: " + dayAtWeek);
    }
}
