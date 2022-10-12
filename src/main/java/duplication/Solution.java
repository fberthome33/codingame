package duplication;

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
        Map<Long, Integer> ints = new HashMap();
        long res = 0;
        for (int i = 0; i < N; i++) {
            long x = in.nextLong();
            System.err.println(x);
            ints.put(x, ints.getOrDefault(x, 0) + 1);
        }

        for(Map.Entry<Long, Integer> key: ints.entrySet()) {
            if(key.getValue() ==1) {
                System.out.println(key.getKey());
            }
        }
    }
}