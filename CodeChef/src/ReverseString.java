/*
 * This program reverses a string input from user
 */

import java.util.Scanner;

public class ReverseString {
	public static void main (String [] args) { 
		
		Scanner keyboardInput = new Scanner(System.in); 
		String userWords = keyboardInput.nextLine();	
		int length = userWords.length(); 
		String reverse = " ";
		
		for(int counter = length-1; counter>=0; counter--) {
			reverse = reverse + userWords.charAt(counter);
		}
		
		System.out.println(reverse);
} 
}