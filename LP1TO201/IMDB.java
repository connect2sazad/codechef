/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class IMDB {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner z = new Scanner(System.in);
        int T = z.nextInt();
        if (T >= 1 && T <= 10)
            for (int i = 0; i < T; i++)
                code(z);
        z.close();
    }

    static void code(Scanner z) {
        int N = z.nextInt();
        int X = z.nextInt();
        if ((N >= 1 && N <= (5 * 10000)) && (X >= 1 && X <= 1000000000)) {
            int[] S = new int[N];
            int[] R = new int[N];
            for (int i = 0; i < N; i++) {
                S[i] = z.nextInt();
                R[i] = z.nextInt();
            }
            // find largest
            int r = 0;
            for (int i = 0; i < N; i++) {
                if(r<=R[i]&&S[i]<=X){
                    r=R[i];
                }
            }
            System.out.println(r);
        }
    }
}
