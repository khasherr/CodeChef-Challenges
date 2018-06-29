import java.util.Scanner;

/*
 * Author: Sher Khan
 * Date: 2018-06-27
 * 
 * 
 * This program takes user input and if its divisible by 4, 
 * it increments otherwise decrements. Problem is taken 
 * from CODECHEF
 * 
 * 
 */
public class Increment_Decrement {
	public static void main (String [] args) { 
		
		Scanner keyboardInput = new Scanner (System.in); 
	    System.out.println("Enter an integer");
		int number = keyboardInput.nextInt(); 
		String ans;
		
		if(number>=0 && number<=1000) { 
			if(number%4==0) { 
				number++;
				ans = number + " " + "is incremented";	
			}
			else { 
				number--; 
			   ans = number+ " " + "is decremented";
			}
		
			System.out.println(ans);
		}
		
} 
}