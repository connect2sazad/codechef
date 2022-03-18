/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CSTOCK {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner z = new Scanner(System.in);
        int T = z.nextInt();
        if (T >= 1 && T <= test_range(3))
            for (int i = 0; i < T; i++)
                code(z);
        z.close();
    }

    static int test_range(int pow) {
        int ans = 1;
        for (int i = 1; i <= pow; i++) {
            ans *= 10;
        }
        return ans;
    }

    static void code(Scanner z) {
        int S = z.nextInt();
        int A = z.nextInt();
        int B = z.nextInt();
        int C = z.nextInt();
        // if (S >= 0 && S <= test_range(6) && A >= 1 && A <= B && B <= test_range(6) && C >= -100 && C <= 100) {
            if (100 * B >= S * (100 + C) && S * (100 + C) >= 100 * A)
                System.out.println("Yes");
            else
                System.out.println("No");
        // }
    }
}
