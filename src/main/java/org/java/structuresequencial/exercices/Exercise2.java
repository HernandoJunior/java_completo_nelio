package org.java.structuresequencial.exercices;

import java.util.Locale;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // EXERCICIO 01 -> Read two integer numbers and sum then;
        int a, b, sum;
        a = sc.nextInt();
        b = sc.nextInt();
        sum = a + b;
        System.out.println("SOMA: " + sum);

        //Exercicio 02 -> Calculate circle area
        double raio;
        System.out.println("Informe o raio do raio: ");
        raio = sc.nextDouble();

        double pi = 3.14159;
        double area = pi * (Math.pow(raio, 2));
        System.out.printf("Área do circulo: %.3f", area);

        //Exercicio 03 -> Read four integers numbers and show the difference at product between by A and B, C and D.
        int c, d;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        int difference = a * b - c * d;
        System.out.println("Diferença: " + difference);

        //Exercicio 04 -> Read the number at functionary, your hours worked and your value per hour. Calculate salary.
        int number, hours;
        double salary, valuePerHours;

        System.out.println("Informe o numero do funcionário: ");
        number = sc.nextInt();

        System.out.println("Informe as horas trabalhadas: ");
        hours = sc.nextInt();

        System.out.println("Informe o valor por hora: ");
        valuePerHours = sc.nextDouble();

        salary = valuePerHours * hours;
        System.out.println("Número do funcionario: " + number);
        System.out.printf("Salário: $%.2f", salary);

        //Exercicio 05
        int codePart1, numberParts1;
        double valuePart1;
        codePart1 = sc.nextInt();
        numberParts1 = sc.nextInt();
        valuePart1 = sc.nextDouble();

        int codePart2, numberParts2;
        double valuePart2;
        codePart2 = sc.nextInt();
        numberParts2 = sc.nextInt();
        valuePart2 = sc.nextDouble();

        Locale.setDefault(Locale.US);
        System.out.println("Valor a pagar peça 1: R$ " + valuePart1*numberParts1);
        System.out.println("Valor a pagar peça 2: R$ " + valuePart2*numberParts2);

        //Exercicio 06 -> Read three numbers with flutuante point precision
        Locale.setDefault(Locale.US);

        double A, B, C;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        double triangleArea = A * C;
        double circleRaio = pi * (Math.pow(C, 2));
        double trapeziusArea = ((A * B) * C) / 2;
        double squareArea = Math.pow(B, 2);
        double retangleArea = A * B;
        System.out.printf(
                "Área do triangulo: %.3f" +
                        "\nRaio do circulo: %.3f" +
                        "\nÁrea do trápezio: %.3f" +
                        "\nÁrea do quadrado: %.3f" +
                        "\nÁrea do retangulo: %.3f",
                triangleArea, circleRaio, trapeziusArea, squareArea, retangleArea);
    }
}
