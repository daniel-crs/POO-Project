package entities;

public class Electronics extends Product {

    private String mark;
    private String fabricator;
    private String model;
    private int yearLaunch;

    public Electronics() {
        super();
    }

    public Electronics( String name, double price, int quantity, String mark, String fabricator, String model, int yearLaunch) {
        super(name, price, quantity);
        try{
            this.mark = mark;
            this.fabricator = fabricator;
            this.model = model;
            this.yearLaunch = yearLaunch;
        }catch(IllegalArgumentException e){
            System.err.println("Input Electronics() values is invalid: " + e);
        }
    }

    public String getMark() {
        return mark;
    }
    public String getFabricator() {
        return fabricator;
    }
    public String getModel() {
        return model;
    }
    public int getYearLaunch() {
        return yearLaunch;
    }

    @Override
    public void exhibitionProductsData() {
        super.exhibitionProductsData();

        System.out.println("Marca: " + mark);
        System.out.println("Fabricante: " + fabricator);
        System.out.println("Modelo: " + model);
        System.out.println("Ano de lançamento: " + yearLaunch);
    }
}
