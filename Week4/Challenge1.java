/*
The program requests two words and compares them case-insensitive (uppercase and lowercase letters).
Print "THEY ARE EQUAL" if they are equal, and "THEY ARE NOT EQUAL" otherwise.
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
        
        String s1, s2;
        s1 = in.next();//JAVA
        s2 = in.next();//java
        s2 = s2.toUpperCase();//JAVA
        if(s1.equals(s2)) System.out.println("THEY ARE EQUAL");
        else  System.out.println("THEY ARE NOT EQUAL");
    }
}

    /* 
    if(w1.equalsIgnoreCase(w2)){
            System.out.println("THEY ARE EQUAL");
    */
