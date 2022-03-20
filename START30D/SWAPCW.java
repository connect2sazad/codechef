/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SWAPCW {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner z = new Scanner(System.in);
        int T = z.nextInt();
        while (T != 0) {
            code(z);
            T--;
        }
    }

    static void code(Scanner z) {
        int C = z.nextInt();
        int X = z.nextInt();
        int Y = z.nextInt();
        System.out.println((C - X) * Y);
    }
}
