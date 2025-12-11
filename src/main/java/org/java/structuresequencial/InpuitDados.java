package org.java.structuresequencial;

import java.util.Locale;
import java.util.Scanner;

public class InpuitDados {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //Entrada de dados tipo STRING
        String name;
        System.out.print("Digite um nome: ");
        //Atribuindo o nome digitado a variavel 'name'
        name = sc.next();

        //Entrada de dados do tipo INT
        int x;
        System.out.print("Digite um numero inteiro: ");
        x = sc.nextInt();
        System.out.println(x);

        //Entrada de dados do tipo DOUBLE
        double y;
        //Permitindo inserir um numero com "."(ponto) = 23.5
        Locale.setDefault(Locale.US);
        System.out.print("Digite um numero com ponto flutuante: ");
        y = sc.nextDouble();
        System.out.println(y);

        //Fazer a leitura de um CARACTERE
        char c;
        System.out.print("Digite: ");
        c = sc.next().charAt(0);
        System.out.println(c);


        //Fazer a ler um texto até a quebra de linha
        String s1, s2, s3;

        System.out.print("Digite as palavras: ");
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }
}
