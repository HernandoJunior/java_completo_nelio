package org.java.enums.example;

import java.time.LocalDate;

public class Order {
    private Integer id;
    private LocalDate localDate;
    private OrderStatus status;

    public Order(){}
    public Order(Integer id, LocalDate localDate, OrderStatus status){
        this.id = id;
        this.localDate = localDate;
        this.status = status;
    }


    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", localDate=" + localDate +
                ", status=" + status +
                '}';
    }
}
