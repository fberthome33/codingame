package stringBattle;

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
        String S = in.nextLine();

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
        for(char c : S.toCharArray()) {
            if(Character.isUpperCase(c)) {
                System.out.print('-');
            }
            else if(Character.isLowerCase(c)) {
                System.out.print('_');
            } else
                System.out.print('*');

        }
    }
}