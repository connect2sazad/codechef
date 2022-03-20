/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ADASCOOL {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner z = new Scanner(System.in);
        int T = z.nextInt();
        for (int i = 0; i < T; i++)
            code(z);
        z.close();
    }

    static void code(Scanner z) {
        int N = z.nextInt();
        int M = z.nextInt();
        if (N % 2 == 0 || M % 2 == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
