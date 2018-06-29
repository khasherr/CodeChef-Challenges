import java.util.Scanner;

public class AddingNumbers {
	public static void main (String [] args) { 
		
		Scanner keyboardInput = new Scanner(System.in);
		
		int a,b,t; 
		int sum = 0; 
		t= keyboardInput.nextInt();
		
		for(int counter=0; counter<t; counter++) { 
			a = keyboardInput.nextInt();
			b= keyboardInput.nextInt();
			sum = a+b; 
			System.out.println(sum);
		}
		
	} 
}
		
		