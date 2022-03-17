
import java.util.Scanner;

public class MAX_DIFF {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int T = z.nextInt();
        if (T >= 1 && T <= 1000)
            for (int i = 0; i < T; i++)
                code(z);
        z.close();
    }

    static void code(Scanner z) {
        int N = z.nextInt();
        int S = z.nextInt();
        if (N >= 1 && N <= 100000 && S >= 1 && S <= 2*100000) {
            if(S<=N)
                System.out.println(S);
            else {
                System.out.println(N*2-S);
            }
        }
    }
}