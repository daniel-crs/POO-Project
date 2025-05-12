package entities;

public class Product {
    protected String name;
    protected double price;
    protected int quantity;

    public Product() {
    }

    public Product(String name, double price, int quantity) {
        try {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        } catch (IllegalArgumentException e) {
            System.err.println("The input Product() values ​​are invalid: "+ e.getMessage());
        }
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }

    public void exhibitionProductsData() {
        System.out.println("\n--- Ficha do Produto ---");
        System.out.println("Nome do produto: " + name);
        System.out.println("Valor R$ : " + price);
        System.out.println("Quantidade: " + quantity);
    }

}
