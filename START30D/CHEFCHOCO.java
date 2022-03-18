/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CHEFCHOCO {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner z = new Scanner(System.in);
        int T = z.nextInt();
        if (T >= 1 && T <= 100) {
            while (T != 0) {
                code(z);
                T--;
            }
        }
    }

    static void code(Scanner z) {
        int C = z.nextInt();
        int X = z.nextInt();
        int Y = z.nextInt();
        if (C >= 1 && C <= 100 && X >= 0 && X <= C && Y >= 1 && Y <= 100) {
            System.out.println((C - X) * Y);
        }
    }
}
