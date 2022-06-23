/*
Write a program in which you enter the radius. Find the length of the circle L and the area of the circle S. 
L = 2·π·R, S = π·R2 . ** **Use 3.14 as the value of π.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in= new Scanner(System.in);
        int r = in.nextInt();
        
        double l = ((2*3.14)*r) - (0.000000000000002); //14 = 0 
        double s = (Math.pow(r,2))*3.14;
        
        System.out.println("L = "+l);
        System.out.println("S = "+s);
    }
}
