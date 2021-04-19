package domain;

public class Order {

    private int idOrder;
    private Product products[];
    private static int orderCounter;
    private static final int MAX_PRODUCTS = 10;
    private int productCounter;

    public Order() {
        this.idOrder = ++Order.orderCounter;
        this.products = new Product[Order.MAX_PRODUCTS];
    }

    public void addProduct(Product product) {
        if (this.productCounter < MAX_PRODUCTS) {
            products[this.productCounter++] = product;
        } else {
            System.out.println("You already have " + MAX_PRODUCTS + " products, can't buy more.");
        }
    }
    
    public double calculateTotal() {
        double total = 0;
        for (int i = 0; i < this.productCounter; i++) {
            total += products[i].getPrice(); // total = total + producto.getPrice();
        } 
        
        return total;
    }
    
    public void showOrder() {
        System.out.println("Id Order: " + this.idOrder);
        
        double totalOrder = this.calculateTotal();
        System.out.println("Total price of order: $" + totalOrder);
        
        System.out.println("Products of the order: ");
        for (int i = 0; i < this.productCounter; i++) {
            System.out.println(products[i]);
        }
               
    }
}
