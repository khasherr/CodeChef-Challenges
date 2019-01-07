/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

import java.util.Scanner;

/**
 * This program removes character in a string and replaces with a particular character of your choice. 
 * @author Sher Khan
 */
public class RemoveChar {
    
    public static String ReplaceChar (String input, char oldChar, char newChar){ 
        
        //base case  - if the input string is empty then return empty string
        if (input.isEmpty()) { 
            return " ";
        } 
        
        // Small calculation - eclared var c - if the input string at 0th 
        //character is old characterthen replacees it new character
        // otherwise do not do anything. 
       char c; 
       if(input.charAt(0) == oldChar){
           c = newChar;
       }
       
       else { 
           c = input.charAt(0);
       }
       
       // recursive method for the rest of the string 
       String answer = ReplaceChar(input.substring(1), oldChar, newChar);
               return c + answer;
    
               
    }
    
    public static void main (String [] args){ 
        
        Scanner s = new Scanner(System.in);
        // string of your choice
        String input = s.next();
        //character in a string to be replaced 
        char oldChar = s.next().charAt(0);
        //character to be replace it with 
        char newChar = s.next().charAt(0); 
        System.out.println(ReplaceChar(input, oldChar, newChar));
    }
}
