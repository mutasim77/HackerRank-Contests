/*
A three-digit number is given. Print first its last digit (units), and then its average digit (tens).
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        // int b = a % 10; //587 = 7
        System.out.println( a % 10 ); //7
        
        System.out.println((a /10) % 10 ); //58

    }
}
