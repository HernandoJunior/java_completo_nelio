package org.java.enums.exercises.order;

import org.java.enums.exercises.order.entities.Client;
import org.java.enums.exercises.order.entities.Order;
import org.java.enums.exercises.order.entities.OrderItem;
import org.java.enums.exercises.order.entities.Product;
import org.java.enums.exercises.order.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class OrderProgram {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        OrderItem orderItem;

        //Format date input
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter client data: ");
        System.out.print("\nName: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Birth Date : ");
        Date birthDate = sdf.parse(sc.nextLine());

        //Create a client
        Client client = new Client(name, email, birthDate);

        System.out.print("Status: ");
        String status = sc.nextLine();

        //Create a order
        Order order = new Order(new Date(), OrderStatus.valueOf(status), client);

        System.out.print("How many items to this order ?  ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            System.out.print("Enter #" + (i+1) + " item data: \n");
            System.out.print("Product name: ");
            String nameProduct = sc.next();

            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            Product product = new Product(nameProduct, productPrice);
            orderItem = new OrderItem(quantity, product.getPrice(), product);
            order.addItem(orderItem);

        }

        System.out.println("Order Summary: ");
        System.out.println("Order moment: " + order.getMoment());
        System.out.println("Order status: " + order.getStatus());
        System.out.println("Client: " + client.getName() +", (" + sdf.format(client.getBirthDate()) + ") - " + client.getEmail());
        System.out.println("Order Items: \n" + order);
        System.out.println("Total Price: " + order.total());

    }
}
