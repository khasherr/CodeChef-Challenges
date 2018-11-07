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
public class Factorial {
    public static int fact( int n){
        
        if (n == 0) { 
            return 1;
        }
        int smallAns = fact(n-1);
        return n* smallAns;
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 3; 
        int ans = fact(n); 
        System.out.println(ans);
    }
    
}
