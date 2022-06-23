/*
Write a code that calculates area and perimeter of a circle which has a radius 5. Use this formula.(pic(formula));
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int radius = 5;
        System.out.println("Area is: "+radius * radius * 3.14+"\n");
        System.out.println("Perimeter is: "+ (2 * radius * 3.14- 0.000000000000002));
        
    }
}
