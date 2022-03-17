/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CHFRICH
{
	public static void main (String[] args) throws java.lang.Exception{
		Scanner z = new Scanner(System.in);
        int T = z.nextInt();
        if (T >= 1 && T <= 21000)
            for (int i = 0; i < T; i++)
                code(z);
        z.close();
    }

    static void code(Scanner z) {
        int A = z.nextInt();
        int B = z.nextInt();
        int X = z.nextInt();
		if((B-A)%X==0){
			System.out.println((B-A)/X);
		}
    }
}
