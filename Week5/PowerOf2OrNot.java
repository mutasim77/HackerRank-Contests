/*
You are given a natural number N. Print the word YES if the number N is an exact power of two, or the word NO otherwise.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        
        int x=in.nextInt();
        int y = 0;
        
        while(x!=0 && x%2 ==0){
           y=x;
           x=x/2;
        }
        if(y==2 || y==0) System.out.println("YES");
        else System.out.println("NO");
        
    }
}
