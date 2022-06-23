/*
Perform this mathematical operation where you enter x, y and z from the console. Perform this operation: x^3 + 5xy - 6zy + z^3.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner (System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        System.out.println((int)Math.pow(x,3)+(5*x*y) - (6 * z*y) +(int)Math.pow(z,3));
    }
}
