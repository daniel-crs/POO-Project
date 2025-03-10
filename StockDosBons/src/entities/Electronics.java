package entities;

public class Electronics {
    private String names;
    private double price;
    private double energyCost;
    private String fabricator;

    public String getNames() {
        return names;
    }

    public void setNames(String names){
        this.names=names;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price){
        this.price=price;
    }

    public double getEnergyCost() {
        return energyCost;
    }

    public void setEnergyCost(double energyCost) {
        this.energyCost = energyCost;
    }

    public String getFabricator() {
        return fabricator;
    }

    public void setFabricator(String fabricator) {
        this.fabricator = fabricator;
    }
}