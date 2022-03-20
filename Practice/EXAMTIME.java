/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class EXAMTIME {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner z = new Scanner(System.in);
        int T = z.nextInt();
        for (int i = 0; i < T; i++)
            code(z);
        z.close();
    }

    static void code(Scanner z) {
        int d_DSA = z.nextInt();
        int d_TOC = z.nextInt();
        int d_DM = z.nextInt();
        int s_DSA = z.nextInt();
        int s_TOC = z.nextInt();
        int s_DM = z.nextInt();

        int d_total = d_DSA + d_DM + d_TOC;
        int s_total = s_DM + s_DSA + s_TOC;

        if (d_total > s_total)
            System.out.println("DRAGON");
        else if (s_total > d_total)
            System.out.println("SLOTH");
        else {
            if (d_DSA > s_DSA)
                System.out.println("DRAGON");
            else if (s_DSA > d_DSA)
                System.out.println("SLOTH");
            else {
                if (d_TOC > s_TOC)
                    System.out.println("DRAGON");
                else if (s_TOC > d_TOC)
                    System.out.println("SLOTH");
                else
                    System.out.println("TIE");
            }
        }
    }
}
