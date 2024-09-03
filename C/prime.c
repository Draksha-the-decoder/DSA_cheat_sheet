#include <stdio.h>
#include <math.h>
int main()
{
    int n=23, count=0;;
    for(int i=1;i<=(sqrt(n));i++)
    {
        if(n%i==0)
        count++;
    }
    if(count==1)
    printf("prime");
    else
    printf("not prime");
}