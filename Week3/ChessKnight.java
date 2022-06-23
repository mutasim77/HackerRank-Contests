/*
The chess knight moves with the letter “G” - two squares vertically in any direction and one square horizontally, or vice versa.
Given two different squares of the chessboard,
determine if the knight can get from the first square to the second in one move.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner in =new Scanner(System.in);
        
        int x1= in.nextInt();
        int y1=in.nextInt();
        
        int x2=in.nextInt();
        int y2=in.nextInt();
        
        if((x2==x1+2 || x2==x1-2)&& (y2==y1-1 || y2==y1+1))
            System.out.println("YES");
        else if((y2==y1+2 || y2==y1-2 )&& (x2==x1-1 || x2==x1+1))
            System.out.println("YES");
        else if(x1>8 && x2>8 && y1>8 && y2>8)
            System.out.println("NO");
        else if(x1<1 && x2<1 && y1<1 && y2<1)
            System.out.println("NO");
        else
            System.out.println("NO");
    }
}
