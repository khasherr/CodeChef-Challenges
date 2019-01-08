/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 * This program replaces all occurrences of PI  in a string with 3.14.
 * 
 * @author Sher Khan
 */
public class ChangePI {
    
    public static String replacePI (String input){ 
         
        //String length is less zero or one, returns the string
        if(input.length() <= 1) { 
            return input;
        }
        
        //checks if the zeroth index character equals to p
        //&& first index character equals i
        // replaces it with 3.14 and gives the string onward from index 2
        if ((input.charAt(0) == 'p') && (input.charAt(1) == 'i')){ 
            return replacePI (3.14 + input.substring(2));
        }
        
        
        // otherwise return the character at zeroth index and check the 
        // the rest of the rest starting from index 1. Repeats the process.
        else 
            return (input.charAt(0) + replacePI(input.substring(1)));
          
    
}

    public static void main (String [] args){ 
        
        //Test
        String input = "pixpixpixpixpix";
        
        System.out.println(replacePI(input));
    }
    }