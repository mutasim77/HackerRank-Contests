/*
Three integers are given. Find the largest of them (the program should print exactly one integer).
The largest number in this problem is understood as a number that is not less than any other.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if(a >= b && a > c)System.out.println(a);
        else if (b > a && b > c) System.out.println(b);
        else System.out.println(c);
    }
}
