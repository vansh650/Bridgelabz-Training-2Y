import java.util.Scanner;

public class DeckOfCards {
    static String[] initializeDeck(String[] suits, String[] ranks) {
        String[] deck = new String[suits.length * ranks.length];
        int index = 0;

        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    static String[] shuffle(String[] deck) {
        int n = deck.length;

        for (int i = 0; i < n; i++) {
            int randomCardNumber =
                i + (int) (Math.random() * (n - i));

            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    static String[][] distribute(String[] deck, int n, int players) {
        if (n % players != 0)
            return null;

        int cardsPerPlayer = n / players;
        String[][] result = new String[players][cardsPerPlayer];

        int index = 0;

        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                result[i][j] = deck[index++];
            }
        }
        return result;
    }

    static void printPlayers(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("\nPlayer " + (i + 1) + ":");

            for (int j = 0; j < players[i].length; j++)
                System.out.println(players[i][j]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] suits = {
            "Hearts", "Diamonds", "Clubs", "Spades"
        };

        String[] ranks = {
            "2", "3", "4", "5", "6", "7",
            "8", "9", "10", "Jack", "Queen",
            "King", "Ace"
        };

        int n = suits.length * ranks.length;

        String[] deck = initializeDeck(suits, ranks);
        deck = shuffle(deck);

        System.out.print("Enter number of players: ");
        int players = sc.nextInt();

        if (n % players != 0) {
            System.out.println(
                "Cards cannot be equally distributed among players."
            );
            return;
        }

        String[][] result = distribute(deck, n, players);
        printPlayers(result);
    }
}
