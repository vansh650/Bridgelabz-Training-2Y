import java.util.Scanner;

public class RockPaperScissors {

    static String computerChoice() {
        int choice = (int)(Math.random() * 3);

        if (choice == 0) {
            return "Rock";
        } else if (choice == 1) {
            return "Paper";
        } else {
            return "Scissors";
        }
    }

    static String findWinner(String user, String computer) {

        if (user.equals(computer)) {
            return "Draw";
        }

        if (user.equals("Rock") && computer.equals("Scissors")) {
            return "Player";
        }

        if (user.equals("Paper") && computer.equals("Rock")) {
            return "Player";
        }

        if (user.equals("Scissors") && computer.equals("Paper")) {
            return "Player";
        }

        return "Computer";
    }

    static double percentage(int wins, int games) {
        return ((double) wins / games) * 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int games = sc.nextInt();

        int playerWins = 0;
        int computerWins = 0;
        int draws = 0;

        System.out.println("Enter Rock, Paper or Scissors");

        for (int i = 1; i <= games; i++) {

            String user = sc.next();
            String computer = computerChoice();

            String winner = findWinner(user, computer);

            if (winner.equals("Player")) {
                playerWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            } else {
                draws++;
            }

            System.out.println("Game " + i +
                    " | Player: " + user +
                    " | Computer: " + computer +
                    " | Winner: " + winner);
        }

        System.out.println();
        System.out.println("Player Wins = " + playerWins);
        System.out.println("Computer Wins = " + computerWins);
        System.out.println("Draws = " + draws);

        System.out.println("Player Win % = " +
                percentage(playerWins, games));

        System.out.println("Computer Win % = " +
                percentage(computerWins, games));
    }
}