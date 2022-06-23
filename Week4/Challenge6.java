/*
Write a program that takes a number (ranging from 0 to 9) in text format 
and displays it as a number on the screen.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String s = in.next();//zero
        
             if(s.equals("zero"))  System.out.println(0);
        else if(s.equals("one"))   System.out.println(1);
        else if(s.equals("two"))   System.out.println(2);
        else if(s.equals("three")) System.out.println(3);
        else if(s.equals("four"))  System.out.println(4);
        else if(s.equals("five"))  System.out.println(5);
        else if(s.equals("six"))   System.out.println(6);
        else if(s.equals("seven")) System.out.println(7);
        else if(s.equals("eigth")) System.out.println(8);
        else if(s.equals("nine"))  System.out.println(9);
    }
}


    // 2-способ
/*    
         switch(s){
            case "zero":
                System.out.println(0);
            break;
            case "one":
                System.out.println(1);
            break;
                case "two":
                System.out.println(2);
            break;
                case "three":
                System.out.println(3);
            break;
                case "four":
                System.out.println(4);
            break;
                case "five":
                System.out.println(5);
            break;
                case "six":
                System.out.println(6);
            break;
                case "seven":
                System.out.println(7);
            break;
                case "eight":
                System.out.println(8);
            break;
                case "nine":
                System.out.println(9);
            break;
            default:
        }
*/
