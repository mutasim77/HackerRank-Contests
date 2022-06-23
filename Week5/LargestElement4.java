/*
The sequence consists of natural numbers and ends with the number 0.
Determine the value of the largest element of the sequence.
*/

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int large = 0;
        while(true){
            int a = in.nextInt();//2 3 1
            if(a == 0) break;
            if(a > large ) large = a;// 3
        }
        System.out.println(large);//3
    }
}
