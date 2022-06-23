/*
The sequence consists of natural numbers and ends with the number 0.
Determine the value of the second largest element in this sequence, that is, 
the element that will be the largest if the largest element is removed from the sequence.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       boolean a=true;
        int count=0;
        List<Integer>sequence=new ArrayList<Integer>();
        Scanner in=new Scanner(System.in);
        int index=0;
        int i=0;
        while (a){
            int v=in.nextInt();
            if(v>0 && v>count){
             sequence.add(v);
                count =v;
                index=i;
                i++;
                    
            }
            else if(v>0){
                sequence.add(v);
                i++;
            }
            else{
                a=false;
            }
        }
            if(sequence.size()>1){
                sequence.remove(index);
            }
            int greatest =0;
            for(int j=0; j<sequence.size();j++){
              if(sequence.get(j)>greatest && sequence.get(j) !=count){
                greatest=sequence.get(j);
              }
            }
            
        
        System.out.println(greatest);
        }
    }
