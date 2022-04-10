/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CHEFRACES {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner z = new Scanner(System.in);
        int T = z.nextInt();
        for (int i = 0; i < T; i++)
            code(z);
        z.close();
    }

    static void code(Scanner z) {
        int X = z.nextInt();
        int Y = z.nextInt();
        int A = z.nextInt();
        int B = z.nextInt();
        int medals = 0;
        if (X != A && X != B)
            medals++;
        if (Y != A && Y != B)
            medals++;
        System.out.println(medals);
    }
}
