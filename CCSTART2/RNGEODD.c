#include <stdio.h>

void getVal();
long int L, R;

int main()
{

    getVal();

    if ((L >= 1 && L <= 1000000) && (R >= 1 && R <= 1000000))
    {
        for (long int i = L; i <= R; i++)
        {
            if(i%2!=0)
                printf("%d ", i);
        }
        
    }
    else
        getVal();
    return 0;
}

void getVal()
{
    scanf("%ld %ld", &L, &R);
}