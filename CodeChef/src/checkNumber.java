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
public class checkNumber {
    private static boolean check (int input[], int x, int startIndex){ 
        if(startIndex == input.length){ 
            return false;
        }
        
        if (input[startIndex] == x) { 
            return true;
    }
        
           return check(input, x, startIndex+1); 
    }
          public static boolean check (int input[], int x){ 
              return check (input, x, 0); 
          }
        
  
    
    
    public static void main (String args[]){ 
        int input[] = {3,4,1,5,6}; 
        System.out.println(check(input,3));
        
    }
}

  
    
  
