package test;

import domain.Order;
import domain.Product;

public class Test {
    public static void main(String[] args) {
        
        Product product1 = new Product("Apples (5)", 5.500);
        Product product2 = new Product("Milk 1000mL", 5.700);
        Product product3 = new Product("Natural water 600mL", 1.600);
        Product product4 = new Product("Guacamole", 5.600);
        Product product5 = new Product("Nuts", 3.200);
        Product product6 = new Product("Meat", 17.800);
        Product product7 = new Product("TV 60'", 1200.800);
        Product product8 = new Product("Mustang 5000HP", 17000.800);
        Product product9 = new Product("Cheese", 7.300);
        Product product10 = new Product("Melon (2)", 9.200);
        Product product11 = new Product("Meat", 17.800);
        
        Order order1 = new Order();
        
        order1.addProduct(product1);
        order1.addProduct(product2);
        order1.addProduct(product3);
        order1.addProduct(product4);
        order1.addProduct(product5);
        order1.addProduct(product6);
        order1.addProduct(product7);
        order1.addProduct(product8);
        order1.addProduct(product9);
        order1.addProduct(product10);
        order1.addProduct(product11);
           
        order1.showOrder();
    }
}