/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MXEVNSUB {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner z = new Scanner(System.in);
        int T = z.nextInt();
        for (int i = 0; i < T; i++)
            code(z);
        z.close();
    }

    static void code(Scanner z) {
        int N = z.nextInt();
        int S = (N*(N+1))/2;
        if(S%2==0)
            System.out.println(N);
        else
            System.out.println(N-1);
    }
}
