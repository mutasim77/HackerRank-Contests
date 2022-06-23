/*
Given three natural numbers A, B, C. Determine if there is a triangle with such sides. 
If the triangle exists, print the line YES, otherwise print the line NO. 
A triangle is three points that do not lie on one straight line.
*/

import java.util.*;
public class Solution {

    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        
        if(a+b>c && a+c>b && a<c+b){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
