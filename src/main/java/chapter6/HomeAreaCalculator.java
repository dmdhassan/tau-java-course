package chapter6;
/*
    write a class that creates instance of the Rectangle class
    to find the total area of two rooms in a house
 */
public class HomeAreaCalculator {
    public static void main(String args[]) {
        /*
            RECTANGLE 1
        */
        Rectangle room1 = new Rectangle();
        room1.setWidth(25);
        room1.setLength(50);
        double areaOfRoom1 = room1.calculateArea();

         /*
            RECTANGLE 2
        */
        Rectangle room2 = new Rectangle(75, 30);
        double areaOfRoom2 = room2.calculateArea();

        double totalArea = areaOfRoom1 + areaOfRoom2;

        System.out.println("Area of two rooms is : " + totalArea);
    }
}
