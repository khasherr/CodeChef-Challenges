/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author Sher Khan
 */
public class NumberofDigits {
   
	public static int count(int n){
             	if(n == 0){
			return 0;
		}
		int smallAns = count(n / 10);
		return smallAns + 1;
	}


    
    public static void main (String[] args){
        System.out.println(count(100));
         
}

}