/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class DIET {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner z = new Scanner(System.in);
        int T = z.nextInt();
        for (int i = 0; i < T; i++)
            code(z);
        z.close();
    }

    static void code(Scanner z) {
        int N = z.nextInt();
        int K = z.nextInt();
        int A[] = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = z.nextInt();
        }
        int i;
        boolean flag = true;
        for (i = 0; i < N; i++) {
            if (A[i] > K) {
                if ((i + 1) < N)
                    A[i + 1] += A[i] - K;
            } else if (A[i] < K) {
                flag = false;
                break;
            } else
                continue;
        }
        if (flag)
            System.out.println("YES");
        else
            System.out.println("NO "+i);
    }
}
