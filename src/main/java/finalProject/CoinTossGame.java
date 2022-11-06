package finalProject;

import java.util.Scanner;

public class CoinTossGame {
    private Scanner scanner;

    public static void main(String[] args) {
        CoinTossGame game = new CoinTossGame();
        game.scanner = new Scanner(System.in);

        Player player1 = new Player(game.getPlayerName());
        player1.setGuess(game.guess());

        Player player2 = new Player(game.getPlayerName());
         if (player1.getGuess().equals(new Coin().HEADS)) {
             player2.setGuess(new Coin().TAILS);

         } else {
             player2.setName(new Coin().HEADS);

         }

        Coin coin = new Coin();
         coin.flip();

         game.getWinner(coin, player1, player2);
         game.scanner.close();
    }

    private String getPlayerName() {
        System.out.println("Input player name");
        return scanner.next();

    }

    private String guess() {
        scanner = new Scanner(System.in);
        System.out.println("What is your guess");
        String guess = scanner.next();

        while (!guess.equals(new Coin().HEADS) && !guess.equals(new Coin().TAILS)) {
            System.out.println("Invalid guess, input 'heads' or 'tails'");
            guess = scanner.next();
        }

//        scanner.close();
        return guess;
    }

    private void getWinner(Coin coin, Player player1, Player player2) {
        if (player1.getGuess().equals(coin.side)) {
            System.out.println(player1.getName() + " wins");

        } else {
            System.out.println(player2.getName() + " wins");
        }
    }

}
