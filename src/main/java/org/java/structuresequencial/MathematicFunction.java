package org.java.structuresequencial;

import java.util.Locale;

public class MathematicFunction {
    // java.lang.math;
    public static void main(String[] args) {
        int x = 5;
        int y = 4;

        // A recebe a raiz quadrada de X
        double a = Math.sqrt((double) x);

        // B recebe x na potencia y
        double b = Math.pow(x, y);

        // C recebe o valor ansoluto de X, sem o negativo caso exista
        double c = Math.abs(x);

        Locale.setDefault(Locale.ENGLISH);
        System.out.printf("Valor Razia quadrada A: %.3f \n", a);
        System.out.println("Valor X na potencia Y: " + b);
        System.out.println("Valor absoluto de X: " + c);

        // BHASKARA
        double delta = (-b + Math.pow(b, 2)) / 4*a*c;
        double valorBhaskaraPositivo = (b + Math.sqrt(delta)) / 4*a*c;
        double valorBhaskaraNegativo = (-b + Math.sqrt(delta)) / 4*a*c;
        System.out.printf("Valor de delta: %.2f", delta);
        System.out.println("\nValor Bhaskara positivo: " + valorBhaskaraPositivo +
                "\nValor Bhaskara negativo: " + valorBhaskaraNegativo);
    }
}
