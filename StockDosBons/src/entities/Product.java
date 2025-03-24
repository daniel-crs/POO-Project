package entities;

public class Product {
    protected String name;
    protected double price;
    protected int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void exhibitionProductsData() {
        System.out.println("\n--- Ficha Literária ---");
        System.out.println("Nome do produto: " + name);
        System.out.println("Valor R$ : " + price);
        System.out.println("Qauntidade: " + quantity);
    }

}
