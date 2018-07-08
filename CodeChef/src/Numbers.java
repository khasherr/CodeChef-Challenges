import java.util.Scanner;

/* 
 * Program asks for user input int and calculates its length
 */
public class Numbers {

	public static void main(String[] args) {
		Scanner keyboardInput = new Scanner(System.in); 
		int userNumbers = keyboardInput.nextInt(); 
		
		if((userNumbers >=0) && (userNumbers <= 9)) { 
			System.out.println("1");
		}
		else if((userNumbers >=10) && (userNumbers <= 99)) { 
			System.out.println("2"); 
		}
		else if ((userNumbers >=100) && userNumbers <= 999) { 
			System.out.println("3");
		}
		else { 
			System.out.println("More than 3 digits"); 
		}
		
		
		
} 
	
} 