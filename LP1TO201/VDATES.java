/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class VDATES {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner z = new Scanner(System.in);
        int T = z.nextInt();
        if (T >= 1 && T <= 100000)
            for (int i = 0; i < T; i++)
                code(z);
        z.close();
    }

    static void code(Scanner z) {
        int D = z.nextInt();
        int L = z.nextInt();
        int R = z.nextInt();
        if (D >= 1 && D <= 1000000000 && L >= 1 && L <= 1000000000 && R >= 1 && R <= 1000000000) {
            if (D >= L && D <= R) {
                System.out.println("Take second dose now");
            } else if(D<L){
                System.out.println("Too Early");
            } else if(D>R){
                System.out.println("Too Late");
            }
        }
    }
}
