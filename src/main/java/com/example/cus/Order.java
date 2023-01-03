package com.example.cus;

import jakarta.persistence.*;

@Entity
@Table(name="Orderdb")

public class Order {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column
    private int orderId;

    @Column
    private double price;

    @Column
    private String cusId;
    public Order(){

    }

    public Order(double price, String cusId) {
        this.price = price;
        this.cusId = cusId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getCusId() {
        return cusId;
    }

    public void setCusId(String cusId) {
        this.cusId = cusId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", price=" + price +
                ", cusId='" + cusId + '\'' +
                '}';
    }
}
