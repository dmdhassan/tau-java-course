package chapter9;

public class BirthDayCake extends Cake{
    String candles;

    public BirthDayCake() {
        super("vanilla");
    }

    public String getCandles() {
        return candles;
    }

    public void setCandles(String candles) {
        this.candles = candles;
    }
}
