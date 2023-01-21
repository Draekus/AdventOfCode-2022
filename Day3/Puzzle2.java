package Day3;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class Puzzle2 {
    public static void main(String[] args) {

		try {
			File myObj = new File("/workspaces/AdventOfCode-2022/Day3/input3");
			Scanner myReader = new Scanner(myObj);
			int totalScore = 0;
            int counter = 0;

            while (myReader.hasNextLine()) {

                if (counter % 3 == 0) {
                    String data1 = myReader.nextLine();
                    String data2 = myReader.nextLine();
                    String data3 = myReader.nextLine();

                    String[] data_arr1 = data1.split("");
                    String[] data_arr2 = data2.split("");
                    String[] data_arr3 = data3.split("");             
                
				
                    int score = 0;
                    
                    for (int i = 0; i < data_arr1.length; i++) {
                        for (int j = 0; j < data_arr2.length; j++) {
                            if (data_arr1[i].equals(data_arr2[j])) {
                                String candidate = data_arr1[i];
                                for (int k = 0; k < data_arr3.length; k++) {
                                    if (candidate.equals(data_arr3[k])) {
                                        System.out.println(candidate);
                                        score = getPriority(data_arr3[k].charAt(0));
                                    }
                                }

                            }
                            
                        }
                    }

                    totalScore += score;
                }
                counter++;
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
