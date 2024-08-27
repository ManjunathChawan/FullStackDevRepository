package com.gentech.assignments;

class Product {
    int productId;
    String name;
    double price;
    int stock;
}

class Sales {
    int saleId;
    Product product;
    int quantity;
    double totalPrice;
}

class Order {
    int orderId;
    Product product;
    int quantity;
    double totalPrice;
}

class Inventory {
    String name;
    String address;
    int productCount;
}
public class ProductDetails {
    public static void main(String[] args){
        Product product = new Product();
        product.productId = 1;
        product.name = "Laptop";
        product.price = 1000.0;
        product.stock = 50;

        System.out.println("----------Product----------");
        System.out.println("Product ID: " + product.productId);
        System.out.println("Product name: " + product.name);
        System.out.println("Product price: " + product.price);
        System.out.println("Product stock: " + product.stock);
        System.out.println("--------------------------------------");

        Order order = new Order();
        order.orderId = 101;
        order.product = product;
        order.quantity = 2;
        order.totalPrice = product.price * order.quantity;

        System.out.println("----------Order----------");
        System.out.println("Order ID: " + order.orderId);
        System.out.println("Product name: " + order.product.name);
        System.out.println("Quantity: " + order.quantity);
        System.out.println("Total price: " + order.totalPrice);
        System.out.println("--------------------------------------");

        Sales sale = new Sales();
        sale.saleId = 201;
        sale.product = product;
        sale.quantity = 1;
        sale.totalPrice = product.price * sale.quantity;

        System.out.println("----------Sale----------");
        System.out.println("Sale ID: " + sale.saleId);
        System.out.println("Product name: " + sale.product.name);
        System.out.println("Quantity: " + sale.quantity);
        System.out.println("Total price: " + sale.totalPrice);
        System.out.println("--------------------------------------");

        Inventory inventory = new Inventory();
        inventory.name = "Flipkart";
        inventory.address= "#2, 2nd cross Attiguppe Bengaluru";
        inventory.productCount = 100;

        System.out.println("-------Inventory------");
        System.out.println("Inventory name: "+inventory.name);
        System.out.println("Inventory address: "+inventory.address);
        System.out.println("Inventory product count: "+inventory.productCount);

    }




}
