package stringCharSum;

import java.util.Scanner;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = String.valueOf(n);
        int sum = s.chars()
                .mapToObj(item -> Character.getNumericValue(item))
                .reduce(1, (a, b) -> a * b);

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(sum);
    }
}
