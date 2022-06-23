/*
The user enters integers a, b and c. Change the values of these variables so that variable a stores the value of a+b,
variable b stores the difference of the old values of c-a, and variable c stores the sum of the old values of a+b+c.
Print the new values of the variables.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner (System.in);
        int  a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        
        System.out.println("a = "+(a + b)+"\nb = "+(c - a)+"\nc = "+(a+b+c));
        
    }
}
