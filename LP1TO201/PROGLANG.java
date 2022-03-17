/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PROGLANG {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner z = new Scanner(System.in);
        int T = z.nextInt();
        if (T >= 1 && T <= 288)
            for (int i = 0; i < T; i++)
                code(z);
        z.close();
    }

    static void code(Scanner z) {
        int A = z.nextInt();
        int B = z.nextInt();
        int A1 = z.nextInt();
        int B1 = z.nextInt();
        int A2 = z.nextInt();
        int B2 = z.nextInt();
        if (A >= 1 && A <= 4 && B >= 1 && B <= 4 && A1 >= 1 && A1 <= 4 && B1 >= 1 && B1 <= 4 && A2 >= 1 && A2 <= 4
                && B2 >= 1 && B2 <= 4) {
            if ((A == A1 && B == B1) || (A == B1 && B == A1))
                System.out.println(1);
            else if ((A == A2 && B == B2) || (A == B2 && B == A2))
                System.out.println(2);
            else
                System.out.println(0);
        }
    }
}
