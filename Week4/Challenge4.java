/*
You are given 2 strings A, B. Check how many times string B appears in string A. If B does not appear in A, then print 0.
If it occurs exactly 1 time, print 1, otherwise print 2+.

NOTE: For input: ABCABCAB ABCA - there are only 1 occurrence, not 2 as it might seem.

Try to solve this problem using indexOf() method.
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String s1 = in.next();//ABCDABD = 7
        String s2= in.next();//ABCD;
        if(s1.lastIndexOf(s2)>0)System.out.println("2+");
        else if(s1.indexOf(s2)==0)System.out.println("1");
        else System.out.println("0");
    }
}
