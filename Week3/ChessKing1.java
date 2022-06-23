/*
The chess king moves horizontally, vertically and diagonally, but only 1 square.
Given two different squares of the chessboard,
determine if the king can get from the first square to the second in one move.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        
        int a, b, a1, b1;
        a=in.nextInt();
        b=in.nextInt();
        a1=in.nextInt();
        b1=in.nextInt();
        
        if(a==a1 || b==b1) System.out.println("YES");
        else if (a==a1+1 && b==b1-1) System.out.println("YES");
        
        else if (a==a1+1 && b==b1) System.out.println("YES");
        
        else if (a==a1+1 && b==b1+1) System.out.println("YES");
        
        else if (a==a1 && b==b1+1) System.out.println("YES");
        
        else if (a==a1-1 && b==b1+1) System.out.println("YES");
        
        else if (a==a1-1 && b==b1) System.out.println("YES");
        
        else if (a==a1-1 && b==b1-1) System.out.println("YES");
        
        else if (a==a1 && b==b1-1) System.out.println("YES");
        
        else System.out.println("NO");
        
    }
}
