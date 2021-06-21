package com.bridgelabz;


import java.util.HashMap;
import java.util.Map;

//Pojo class(Plane old java object)
public class Order {

    enum OrderStatus {
        PLACED , DELIVERED ;
    }

    enum PaymentStatus{
        PAID , NOT_PAID ;
    }

    private String orderId;
    private OrderStatus orderStatus;
    private PaymentStatus paymentStatus;
    private String totalAmount;
    private Map<String, Integer> listOfFoodName = new HashMap<>();
    private Customer customer;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getListOfFoodName(String key) {
        return listOfFoodName.get(key);
    }

    public void setListOfFoodName(String listOfFoodName, Integer quantity) {
        this.listOfFoodName.put(listOfFoodName, quantity);
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", orderStatus=" + orderStatus +
                ", paymentStatus=" + paymentStatus +
                ", totalAmount='" + totalAmount + '\'' +
                ", listOfFoodName=" + listOfFoodName +
                ", customer=" + customer +
                '}';
    }
}