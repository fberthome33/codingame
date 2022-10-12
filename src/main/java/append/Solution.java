package append;

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
        int N = in.nextInt();
        String app = "";
        for (int i = 0; i < N; i++) {
            String LINE = in.next();
            app +=LINE;
        }
        Math.floor()
        int count=0;
        char cc ='\0';
        System.err.println(app);
        String res = "";
        for (char c : app.toCharArray()) {
            System.err.println((char)c);
            if(c != cc) {
                System.out.println(count);
                if(count > 0) {
                    res +=cc;
                    res += (count + 1);
                }
                count = 0;
                cc = c;
            }
            else count++;
        }
        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(res + cc + (count+1));
    }
}