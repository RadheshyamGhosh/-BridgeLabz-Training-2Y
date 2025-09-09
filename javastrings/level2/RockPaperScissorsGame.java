import java.util.Scanner;

public class RockPaperScissorsGame {

    // (b) Method to get computer choice
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3); // 0, 1, or 2
        switch (choice) {
            case 0: return "rock";
            case 1: return "paper";
            default: return "scissors";
        }
    }

    // (c) Method to determine winner
    public static String findWinner(String user, String computer) {
        if (user.equals(computer)) {
            return "draw";
        }
        if ((user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("scissors") && computer.equals("paper")) ||
            (user.equals("paper") && computer.equals("rock"))) {
            return "user";
        } else {
            return "computer";
        }
    }

    // (d) Method to calculate win percentages
    public static String[][] calculateStats(int userWins, int computerWins, int games) {
        String[][] stats = new String[2][3];

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f", (userWins * 100.0 / games)) + "%";

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f", (computerWins * 100.0 / games)) + "%";

        return stats;
    }

    // (e) Method to display results
    public static void displayResults(String[][] gameResults, String[][] stats, int games) {
        System.out.println("\nGame Results:");
        System.out.println("Game\tUser Choice\tComputer Choice\tWinner");
        System.out.println("-------------------------------------------------");

        for (int i = 0; i < games; i++) {
            System.out.println((i + 1) + "\t" + gameResults[i][0] + "\t\t" +
                               gameResults[i][1] + "\t\t" + gameResults[i][2]);
        }

        System.out.println("\nOverall Stats:");
        System.out.println("Player\tWins\tWin %");
        System.out.println("---------------------------");

        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2]);
        }
    }

    // (f) Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int games = sc.nextInt();
        sc.nextLine(); // consume newline

        String[][] gameResults = new String[games][3];
        int userWins = 0, computerWins = 0;

        for (int i = 0; i < games; i++) {
            System.out.print("Enter your choice (rock, paper, scissors): ");
            String userChoice = sc.nextLine().toLowerCase();

            String computerChoice = getComputerChoice();
            String winner = findWinner(userChoice, computerChoice);

            if (winner.equals("user")) {
                userWins++;
            } else if (winner.equals("computer")) {
                computerWins++;
            }

            gameResults[i][0] = userChoice;
            gameResults[i][1] = computerChoice;
            gameResults[i][2] = winner;
        }

        // Calculate stats
        String[][] stats = calculateStats(userWins, computerWins, games);

        // Display results
        displayResults(gameResults, stats, games);

        sc.close();
}
}