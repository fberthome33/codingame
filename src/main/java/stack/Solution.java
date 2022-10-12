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
        String T = in.nextLine();

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
        Stack<Character> stk = new Stack<>();

        for (char c : T.toCharArray()) {
            if(stk.size()  > 0 && stk.elementAt(stk.size() - 1) == '(' && c== ')') {
                stk.pop();
            } else {
                stk.push(c);
            }
        }
        System.out.println(stk.size() == 0?"True": "False");
    }
}