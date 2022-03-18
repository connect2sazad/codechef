#include <stdio.h>

int main(void)
{
    int T, a, b, c, d, K, dist;
    scanf("%d", &T);
    while (T-- > 0)
    {
        scanf("%d %d %d %d %d", &a, &b, &c, &d, &K);
        dist = abs(a - c) + abs(b - d);
        if (K >= dist && K % 2 == dist % 2)
            printf("YES");
        else
            printf("NO");
    }

    return 0;
}
