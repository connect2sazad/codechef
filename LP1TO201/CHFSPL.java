/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CHFSPL {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner z = new Scanner(System.in);
        int T = z.nextInt();
        if (T >= 1 && T <= test_range(4))
            for (int i = 0; i < T; i++)
                code(z);
        z.close();
    }

    static int test_range(int pow){
        int ans = 1;
        for(int i=1;i<=pow;i++){
            ans*=10;
        }
        return ans;
    }

    static void code(Scanner z) {
        int powers[] = new int[3];
        for(int i=0;i<3;i++){
            powers[i] = z.nextInt();
        }
        Arrays.sort(powers);
        System.out.println(powers[1]+powers[2]);
    }
}
