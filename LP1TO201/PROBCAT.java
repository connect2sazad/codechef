/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PROBCAT {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner z = new Scanner(System.in);
        int T = z.nextInt();
        if (T >= 1 && T <= 50)
            for (int i = 0; i < T; i++)
                code(z);
        z.close();
    }

    static void code(Scanner z) {
        int x = z.nextInt();
        if (x >= 1 && x <= 300) {
            if(x>=1&&x<100)
                System.out.println("Easy");
            else if(x>=100&&x<200)
                System.out.println("Medium");
            else if(x>=200&&x<300)
                System.out.println("Hard");
        }
    }
}
