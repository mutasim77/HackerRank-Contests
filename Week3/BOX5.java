/*
There are two boxes, the first is A1 × B1 × C1, the second is A2 × B2 × C2.
Determine if one of these boxes can be placed inside the other,
provided the boxes can only be rotated 90 degrees around the edges.
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner i=new Scanner(System.in);
        int a1=i.nextInt();//5
        int b1=i.nextInt();//94
        int c1=i.nextInt();//65

        int fmax=Math.max(Math.max(a1,b1),c1);//94
        int fmin=Math.min(Math.min(a1,b1),c1);//5
        int fav=a1+b1+c1-fmax-fmin;//166-99 =77

        int a2=i.nextInt();//44
        int b2=i.nextInt();//1
        int c2=i.nextInt();//90

        int smax=Math.max(Math.max(a2,b2),c2);//90
        int smin=Math.min(Math.min(a2,b2),c2);//1
        int sav=a2+b2+c2-smax-smin;//135-91 =44

        if(a2>0 && b2>0 && c2>0){
            if(fmax==smax && fav==sav && fmin==smin){
            System.out.println("Boxes are equal");
        }
        else if(fmax>=smax && fav >=sav && fmin>=smin){
            System.out.println("The first box is larger than the second one");
        }
        else if(fmax<=smax && fav<=sav && fmin<=smin){
            System.out.println("The first box is smaller than the second one");
        }
        else{
            System.out.println("Boxes are incomparable");
        }
      }
    }
 }
