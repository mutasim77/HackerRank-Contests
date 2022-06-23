/*
The Fibonacci sequence is defined as follows:

F (0) = 0, F (1) = 1,…, F (n) = F (n − 1) + F (n − 2).

For a given number N, determine the N-th Fibonacci number F (N).
*/

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        
        int num0=1;
        int num1=1;
        int num2=0;
        for(int i = 3; i<=num; i++){
            num2=num0+num1;
            num0=num1;
            num1=num2;
        }
        System.out.println(num2);
    }
}


/*

//Fibonachi with Recursion

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in =new Scanner (System.in);
        int a = in.nextInt();
        System.out.println(fib(a));
    }
    public static int fib(int a){
        if(a<=1) return a;
        else
           return fib(a-1) + fib(a-2);
    }
}

*/
