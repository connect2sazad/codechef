/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ATM2 {
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
        int N = z.nextInt();
        int K = z.nextInt();
        int A[] = new int[N];
        String s="";
        for (int i = 0; i < N; i++) {
            A[i] = z.nextInt();
        }
        for (int i : A) {
            if(i<=K){
                K-=i;
                s+="1";
            } else 
                s+="0";
        }
        System.out.println(s);
    }
}
