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
public class Power {
    
    // x = base n = power
    public static int power (int x, int n ){ 
        if (n == 0){ 
            return 1;
        }
        
       
       return x * power (x, n-1);
    }
    
    public static void main (String [] args){ 
         
        System.out.println(power(2,5));
    }
}


