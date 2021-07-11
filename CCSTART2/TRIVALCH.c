#include <stdio.h>
#include <math.h>

int main(){

    int a, b, c;
    double area, s;
    scanf("%d %d %d", &a, &b, &c);

    if((a+b>c) && (b+c>a) && (c+a>b)){
        s = ((double)(a+b+c))/2;
        area = sqrt(s*(s-a)*(s-b)*(s-c));
        if(area>0)
            printf("YES");
        else
            printf("NO");
    }
    else
        printf("NO");
    
    return 0;
}
