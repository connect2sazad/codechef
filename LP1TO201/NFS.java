/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class NFS {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner z = new Scanner(System.in);
        int T = z.nextInt();
        if (T >= 1 && T <= 100000)
            for (int i = 0; i < T; i++)
                code(z);
        z.close();
    }

    static void code(Scanner z) {
        int U = z.nextInt();
        int V = z.nextInt();
        int A = z.nextInt();
        int S = z.nextInt();
        int v;
        if (U >= 1 && U <= 10000 && V >= 1 && V <= 10000 && A >= 1 && A <= 10000 && S >= 1 && S <= 10000) {
            v = (int) Math.sqrt(U * U - 2 * A * S);
            if (v <= V) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
