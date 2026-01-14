package org.java.POO.classIntroduction;

import java.util.Locale;
import java.util.Scanner;

public class ProblemProductSolving {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product product = new Product();

        System.out.println("Enter product data: ");

        System.out.print("Name: ");
        product.name = sc.nextLine();

        System.out.print("Price: ");
        product.price = sc.nextDouble();

        System.out.print("Quantity: ");
        product.quantity = sc.nextInt();

        System.out.println(product);

        System.out.print("Enter the number of products to be added in stock: ");
        int number = sc.nextInt();
        product.addProducts(number);

        System.out.print("Enter the number of products to be removed from stock: ");
        number = sc.nextInt();
        product.removeProducts(number);

    }
}
