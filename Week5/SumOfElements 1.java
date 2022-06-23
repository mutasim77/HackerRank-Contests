/*
Determine the sum of all elements of the sequence ending with the number 0.
*/

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        while(true){
            int a = in.nextInt();//3 6 8
            if(a == 0)break;
            count+=a;//0+3+6+8
        }
        System.out.println(count);//17
    }
}
