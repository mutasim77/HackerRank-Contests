/*
The program receives as input a sequence of non-negative integers, each number is written on a separate line.
The sequence ends with the number 0, upon reading which the program must finish its work and print the
number of members of the sequence (not counting the terminating number 0).
Numbers following 0 do not need to be read.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean a = true;  
        int count = 0;
        while(a){
            int x = in.nextInt();
            if(x == 0) break;
            count++;
        }
        System.out.println(count);
    }
}
