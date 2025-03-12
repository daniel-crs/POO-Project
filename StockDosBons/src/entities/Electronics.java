package entities;

public class Electronics {

    private String nome;
    private String mark;
    private double price;
    private String fabricator;
    private String model;
    private int yearLaunch;

    public void Electronics(String nome, String mark, double price, String fabricator, String model, int yearLaunch){
        this.nome = nome;
        this.mark = mark;
        this.price = price;
        this.fabricator = fabricator;
        this.model = model;
        this.yearLaunch = yearLaunch;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

}
