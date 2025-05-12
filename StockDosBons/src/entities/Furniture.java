package entities;

public class Furniture extends Product {
    private double height;
    private double width;
    private String material;
    private int age;

    public Furniture() {
        super();
    }

    public Furniture(String name, double price, int quantity, double height, double width, String material, int age) {
        super(name, price, quantity);
        try{
            this.height = height;
            this.width = width;
            this.material = material;
            this.age = age;
        }catch(IllegalArgumentException e){
            System.err.println("Input Furniture() values is invalid: " + e);
        }
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

    @Override
    public void exhibitionProductsData() {
        super.exhibitionProductsData();
        System.out.println("Material: " + getMaterial());
        System.out.println("size:(" + String.format("%.1f", getWidth()) +
                "x" + String.format("%.1f", getHeight()) + ")m");
        System.out.println("age: " + getAge());
    }

}
