/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MISS_NUM {
    static int a = 0, b = 0;

    public static void main(String[] args) throws java.lang.Exception {
        Scanner z = new Scanner(System.in);
        int T = z.nextInt();
        for (int i = 0; i < T; i++)
            code(z);
        z.close();
    }

    static void code(Scanner z) {
        int A = z.nextInt();
        int B = z.nextInt();
        int C = z.nextInt();
        int D = z.nextInt();

        operation(A, B, C, D);

        if (A == -1 && B == -1)
            operation(A, C, B, D);

        if (A == -1 && B == -1)
            operation(A, D, B, C);

        if (A == -1 && B == -1)
            operation(B, C, A, D);

        if (A == -1 && B == -1)
            operation(B, D, A, C);

        if (A == -1 && B == -1)
            operation(C, D, A, B);

        System.out.println(a + " " + b);

    }

    static void operation(int p, int q, int r, int s) {
        if ((p + q) % 2 == 0) {
            int temp_a = (p + q) / 2;
            int temp_b = Math.abs(p - q) / 2;
            if (temp_a <= 0 || temp_b <= 0 || temp_a > 1e4 || temp_b > 1e4) {
                a = -1;
                b = -1;
            } else {
                if ((temp_a * temp_b == r && temp_a / temp_b == s) || (temp_a * temp_b == s && temp_a / temp_b == r)) {
                    a = temp_a;
                    b = temp_b;
                } else {
                    a = -1;
                    b = -1;
                }
            }
        } else {
            a = -1;
            b = -1;
        }
    }
}
