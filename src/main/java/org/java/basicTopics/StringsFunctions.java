package org.java.basicTopics;

import javax.sound.midi.Soundbank;

public class StringsFunctions {
    public static void main(String[] args) {
        String string = " _AbC DeF GhI JkL__ ";

        // Convert caracteres to uppercase
        System.out.println("ToUpperCase: " + string.toUpperCase());

        // Convert caracteres to lowercase
        System.out.println("ToLowerCase" + string.toLowerCase());

        // Elminied spaces in initial and final string
        System.out.println("Trim: " + string.trim());

        // Recort the string with position initial at the caractere
        System.out.println("Substring: " + string.substring(2));

        // Recort the string between initial position and final position at the caractere
        System.out.println("Substring with Initial and Final: " + string.substring(2, 8));

        // Recort to vector string with informed separator
        String[] s = string.split(" ");
        System.out.println("Split 0:" + s[0] +"\nSplit 1: " + s[1]);

        // Change the caractere to value informed
        System.out.println("Replace: " + string.replace('D', 'X'));
        System.out.println("Replace Substring: " + string.replace("AbC", "XYZ"));

        // Return IndefOf at first value position
        System.out.println("IndexOf: " + string.indexOf("DeF"));

        // Return IndexOf at last value position
        System.out.println("LastIndexOf: " + string.lastIndexOf("Jk"));

    }
}
