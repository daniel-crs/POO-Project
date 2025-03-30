package entities;

public class Hortifruti extends Product {
    private double MiddleWeight;
    private double TotalWeight;

    public  Hortifruti() {
        super();
    }

    public Hortifruti(String name, double price, int quantity, double MiddleWeight) {
        super(name, price, quantity);
        this.MiddleWeight = MiddleWeight;
    }

    public double getMiddleWeight() {
        return MiddleWeight;
    }

    public void setMiddleWeight(double MiddleWeight) {
        this.MiddleWeight = MiddleWeight;
    }

    public double getTotalWeight() {
        return TotalWeight;
    }

    public void setTotalWeight(double TotalWeight) {
        this.TotalWeight = TotalWeight;
    }

    public void updateTotalValue() {
        TotalWeight = (MiddleWeight * quantity) / 1000;
    }

    public void exhibitionHortifruti() {
        updateTotalValue();

        System.out.println("\n--- Ficha do Produto ---");
        System.out.println("Nome do produto: " + name);
        System.out.println("Valor por kg R$ : " + price);
        System.out.println("Peso total: " + TotalWeight + "kg");
        System.out.println("Valor total R$: " + (TotalWeight * price));
    }
}
