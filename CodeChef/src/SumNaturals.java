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
public class SumNaturals {
    public static int sum (int n){ 
        if(n==1){ 
            return 1;
        }
        return n + sum(n-1);
        
    }
    
    public static void main (String[] args){ 
        
        int n = 10; 
        int ans = sum(10);
        System.out.println(ans);
        
        //could be printed this way too no need to declare variable ans
        System.out.println(sum(n));
    }
    
}
