/*
Write a program where you enter integers a and b, and if 'a' is divisible by 'b',
then the program should output 'divisible' otherwise 'not divisible'.
*/

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();//49
        int y = in.nextInt();//7
        
        if(x%y == 0)System.out.println("divisible");
        else System.out.println("not divisible");
        
    }
}
