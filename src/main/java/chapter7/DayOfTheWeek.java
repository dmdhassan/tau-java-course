package chapter7;

import java.util.Scanner;

public class DayOfTheWeek {
    private static String[] days = {"sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday"};
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String args[]) {

        System.out.println("It is a " + getDay(days));
    }

    public  static String getDay(String[] arr) {
        System.out.println("Enter the day number ;");
        int number = scanner.nextInt();

        return arr[number - 1];
    }
}
