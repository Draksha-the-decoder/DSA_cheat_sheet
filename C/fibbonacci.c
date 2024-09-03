#include <stdio.h>
int main()
{
    int n=10;
    int a=0,b=1; int c=a+b;
    while(n>0)
    {
        c=a+b;
        printf("%d ",a);
        a=b; b=c;
        n=n-1;
    }
}