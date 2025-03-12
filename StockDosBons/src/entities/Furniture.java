package entities;

public class Furniture {
    private String name;
    private String model;
    private Double price;
    private Double height;
    private Double width;
    private String material;
    private String fabricator;
    private String color;
    private Int age;

  

    public Furniture(String name, String model, Double price, Double height, Double width, String material,
    String fabricator, String color, Int age) {
    this.name = name;
    this.model = model;
    this.price = price;
    this.height = height;
    this.width = width;
    this.material = material;
    this.fabricator = fabricator;
    this.color = color;
    this.age = age;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getModel() {
        return model;
    }


    public void setModel(String model) {
        this.model = model;
    }


    public Double getPrice() {
        return price;
    }


    public void setPrice(Double price) {
        this.price = price;
    }


    public Double getHeight() {
        return height;
    }


    public void setHeight(Double height) {
        this.height = height;
    }


    public Double getWidth() {
        return width;
    }


    public void setWidth(Double width) {
        this.width = width;
    }


    public String getMaterial() {
        return material;
    }


    public void setMaterial(String material) {
        this.material = material;
    }


    public String getFabricator() {
        return fabricator;
    }


    public void setFabricator(String fabricator) {
        this.fabricator = fabricator;
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public Int getAge() {
        return age;
    }


    public void setAge(Int age) {
        this.age = age;
    }

}
