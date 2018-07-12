import java.util.Scanner;

/*
 * This program calculates divisibility of user input numbers 
 */
public class Divisibility {
	public static void main (String [] args) { 
		
		Scanner keyboardInput = new Scanner(System.in);
		int testCase = keyboardInput.nextInt(); 
		 
	    	for(int counter =0; counter < testCase; counter++) { 
	    		int userNumber = keyboardInput.nextInt();
	    	   
	    		if(userNumber % 10 ==0) { 
	    		System.out.println("0");
	    	} 
	    		else if (userNumber %5 ==0 ) { 
	    			System.out.println("1");
	    		} 
	    		
	    		else { 
	    			System.out.println("-1");
	    		}
	    	}
	    	 
	} 
} 
