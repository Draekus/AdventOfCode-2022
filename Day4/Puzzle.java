package Day4;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class Puzzle {
    public static void main(String[] args) {

		try {
			File myObj = new File("/workspaces/AdventOfCode-2022/Day2/input2");
			Scanner myReader = new Scanner(myObj);
			int totalScore = 0;

			while (myReader.hasNextLine()) {
				
			}
			System.out.printf("Total Score: %d\n", totalScore);
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}

}
