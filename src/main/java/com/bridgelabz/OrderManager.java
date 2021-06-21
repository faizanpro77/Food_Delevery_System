package com.bridgelabz;

import java.util.*;

public class OrderManager {

    List<Order> listOfOrders = new ArrayList<>();

    public void placeOrder() {
        Order order = new Order();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter order ID : ");
        String id = scanner.nextLine();
        order.setOrderId(id);
        order.setOrderStatus(Order.OrderStatus.PLACED);
        order.setPaymentStatus(Order.PaymentStatus.NOT_PAID);

        Customer customer = new Customer();
        System.out.println("Enter the Customer Name : ");
        String customerName = scanner.nextLine();
        customer.setNameOfCustomer(customerName);
        System.out.println("Enter the Customer address : ");
        String customerAddress = scanner.nextLine();
        customer.setAddress(customerAddress);
        System.out.println("Enter the Customer Phone Number : ");
        String customerPhoneNumber = scanner.nextLine();
        customer.setPhoneNumber(customerPhoneNumber);
        System.out.println("Enter the Customer Email ID : ");
        String customerEmailId = scanner.nextLine();
        customer.setEmailId(customerEmailId);
        order.setCustomer(customer);

        String foodName = "";
        Integer quantity = 0;
        while (!foodName.equalsIgnoreCase("Stop")) {
            System.out.println("Enter the Food Name or type stop for exit : ");
            foodName = scanner.next();
            if(!foodName.equalsIgnoreCase("Stop")) {
                System.out.println("Enter the Quantity : ");
                quantity = scanner.nextInt();
                order.setListOfFoodName(foodName, quantity);
            }
        }
        listOfOrders.add(order);
        System.out.println(listOfOrders);
    }
}

