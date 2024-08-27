package com.gentech.constructor.noargs;

class Product {
    int productId;
    String name;
    double price;
    int stock;

    Product(){
        productId = 1;
        name = "Laptop";
        price = 1000.0;
        stock = 50;

        System.out.println("----------Product----------");
        System.out.println("Product ID: " + productId);
        System.out.println("Product name: " + name);
        System.out.println("Product price: " + price);
        System.out.println("Product stock: " + stock);
        System.out.println("--------------------------------------");
    }
}

class Sales {
    int saleId;
    String productName;
    int quantity;
    double totalPrice;

    Sales(){
        saleId = 201;
        productName = "Electronic gadget";
        quantity = 1;

        System.out.println("----------Sale----------");
        System.out.println("Sale ID: " + saleId);
        System.out.println("Product name: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("--------------------------------------");
    }
}

class Order {
    int orderId;
    int quantity;
    double totalPrice;

    Order(){
        orderId = 101;
        quantity = 2;
        totalPrice = quantity;

        System.out.println("----------Order----------");
        System.out.println("Order ID: " + orderId);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total price: " + totalPrice);
        System.out.println("--------------------------------------");
    }
}

class Inventory {
    String name;
    String address;
    int productCount;

    Inventory(){
        name = "Flipkart";
        address= "#2, 2nd cross Attiguppe Bengaluru";
        productCount = 100;

        System.out.println("-------Inventory------");
        System.out.println("Inventory name: "+name);
        System.out.println("Inventory address: "+address);
        System.out.println("Inventory product count: "+productCount);

    }
}

public class ProductDetails {
    public static void main(String[] args){
        Product product=new Product();
        Order order=new Order();
        Sales sales=new Sales();
        Inventory inventory=new Inventory();
    }

}
