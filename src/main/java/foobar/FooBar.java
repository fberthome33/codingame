package foobar;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class FooBar {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i = 1; i <= N ; i++){
            if (i % 5 == 0) {
                System.out.print("Foo");
            }
            if (i % 7 == 0)
                System.out.print("Bar");
            if(i % 5 != 0 && i % 7 != 0)
                System.out.print(i);
            System.out.println();
        }
    }
}