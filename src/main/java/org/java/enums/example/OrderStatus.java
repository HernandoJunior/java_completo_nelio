package org.java.enums.example;

public enum OrderStatus {
    PENDING_PAYMENT(0),
    PROCESSING(1),
    SHIPPED(2),
    DELIVERED(3);

    private final int value;

    //Constructor private
    OrderStatus(int value){
        this.value = value;
    }
}
