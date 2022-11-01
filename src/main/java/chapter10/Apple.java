package chapter10;

public class Apple extends Fruit{

    public Apple() {
        setCalories("20Kcal");
    }
    public void removeSeed() {
        System.out.println("remove seed");
    }

    @Override
    public void makeJuice() {

        System.out.println("A lemonade is made");
    }
}
