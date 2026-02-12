package org.java.enums.example;

import java.time.LocalDate;

public class OrderProgram {
    public static void main(String[] args) {
        Order order = new Order(100, LocalDate.now(), OrderStatus.PENDING_PAYMENT);
        System.out.println("Objeto: " + order);

        //;
        OrderStatus order2 = OrderStatus.PENDING_PAYMENT;
        //
        OrderStatus s1 = OrderStatus.valueOf("SHIPPED");
        //
        OrderStatus[] s2 = OrderStatus.values();

        System.out.println("OrderStatus: " + order2);
        System.out.println("OrderStatus captured by String: " + s1);
    }
}
