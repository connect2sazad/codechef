/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class BALREV {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner z = new Scanner(System.in);
        int T = z.nextInt();
        if (T >= 1 && T <= 100) {
            while (T != 0) {
                code(z);
                T--;
            }
        }
    }

    static void code(Scanner z) {
        int N = z.nextInt();
        String A = z.next();
        String str = "";
        if (N >= 1 && N <= 100000) {
            int L, R;
            if(A.contains("1") && A.contains("0")){
                L = A.indexOf("1");
                R = A.lastIndexOf("1");
                if(R<(N-1))
                    R++;
                else if(L!=R)
                    R--;
                str = A.substring(L, R);
                str = new StringBuffer(str).reverse().toString();
                if(N-str.length()>0){
                    while((N-str.length())!=0){
                        str = "0"+str;
                    }
                }
            } else if(!A.contains("1")) {
                while((N-str.length())!=0){
                    str = "0"+str;
                }
            } else if(!A.contains("0")){
                str="1";
                while((N-str.length())!=0){
                    str = "0"+str;
                }
            }       
        }
        System.out.println(str);
    }
}
