package Day3;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

class Puzzle {
	public static void main(String[] args) {

		try {
			File myObj = new File("/workspaces/AdventOfCode-2022/Day3/input3");
			Scanner myReader = new Scanner(myObj);
			int totalScore = 0;
            
            while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				String item1 = data.substring(0, data.length()/2);
                String item2 = data.substring(data.length()/2, data.length());
                String[] item1_arr = item1.split("");
                String[] item2_arr = item2.split("");
               
                
                
				
                int score = 0;
                for (int i = 0; i < item1_arr.length; i++) {
                    for (int j = 0; j < item2_arr.length; j++) {
                        if (item1_arr[i].equals(item2_arr[j])) {
                            
                            score = getPriority(item2_arr[j].charAt(0));
                        }
                    }
                }
                totalScore += score;
			}
            System.out.println(totalScore);
            
			//System.out.printf("Total Score: %d\n", totalScore);
			myReader.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}

    public static int getPriority(char letter) {
        int value = 0;
        if (letter >= 'A' && letter <= 'Z') {
            value = (((int)letter - 'A' + 1 ) + 26);
        }
        else if (letter >= 'a' && letter <= 'z') {
            value = ((int)letter - 'a' + 1 );
        }

        return value;
    }

	
}
