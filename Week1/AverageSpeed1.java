/*
Assume a runner runs 15 miles in 1 hour, 30 minutes and 0 seconds.
Write program that displays the average speed in kilometers per hour.
(Note that 1 mile is 1.6 kilometers.)
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        double miles=15;
        double kilometers=miles*1.6;

        double time=90;
        double kmph= time/60;
        double speed= kilometers/kmph;
        System.out.print("The average speed is "+speed+" km/h");

    }
}
