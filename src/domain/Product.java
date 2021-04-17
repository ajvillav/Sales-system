package domain;

public class Product {

    private final int idProduct;
    private String name;
    private double price;
    private static int productCounter;

    public Product() {
        this.idProduct = ++Product.productCounter;
    }

    public Product(String name, double price) {
        this();  //Hace referencia al constructor vacio, para que se aumente el contador
        this.name = name;
        this.price = price;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Product{idProduct=").append(idProduct);
        sb.append(", name=").append(name);
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
