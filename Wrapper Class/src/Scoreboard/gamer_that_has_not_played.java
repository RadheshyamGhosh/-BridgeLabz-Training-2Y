package Scoreboard;

public class gamer_that_has_not_played {
	public static void main(String[] args) {
		Integer[] s = {10, null, 25, null, 40, 5, null};

		int notPlayedCount = 0;
		int totalScore = 0;

		for (Integer a : s) {
		    if (a == null) {
		        notPlayedCount++;
		    } else {
		        totalScore += a;
		    }
		}

		System.out.println("Players who haven't played: " + notPlayedCount);
		System.out.println("Total valid score: " + totalScore);

	}
}
