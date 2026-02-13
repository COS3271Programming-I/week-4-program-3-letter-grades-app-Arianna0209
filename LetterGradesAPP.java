package week4;

import java.util.Scanner;
public class LetterGradesAPP {
	
	// This program outputs the letter grade of an test score.
	
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {
         
		// Input the test score:
		System.out.print("Enter a test score: ");
        int testscore = userinput.nextInt();
        
        //note that in ASCII ... A is 65, B is 66, C is 67, etc. 
        //this converts from grade to ASCII value ... the higher the grade the lower the ASCII value
        int ascii = 74 - (testscore / 10);
        if (ascii > 68) {ascii = 70;}
        
        // Print the test scores with a plus, minus, or nothing:
        if ((testscore % 10) >= 0 && (testscore % 10) < 3 && ascii != 70) {
        	System.out.format("Grade = %c-", (char)ascii);}
    	else if ((testscore % 10) >= 7 && ascii > 65 && ascii != 70) {
        	System.out.format("Grade = %c+", (char)ascii);}
    	else {
    		System.out.println("Grade = " + (char)ascii);}
		     
	}

}
