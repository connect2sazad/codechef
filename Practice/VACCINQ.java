/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class VACCINQ {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner z = new Scanner(System.in);
        int T = z.nextInt();
        for (int i = 0; i < T; i++)
            code(z);
        z.close();
    }

    static void code(Scanner z) {
        int N = z.nextInt();
        int P = z.nextInt();
        int X = z.nextInt();
        int Y = z.nextInt();
        int A[] = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = z.nextInt();
        }
        int res = 0;
        for (int i = 0; i < P; i++) {
            int e = A[i];
            if (e == 0)
                res += X;
            else if (e == 1)
                res += Y;
        }
        System.out.println(res);
    }
}
