#include <stdio.h>

void getVal();
long int N;

int main()
{

    getVal();
    long int evenSum = 0;
    long int oddSum = 0;

    if ((N >= 1 && N <= 1000000))
    {
        for (int i = 1, even = 2, odd = 1; i <= N; i++, even+=2, odd+=2){
            evenSum+=even;
            oddSum+=odd;
        }
        
    }
    else
        getVal();

    printf("%ld %ld", oddSum, evenSum);
    
    return 0;
}

void getVal()
{
    scanf("%ld", &N);
}