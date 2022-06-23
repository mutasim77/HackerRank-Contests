/*
Write a program that shows the accepted text in reverse order. (Word consist of 4 letter ).
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();//ABCD
        String reverse = "";//empty
        for(int i = s.length()-1; i>=0; i--){// i=3(0,1,2,3);
            reverse += s.charAt(i);//reverse = DCBA
        }
        System.out.println(reverse);
    }
}
