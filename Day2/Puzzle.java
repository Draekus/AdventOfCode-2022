import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

class Puzzle {
	public static void main(String[] args) {

		try {
			File myObj = new File("/workspaces/AdventOfCode-2022/Day2/input2");
			Scanner myReader = new Scanner(myObj);
			int totalScore = 0;

			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				String[] moves = data.split(" ");
				totalScore += calcScore(moves[0], moves[1]);

			}
			System.out.printf("Total Score: %d\n", totalScore);
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}

	// "Anyway, the second column says how the round needs to end:
	// X means you need to lose, Y means you need to end the round in a draw,
	// and Z means you need to win. Good luck!"
	/*
	 * X for Rock,
	 * Y for Paper,
	 * Z for Scissors.
	 * 
	 * 0 if you lost,
	 * 3 if the round was a draw,
	 * and 6 if you won).
	 * 
	 * 1 for Rock,
	 * 2 for Paper,
	 * and 3 for Scissors
	 */

	public static int calcScore(String elfMove, String yourMove) {
		int score = 0;
		// Lose condition
		if (yourMove.equals("X")) {
			score += 0;
			if (elfMove.equals("A")) {
				score += 3;
			} else if (elfMove.equals("B")) {
				score += 1;
			} else {
				score += 2;
			}
		}
		// Draw condition
		else if (yourMove.equals("Y")) {
			score += 3;
			if (elfMove.equals("A")) {
				score += 1;
			} else if (elfMove.equals("B")) {
				score += 2;
			} else {
				score += 3;
			}
		}
		// Win condition
		else if (yourMove.equals("Z")) {
			score += 6;
			if (elfMove.equals("A")) {
				score += 2;
			} else if (elfMove.equals("B")) {
				score += 3;
			} else {
				score += 1;
			}
		}

		return score;
	}
}
