/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CHEFBOTTLE {
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
        int N = z.nextInt();
        int X = z.nextInt();
        int K = z.nextInt();
        if (N >= 1 && N <= 100000 && X >= 1 && X <= 100000 && K >= 0 && K <= 100000) {
            int res = K/X;
            if(res>=N)
                System.out.println(N);
            else
                System.out.println(res);
        }
    }
}
