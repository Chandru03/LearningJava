package customer;
import product.Product;
import java.util.ArrayList;
import java.util.List;

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

public class Customer {
    List<Product> cart = new ArrayList<>();

    public void addToCart(Product product) {
        cart.add(product);
        System.out.println("Added " + product.getName() + "to cart...");
    }

    public void removeFromCart(Product product) {
        System.out.println("Removed " + product.getName() + "from cart...");
        cart.remove(product);
    }

    public void buyItemsInCart() {
        int total = 0;
        for(Product item : cart){
            total += item.getPrice();
            item.sell(1);
        }

        System.out.println("Placed order :) \nPrice: " + total);

    }

}

