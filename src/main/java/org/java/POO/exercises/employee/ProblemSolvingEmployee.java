package org.java.POO.exercises.employee;

import java.util.Locale;
import java.util.Scanner;

public class ProblemSolvingEmployee {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = sc.nextLine();

        System.out.print("Gross Salary: ");
        employee.grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

        double salaryLiquid = employee.netSalary();

        System.out.println("Employee: " + employee.name + ", $ " + salaryLiquid);

        System.out.println("Which percentage to increase salary? ");
        employee.tax = sc.nextDouble();

        double salaryWithTax = salaryLiquid + ((employee.tax/ 100) * salaryLiquid );

        System.out.println("Updated data: " + employee.name + ", $ " + salaryWithTax);
    }
}
