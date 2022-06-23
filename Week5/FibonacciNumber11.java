/*
The Fibonacci sequence is defined as follows:
F (0) = 0, F (1) = 1,…, F (n) = F (n − 1) + F (n − 2).
A natural number A is given. Determine what Fibonacci number it is, that is,
print a number N such that F (N) = A. If A is not a Fibonacci number, print the number -1.
*/

import java.util.*;
public class Solution {

  public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        double x = Math.sqrt(5*a*a-4);
        double y= Math.sqrt(5*a*a+4);
        String res = "NO";
        if(x%1 ==0 || y%1==0){
            res="YES";
        }
        System.out.println(res);
    }
}
