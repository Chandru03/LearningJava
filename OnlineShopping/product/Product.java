package product;
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

public class Product {
    private int pid;
    private String name;
    private float price;
    private int availableQuantity;

    public Product (int pid, String name, float price, int availableQuantity){
        this.pid = pid;
        this.name = name;
        this.price = price;
        this.availableQuantity = availableQuantity;
        
        System.out.println("Product created:\n" + this.pid + " " + this.name);
    }

    //getter
    public int getPid() {
        return pid;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public float getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void restock(int quantity) {
        this.availableQuantity += quantity;
        System.out.println("Restock completed: "+this.name+" "+this.availableQuantity);
    }

    public void sell(int quantity) {
        this.availableQuantity -= quantity;
        System.out.println("Sold: "+this.name+" - "+this.availableQuantity);
    }
}
