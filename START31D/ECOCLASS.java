/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ECOCLASS {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner z = new Scanner(System.in);
        int T = z.nextInt();
        for (int i = 0; i < T; i++)
            code(z);
        z.close();
    }

    static void code(Scanner z) {
        int N = z.nextInt();
        int S[] = new int[N];
        int D[] = new int[N];
        for (int i = 0; i < N; i++)
            S[i] = z.nextInt();
        for (int i = 0; i < N; i++)
            D[i] = z.nextInt();
        int equi = 0;
        for (int i = 0; i < N; i++) {
            if(S[i]==D[i])
                equi++;
        }
        System.out.println(equi);
    }
}
