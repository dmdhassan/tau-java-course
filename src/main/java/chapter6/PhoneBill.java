package chapter6;

public class PhoneBill {
    private int id;
    private double baseCost;

    private double overage;

    public PhoneBill() {
        id = 0;
        baseCost = 0;
        overage = 0;
    }

    public PhoneBill(int id) {
        this.id = id;
    }

    public PhoneBill(int id, double baseCost, double overage) {
        this.id = id;
        this.baseCost = baseCost;
        this.overage = overage;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setBaseCost(int baseCost) {
        this.baseCost = baseCost;
    }

    public double getBaseCost() {
        return this.baseCost;
    }


    public double calculateOverage() {
        return 0.25 * overage;
    }

    public double calculateTax() {
        return  0.15 * (calculateOverage() + calculateOverage());
    }

    public double calculateTotal() {
        return baseCost + calculateOverage() + calculateTax();
    }


}
