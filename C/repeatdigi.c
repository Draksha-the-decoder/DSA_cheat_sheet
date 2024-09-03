#include <stdio.h>
int main()
{
    int n=12345;
    int arr[10]={0};
    while(n>0)
    {
        int d=n%10;
        arr[d]=arr[d]+1;
        n=n/10;
    }
    int r=1;
    for(int i=0;i<=9;i++)
    {
        if(arr[i]>1)
        r=0;
    }
    if(r==1)
    printf("no repeat");
    else
    printf("repeat");
}