/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class XORAND {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner z = new Scanner(System.in);
        int T = z.nextInt();
        for (int i = 0; i < T; i++)
            code(z);
        z.close();
    }

    static void code(Scanner z) {
        int N = z.nextInt();
        int A[] = new int[N];
        int count = 0;
        for (int i = 0; i < N; i++) {
            A[i] = z.nextInt();
        }
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N-1; j++) {
                int xor = A[j]^A[j+1];
                int and = A[j]&A[j+1];
                if(xor<and)
                    count++;
            }
        }
        System.out.println(count);
    }
}
