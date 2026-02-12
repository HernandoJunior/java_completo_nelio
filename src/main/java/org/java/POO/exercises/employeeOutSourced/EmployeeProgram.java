package org.java.POO.exercises.employeeOutSourced;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EmployeeProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        List<Employee> employeeList = new ArrayList<>();

        for (int i = 0; i < n; i++){
            System.out.print("Outsourced (y/n) ?");
            String option = sc.next();
            option.toLowerCase();

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Hours: ");
            int hours = sc.nextInt();

            System.out.print("Value per hour: ");
            double valuePerHours = sc.nextDouble();


            if (option.toLowerCase().contains("y")){
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();

                Employee employeeOutsourced = new OutsourcedEmployee(name, hours, valuePerHours, additionalCharge);
                employeeList.add(employeeOutsourced);
            } else {
                Employee employee = new Employee(name, hours, valuePerHours);
                employeeList.add(employee);
            }
        }

        System.out.println("PAYMENTS: " );
        employeeList.stream()
                        .map(x -> x.getName() + " - " + "$ " + String.format("%.2f", x.payment()))
                .collect(Collectors.joining("\n"));
    }
}
