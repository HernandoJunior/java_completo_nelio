package org.java.lists.exercises;

import java.util.*;

public class EmployeeExercise {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        List<Employee> employeeList = new ArrayList<>();

        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i + 1) + " : ");
            System.out.print("ID" + " : ");
            int id = sc.nextInt();

            sc.nextLine();
            System.out.print("Name" + " : ");
            String name = sc.nextLine();

            System.out.print("Salary" + " : ");
            double salary = sc.nextDouble();

            employeeList.add(new Employee(name, id, salary));
            sc.nextLine();
        }

        System.out.println("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();

        Employee employee = employeeList.stream()
                .filter(x -> x.getId().equals(id))
                .findFirst()
                .orElse(null);

        System.out.println("Enter the porcentage: ");
        double porcentage = sc.nextDouble();

        employee.increaseSalary(porcentage);

        System.out.println("List of employees: ");
        for (Employee employee1 : employeeList){
            System.out.println(employee1.getId() + ", " + employee1.getName() + ", " + employee1.getSalary());
        }
    }
}
