/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class THREETOPICS {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner z = new Scanner(System.in);
        int A = z.nextInt();
        int B = z.nextInt();
        int C = z.nextInt();
        int X = z.nextInt();
        if(A==X || B==X || C==X)
            System.out.println("Yes");
        else
            System.out.println("No");
        z.close();
    }
}
