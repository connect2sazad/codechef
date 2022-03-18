/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class TWODISH {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner z = new Scanner(System.in);
        int T = z.nextInt();
        if (T >= 1 && T <= 100)
            for (int i = 0; i < T; i++)
                code(z);
        z.close();
    }

    static void code(Scanner z) {
        int N = z.nextInt();
        int A = z.nextInt();
        int B = z.nextInt();
        int C = z.nextInt();
        if (N >= 1 && N <= 100 && A >= 1 && A <= 100 && B >= 1 && B <= 100 && C >= 1 && C <= 100) {
            if ((A+C) >= N && B >= N)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
