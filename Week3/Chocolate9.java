/*
The chocolate has the form of a rectangle divided into N × M slices.
The chocolate can be broken into two parts once in a straight line.
Determine if exactly K slices can be broken off from the chocolate in this way.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        int a=in.nextInt();//4
        int b=in.nextInt();//3
        int c=in.nextInt();//6
        
        if((a*b)>c  &&  (c%a ==0 || c%b ==0)) System.out.println("YES");
        else System.out.println("NO");
    }
    
}
