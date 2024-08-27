package com.gentech.constructor.parameterized;

class Product {
    int productId;
    String name;
    double price;
    int stock;

    Product(int productId, String name, double price, int stock){
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

    Sales(int saleId, String productName, int quantity, double totalPrice){
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

    Order(int orderId, int quantity, double totalPrice){
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

    Inventory(String name, String address, int productCount){
        System.out.println("-------Inventory------");
        System.out.println("Inventory name: "+name);
        System.out.println("Inventory address: "+address);
        System.out.println("Inventory product count: "+productCount);

    }
}


public class ProductDetails {
    public static void main(String args[]){
        Product product = new Product(1,"Shirt", 123.2, 10);
        Product product1 = new Product(1,"pant", 123.2, 10);

        Sales sales = new Sales(1,"electronic gadget", 2, 12.3);
        Sales sales1 = new Sales(1,"electronic gadget", 2, 12.3);


        Order order = new Order(1,2,100.23);
        Order order1 = new Order(2,2,100.23);

        Inventory inventory = new Inventory("Flipkart", "Attiguppe", 13343);
        Inventory inventory1 = new Inventory("Amazon", "Attiguppe", 13343);
    }
}
