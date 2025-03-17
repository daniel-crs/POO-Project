package entities;

public class Electronics {

    private String name;
    private String mark;
    private double price;
    private String fabricator;
    private String model;
    private int yearLaunch;

    public Electronics(String name, String mark, double price, String fabricator, String model, int yearLaunch){
        this.name = name;
        this.mark = mark;
        this.price = price;
        this.fabricator = fabricator;
        this.model = model;
        this.yearLaunch = yearLaunch;
    }

    public String getName() {
        return name;
    }

    public void setNome(String name) {
        this.name = name;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFabricator() {
        return fabricator;
    }

    public void setFabricator(String fabricator) {
        this.fabricator = fabricator;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearLaunch() {
        return yearLaunch;
    }

    public void setYearLaunch(int yearLaunch) {
        this.yearLaunch = yearLaunch;
    }

    public String toString() {
        return "\n Nome: " + getName() + "\n Marca: " + getMark() + "\n Valor: R$" + String.format("%.2f", getPrice()) 
        + "\n Fabricante: " + getFabricator() + "\n Modelo: " + getModel() + "\n Ano de lançamento: " + getYearLaunch();
    }
}
