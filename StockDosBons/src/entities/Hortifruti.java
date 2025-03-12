package entities;

public class Hortifruti {
    private String name;
    private double price;
    private int quantity;

    public Hortifruti(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

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

    public double totalValueHortifruti() {
        return price * quantity;
    }

    public String toString() {
        return "\n Nome: " + getName() + "\n Valor: R$" + String.format("%.2f", getPrice()) + "\n Quantidade:"
                + quantity + " unidades\n Total: R$" + String.format("%.2f", totalValueHortifruti());
    }
}
