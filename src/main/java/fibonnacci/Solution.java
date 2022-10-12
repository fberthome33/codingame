package fibonnacci;

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
        int n = in.nextInt();
        int n_0 = 0;
        int n_1 = 1;
        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
        System.err.println(n);

        int result = 0;
        for (int i = 0; ; i++) {
            System.err.println(n_0 + " "+ n_1);
            result=n_0 + n_1;
            System.err.println(result);
            if(n_1 == n) {
                break;
            }
            n_0 = n_1;
            n_1 = result;
        }
        System.out.println(result);
    }
}