/*
For a given number N, print all integer powers of two not exceeding N in ascending order.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();//60
        
        for(int i=1; i<a; i=i*2){
            System.out.print(i+" ");
        }
        
    }
}
