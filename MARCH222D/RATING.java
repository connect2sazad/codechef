/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class RATING {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner z = new Scanner(System.in);
        int T = z.nextInt();
        for (int i = 0; i < T; i++)
            code(z);
        z.close();
    }

    static void code(Scanner z) {
        int S = z.nextInt();
        int X, Y;
        for (X = 0, Y = -1; S == X+Y; X++, Y--){

            System.out.println(X+" "+Y);
        }
    }
}
