package chapter7;

import java.util.Scanner;

public class Grades {
    private static int[] grades;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.println("how many numbers will you like to add .");
        int LENGTH = scanner.nextInt();
        grades = new int[LENGTH];

        getGrades();

        System.out.println("Average: " + String.format("%.2f", getAvg(grades)));
        System.out.println("Highest: " + getHighest(grades));
        System.out.println("Highest: " + getLowest(grades));
    }

    public  static void getGrades() {
        for (int i = 0; i < grades.length; i++) {
            int idx = i + 1;
            System.out.println("Enter grade #" + idx);
            int grade = scanner.nextInt();

            grades[i] = grade;
        }
    }

    public static double getAvg(int[] arr) {
        double total = 0;
        for (int value: arr) {
            total = total + value;
        }

        return  (total / arr.length);
    }

    public  static int getHighest(int[] arr) {
        int highest = arr[0];
        for (int value: arr) {
            if (value > highest) {
                highest = value;
            }
        }

        return highest;
    }

    public  static int getLowest(int[] arr) {
        int lowest = arr[0];
        for (int value: arr) {
            if (value < lowest) {
                lowest = value;
            }
        }

        return lowest;
    }
}
