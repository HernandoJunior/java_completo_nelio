package org.java.POO.exercises.student;

import java.util.Locale;
import java.util.Scanner;

public class ProblemSolvingStudent {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student1 = new Student();
        String name = sc.nextLine();
        student1.setName(name);
        ;
        double note1  = sc.nextDouble();
        student1.setNote1(note1);

        double note2  = sc.nextDouble();
        student1.setNote2(note2);

        double note3  = sc.nextDouble();
        student1.setNote3(note3);

        double finalMedia = student1.total();

        if (finalMedia >= 60.0){
            System.out.println("Final Grade = " + finalMedia + "\nPASS");
        } else {
            System.out.println("Final Grade = " + finalMedia + "\nFAILED");
            double valueMissing = 60.00 - finalMedia ;
            System.out.printf("Missing: %.2f%n", valueMissing);
        }
    }
}
