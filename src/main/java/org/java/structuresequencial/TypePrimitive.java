package org.java.structuresequencial;

import java.util.Locale;

public class TypePrimitive {
    public static void main(String[] args){
        //TIPOS PRIMITIVOS E SAÍDA DE DADOS
        byte exampleByte = 1;
        short exampleShort = 2;
        int exampleInt = 3;
        long exampleLong = 4;
        System.out.println("Numéricos:");

        System.out.println(
                "Byte: " + exampleByte +
                "\nShort: " + exampleShort +
                "\nInt: " + exampleInt +
                "\nLong: " + exampleLong);

        float exampleFloat = 6;
        double exampleDouble = 1.5;
        System.out.println(
                "Float: " + exampleFloat +
                        "\nDouble: " + exampleDouble
        );

        char exampleChar = 'a';
        String exampleString = "Meu nome é Hernando";
        System.out.println(
                "\nChar: " + exampleChar +
                "\nString: " + exampleString
        );

        //Definindo o idioma do programa
        Locale.setDefault(Locale.ENGLISH);
        //Sout formatado com 4 casas decimais
        // %s -> String / %d -> int / %f -> double/float
        System.out.printf("Formataçao: %.4f", exampleDouble);
    }
}
