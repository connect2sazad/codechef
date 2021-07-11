#include <stdio.h>

void getVal();
long int A, B, C;

int main()
{

    getVal();

    if ((A >= 1 && A <= 1000000000) && (B >= 1 && B <= 1000000000) && (C >= 1 && C <= 1000000000))
    {
        if (A > B && A > C)
        {
            if (B > C)
                printf("%d", B);
            else
                printf("%d", C);
        }
        else if (B > C && B > A)
        {
            if (C > A)
                printf("%d", C);
            else
                printf("%d", A);
        }
        else if (A > B)
            printf("%d", A);
        else
            printf("%d", B);
    }
    else
        getVal();
    return 0;
}

void getVal()
{
    scanf("%ld %ld %ld", &A, &B, &C);
}