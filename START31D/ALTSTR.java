/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ALTSTR {
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
        int alt_0 = 0;
        int alt_1 = 0;
        for (int i = 0; i < N; i++) {
            if(S.charAt(i)=='0')
                alt_0++;
            else if(S.charAt(i)=='1')
                alt_1++;
        }
        if(alt_0<alt_1){
            int temp = alt_0*2+1;
            if(N>=temp)
                System.out.println(temp);
            else
                System.out.println(temp-1);
        } else {
            int temp = alt_1*2+1;
            if(N>=temp)
                System.out.println(temp);
            else
                System.out.println(temp-1);
        }
    }
}
