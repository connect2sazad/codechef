/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MINCARS {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner z = new Scanner(System.in);
        int T = z.nextInt();
        for (int i = 0; i < T; i++)
            code(z);
        z.close();
    }

    static void code(Scanner z) {
        int N = z.nextInt();
        String S = z.next();
        boolean flag = false;
        for (int i = 0; i < N - 1; i++) {
            char ch = S.charAt(i);
            char ch2 = S.charAt(i + 1);
            if (ch == ch2 && ch2 == '1') {
                flag = true;
                break;
            }
        }
        if (flag)
            System.out.println(2);
        else
            System.out.println(1);

    }
}
