/*
 Simple online shopping system
 - manage products and orders
 - each product has
    - pid
    - name
    - price
    - availableQuantity

 - customer can
    - add products to cart
    - remove products from cart
    - place order
 - system should keep track of inventory and update product

 */

 import product.*;
 import customer.*;


 public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(0, "MacBook Air", 60000, 10);
        Product product2 = new Product(1, "iPhone 11", 70000, 10);
        Product product3 = new Product(2, "iPad 10th Gen", 70000, 10);

        Customer Steve = new Customer();

        Steve.addToCart(product3);
        Steve.addToCart(product1);

        Steve.buyItemsInCart();

    }
 }