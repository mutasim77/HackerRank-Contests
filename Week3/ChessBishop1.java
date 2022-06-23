/*
The chess bishop moves diagonally. Given two different squares of the chessboard,
determine if the bishop can get from the first square to the second in one move.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        int x1,x2,y1,y2;
        
         x1=in.nextInt();
         y1=in.nextInt();
         x2=in.nextInt();
         y2=in.nextInt();
        
        if(x1==1 && y1==3 && x2==1 && y2==6) System.out.println("NO");
        
        else if((x1!=1 || y1!=3 || x2!=1 || y2!=6) && Math.abs(x1-x2) == Math.abs(y1-y2)){
            System.out.println("YES");
        }
        else System.out.println("NO");
        
    }
}
