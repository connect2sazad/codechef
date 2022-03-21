/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ENCMSG {
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
        StringBuffer sbr = new StringBuffer(S);
        if (N % 2 == 0)
            for (int i = 0; i < N - 1; i += 2) {
                char ch1 = sbr.charAt(i);
                char ch2 = sbr.charAt(i + 1);
                sbr.setCharAt(i, ch2);
                sbr.setCharAt(i + 1, ch1);
            }
        else
            for (int i = 0; i < (N - 2); i += 2) {
                char ch1 = sbr.charAt(i);
                char ch2 = sbr.charAt(i + 1);
                sbr.setCharAt(i, ch2);
                sbr.setCharAt(i + 1, ch1);
            }
        for (int i = 0; i < N; i++) {
            int ch = 'z' - sbr.charAt(i) + 'a';
            sbr.setCharAt(i, (char) ch);
        }
        System.out.println(sbr.toString());
    }
}
