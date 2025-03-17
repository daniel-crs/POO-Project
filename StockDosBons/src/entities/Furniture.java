package entities;

public class Furniture {
    private String name;
    private double price;
    private double height;
    private double width;
    private String material;
    private int age;

    public Furniture(String name, double price, double height, double width, String material, int age) {
        this.name = name;
        this.price = price;
        this.height = height;
        this.width = width;
        this.material = material;
        this.age = age;
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

    public void setPrice()
    {
        this.price = price;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String toString() {
    	
    	return "name :"+getName()+"\n age:"+getAge()+"\n size: "+String.format(	".2f",getHeight())+"x"+String.format(".2f",getWidth())+"m"+
    	"\nPrice:"+String.format(".2f",getPrice())+"\n material:"+getMaterial();
    }
}
