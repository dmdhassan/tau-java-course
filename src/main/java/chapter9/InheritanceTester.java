package chapter9;

public class InheritanceTester {
    public static void  main(String args[]) {
        Rectangle rectangle = new Rectangle();
        Square square = new Square();

        BirthDayCake birthDayCake = new BirthDayCake();

        birthDayCake.setCandles("eight");

        System.out.println(birthDayCake.getCandles());

    }
}
