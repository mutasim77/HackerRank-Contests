/*
The sequence consists of natural numbers and ends with the number 0.
Determine how many elements of this sequence are equal to its largest element.
*/

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);//1,7,9,9,0
        int largest = 0;
        int count = 1;
        while(true){
            int a = in.nextInt();//1 //7 //9 //9
            if(a == largest) count++;//1 != 0 // 7 != 1 // //9 != 7; // 9==9; count++;
            if(a == 0)break;// //

            if(a>largest)largest = a;//lar = 1; //lar = 7; // lar =9;
        }
        System.out.println(count);//2
    }
}
