package senenteCharDiff;

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
        if (in.hasNextLine()) {
            in.nextLine();
        }
        for (int i = 0; i < n; i++) {
            String sentence = in.nextLine();
            System.out.println(diff(sentence));
        }
    }


    private static int diff(String sentence) {
        int min = sentence.chars()
                .mapToObj(item -> (char) item)
                .min(Integer::compare).get();

        int max = sentence.chars()
                .mapToObj(item -> (char) item)
                .max(Integer::compare).get();
        return max-min;
    }

}
