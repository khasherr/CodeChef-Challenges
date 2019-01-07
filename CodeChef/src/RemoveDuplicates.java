/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 * This program removes duplicates characters in a string.
 * 
 * @author Sher Khan
 */
public class RemoveDuplicates {
    
    public static  String removeDup (String str ){ 
        
        //Base case- if size of string is less than or equal to 1 
        //means no duplicates and returns that string
        if (str.length() <= 1) { 
            return str;
        }
       
        //checks if character at 0th index is same to character at 1st index 
        // then return the characters from 1st string onwards
        if(str.charAt(0) == str.charAt(1)){
            return removeDup(str.substring(1));
        }
        
        // otherwise return the character at 0th index plus 
        // string starting from index 1 onwards
        else 
            return str.charAt(0) + removeDup(str.substring(1));
        
        
    }
    
    public static void main (String [] args){ 
        
        //Test to see if above method works
        String str = "aabbcd"; 
        System.out.println(removeDup(str));
        
    }
    
}
        
 
