#include <stdio.h>

int main()
{

    long int N, SUM = 0;

    scanf("%ld", &N);

    if (N >= 1 && N <= 1000000000)
    {
        for (int i = 1; i <= N; i++)
        {
            SUM = SUM + i;
        }

        printf("%ld", SUM);
    }

    return 0;
}
