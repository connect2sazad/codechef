/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class WEIGHTBL {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner z = new Scanner(System.in);
        int T = z.nextInt();
        if (T >= 1 && T <= 100000)
            for (int i = 0; i < T; i++)
                code(z);
        z.close();
    }

    static void code(Scanner z) {
        int w1 = z.nextInt();
        int w2 = z.nextInt();
        int x1 = z.nextInt();
        int x2 = z.nextInt();
        int M = z.nextInt();
        if (w1 >= 1 && w1 <= w2 && w2 <= 100 && x1 >= 0 && x1 <= x2 && x2 <= 100 && M >= 1 && M <= 10) {
           int dw = w2-w1;
           if(dw>=M*x1 && dw<=M*x2)
               System.out.println(1);
           else
               System.out.println(0);
        }
    }
}
