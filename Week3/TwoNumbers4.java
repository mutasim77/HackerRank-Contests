/*
Two integers are given. Output the value of the largest of them. 
If the numbers are equal, print any of them.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int a = in.nextInt();//3
        int b =  in.nextInt();//2
        if(a>b) System.out.println(a);//3
        else System.out.println(b);//
    }
}
