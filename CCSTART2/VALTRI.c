#include <stdio.h>

void getVal();
long int N;

int main()
{

    getVal();

    if ((N >= 1 && N <= 1000000))
    {
        if(N%5==0 || N%6==0)
            printf("YES");
        else
            printf("NO");
    }
    else
        getVal();
    return 0;
}

void getVal()
{
    scanf("%ld", &N);
}