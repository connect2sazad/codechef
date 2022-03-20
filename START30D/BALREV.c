#include <stdio.h>
int main()
{
    int c;
    scanf("%d", &c);
    for (int i = 0; i < c; i++)
    {
        int f;
        scanf("%d", &f);
        char arr[f];
        scanf("%s", arr);
        int v = 0;
        for (int i = 0; i < f; i++)
        {
            if (arr[i] == '0')
                v++;
        }
        for (int i = 0; i < v; i++)
        {
            arr[i] = '0';
        }
        for (int i = v; i < f; i++)
        {
            arr[i] = '1';
        }
        printf("%s\n", arr);
    }
}
