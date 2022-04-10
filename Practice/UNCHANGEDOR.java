/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class UNCHANGEDOR {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner z = new Scanner(System.in);
        int T = z.nextInt();
        for (int i = 0; i < T; i++)
            code(z);
        z.close();
    }

    static void code(Scanner z) {
        long n = z.nextLong();
        long count = n - 2;
        for (int i = 4; i <= n; i *= 2) {
            count--;
        }
        System.out.println(count);
    }
}
