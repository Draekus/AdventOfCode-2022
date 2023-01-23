package Day4;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class Puzzle {
    public static void main(String[] args) {

		try {
			File myObj = new File("/workspaces/AdventOfCode-2022/Day4/input4");
			Scanner myReader = new Scanner(myObj);
			int totalScore = 0;

			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				String[] pairs = data.split(",");
				String[] pair1 = pairs[0].split("-");
				String[] pair2 = pairs[1].split("-");
				int num1 = Integer.parseInt(pair1[0]);
				int num2 = Integer.parseInt(pair1[1]);
				int num3 = Integer.parseInt(pair2[0]);
				int num4 = Integer.parseInt(pair2[1]);
				

				if ((num3 <= num1 && num2 <= num4) || (num1 <= num3 && num4 <= num2)) {
					totalScore++;
				}

			}
			System.out.printf("Total Score: %d\n", totalScore);
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}

}
