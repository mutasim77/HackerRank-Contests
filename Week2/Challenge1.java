/*
Write a program that outputs the sum, difference, and multiplication of three numbers. We enter all the numbers through the console.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        
        System.out.println(a+b+c+"\n"+(a-b-c)+"\n"+a*b*c);
    }
}
