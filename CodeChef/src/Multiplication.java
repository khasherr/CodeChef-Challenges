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
public class Multiplication {
    
    public static int multiplicationTwoIntegers (int m, int n){ 
        if (m == 0){ 
            return 0;
        }
        
        int a = m*(n-1);
        return a+m;
    }
    
    
    public static void main (String args []){ 
        System.out.println(multiplicationTwoIntegers(3,0));
    }
}
