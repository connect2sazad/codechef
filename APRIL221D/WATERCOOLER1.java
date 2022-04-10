/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class WATERCOOLER1
{
	public static void main(String[] args) throws java.lang.Exception {
        Scanner z = new Scanner(System.in);
        int T = z.nextInt();
        for (int i = 0; i < T; i++)
            code(z);
        z.close();
    }
    
    static void code(Scanner z) {
        int X = z.nextInt();
        int Y = z.nextInt();
        int M = z.nextInt();
        if (Y > X * M)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
