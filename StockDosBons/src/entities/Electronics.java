package entities;

public class Electronics extends Product {

    private String mark;
    private String fabricator;
    private String model;
    private int yearLaunch;

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
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
