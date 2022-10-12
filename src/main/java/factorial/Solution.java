package factorial;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
        int i,fact=1;
        BigDecimal bg= new BigDecimal(1);
        for(i=1;i<=A;i++){
            bg = bg.multiply(new BigDecimal(i));
        }
        System.out.println(bg.divide(new BigDecimal(2)).longValue());
    }
}