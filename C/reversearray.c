#include <stdio.h>
int main()
{
   // int n=9; int arr[n];
    int arr[9]={34,56,54,32,67,89,90,32,21};
    for(int i=0;i<9/2;i++)
    {
        int t= arr[i];
        arr[i]=arr[8-i];
        arr[8-i]=t;
    }
    for(int i=0;i<9;i++)
    printf("%d ",arr[i]);
}