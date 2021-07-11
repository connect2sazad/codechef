#include <stdio.h>

int N;

int main()
{

    int counter=1;
    scanf("%d", &N);

    if ((N >= 1 && N <= 200)){
        for (int i = 1; i <= N; i++){
            if(i%2==0){
                for(int i = (counter+4);i>=counter;i--)
                    printf("%d ", i);
                counter+=5;
            } else {
                for(int i = 1;i<=5;i++,counter++)
                    printf("%d ", counter);
            }
            printf("\n");
        }
        
    }
    return 0;
}
