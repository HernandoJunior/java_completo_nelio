package org.java.enums.exercises.order.entities;

import org.java.enums.exercises.order.enums.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Order {
    private Date moment;
    private OrderStatus status;
    private Client client;

    private List<OrderItem> orderItemList = new ArrayList<>();

    public Order() {
    }

    public Order(Date moment, OrderStatus status, Client client) {
        this.status = status;
        this.moment = moment;
        this.client = client;
    }

    public void addItem(OrderItem orderItem) {
        orderItemList.add(orderItem);
    }

    public void removeItem(OrderItem orderItem) {
        orderItemList.remove(orderItem);
    }

    public double total() {
        return orderItemList.stream()
                .filter(x -> x.subTotal() != 0)
                .mapToDouble(x -> x.subTotal())
                .sum();
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    @Override
    public String toString() {
        return orderItemList.stream()
                .map(o ->
                        o.getProduct().getName() + ", Quantity: "
                                + o.getQuantity() + ", Subtotal: "
                                + "$" + o.subTotal())
                .collect(Collectors.joining("\n"));
    }
}
