
import java.util.Scanner;

/* This program calculates vowels or alphabets based 
 * on user input.
 *
 */
public class Alphabets {
	public static void main (String [] args ) { 
		
		Scanner keyboardInput = new Scanner(System.in); 
	    char alphabet = keyboardInput.next().toUpperCase().charAt(0);
	    if(alphabet=='A'||alphabet== 'E'|| alphabet == 'I' || alphabet == 'O' || alphabet == 'U') {
	    	System.out.println("Vowel");
	    	}
	    else { 
	    	System.out.println("Consonant");
	    }
	    	
	    	
	    	
	    	
	    }
	    	
	    }
	
		
