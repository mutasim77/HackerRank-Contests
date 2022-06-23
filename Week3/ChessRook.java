/*
The chess rook moves horizontally or vertically. Given two different squares of the chessboard,
determine if the rook can get from the first square to the second in one move.

Input Format:
The program receives as input four numbers from 1 to 8 each,
specifying the column number and line number, first for the first cell, then for the second cell.

Output Format:
The program should print YES if it is possible to get to the
second one from the first cell by the move of the rook, or NO otherwise.
*/

import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int x1 , x2, y1, y2;
        x1 = in.nextInt();
        y1 = in.nextInt();
        x2 = in.nextInt();
        y2 = in.nextInt();
        
        if(x1 == x2 || y1 == y2)System.out.println("YES");
        else System.out.println("NO");
        
        
    }
}
