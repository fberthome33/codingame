package nokia;

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
        String MESSAGE = in.nextLine();
        Map<Integer, String> nok = new HashMap<>();
        String[] arroNok = {"0_0", "ABC", "DEF", "GHI", "JKL", "MNO"};

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
        char[] charArr = MESSAGE.toCharArray();
        for( int i = 0 ; i < charArr.length; i++) {
            for( int j = 0 ; j < arroNok.length; j++) {
                    String touch = ""+j;
                    for(int k = 0; k <= arroNok[j].indexOf(""+charArr[i]); k++)
                        System.out.print(touch);
            }
        }
        //System.out.println("answer");
    }
}