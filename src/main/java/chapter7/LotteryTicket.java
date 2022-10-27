package chapter7;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {
    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NO = 69;

    public static void main(String args[]) {
        int[] tickets = generateNumbers();
        Arrays.sort(tickets);
        printTickets(tickets);
    }

    public static int[] generateNumbers() {
        int[] ticket = new int[LENGTH];
        Random random = new Random();

        for (int i = 0; i < LENGTH; i++) {
            int randomNumber;

            do {
                randomNumber = random.nextInt(MAX_TICKET_NO) + 1;
            } while (search(ticket, randomNumber));
            ticket[i] = randomNumber;
        }

        return ticket;
    }

    public  static  boolean search(int[] arr, int searchItem) {
        for(int value: arr) {
            if (value == searchItem) {
                return true;
            }
        }

        return false;
    }

    public static boolean binarySearch(int[] arr, int searchItem) {
        Arrays.sort(arr);
        int index = Arrays.binarySearch(arr, searchItem);

        if (index >= 0) {
            return true;
        }

        return false;
    }

    public static void printTickets(int ticket[]) {
        for (int i = 0; i < ticket.length; i++) {
            System.out.print(ticket[i] + " | ");
        }
    }
}
