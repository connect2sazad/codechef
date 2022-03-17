/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

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
        int N = z.nextInt();
        int K = z.nextInt();
        if (N >= 1 && N <= 1000000000 && K >= 0 && K <= 1000000000) {
            if(K==0)
                System.out.println(N);
            else
                System.out.println(N%K);
        }
    }
}
