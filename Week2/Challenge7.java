/*
Write a program in which you enter a three-digit number. Find the sum of digits.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(); //913
        
        int x = a %10; //3
        int y = (a /10) % 10 ; //913/10 = 91%10 = 1
        int z = a /100; //913/100 = 9
        
        System.out.println(x+y+z);
    }
}
