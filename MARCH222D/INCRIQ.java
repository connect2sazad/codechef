/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class INCRIQ {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner z = new Scanner(System.in);
        int X = z.nextInt();
        X += 7;
        if(X>170)
            System.out.println("YES");
        else
            System.out.println("NO");
        z.close();
    }
}
