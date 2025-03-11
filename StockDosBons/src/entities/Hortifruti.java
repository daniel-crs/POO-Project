package entities;

public class Hortifruti {
    private String name;
    private double pricePerKilo;
    private int quantity;

    public Hortifruti(String name, double pricePerKilo, int quantity) {
        this.name = name;
        this.pricePerKilo = pricePerKilo;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPricePerKilo() {
        return pricePerKilo;
    }

    public void setPricePerKilo(double pricePerKilo) {
        this.pricePerKilo = pricePerKilo;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
