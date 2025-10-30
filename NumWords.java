// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int NumWords = Integer.parseInt(args[0]);
		
		int ones = NumWords % 10;         
		int tens = (NumWords / 10) % 10;  
		int hundreds = (NumWords / 100) % 10; 

		System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");

		// % java NumWords 8
		// 0 hundreds, 0 tens, and 8 ones.
	}
}
