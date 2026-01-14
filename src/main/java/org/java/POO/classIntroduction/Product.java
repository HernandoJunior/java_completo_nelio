package org.java.POO.classIntroduction;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock(){
        return price * quantity;
    }
    public void addProducts(int quantity){
        this.quantity += quantity;
        System.out.println("Updated data: TV: " + price + ", " + quantity + " units, Total: $" + totalValueInStock());
    }
    public void removeProducts(int numberRemove){
        if (numberRemove > quantity){
            System.out.println("Is not possible remove this quantity. Stock: " + quantity);
        } else {
            quantity-= numberRemove;
            System.out.println("Product data: " + name + ", " + quantity + " units," + String.format(" Total: $ %.1f", totalValueInStock()));
        }
    }
    public String toString(){
        return "Product data: " + name + ", " + quantity + " units," + String.format(" Total: $ %.2f", totalValueInStock());

    }
}
