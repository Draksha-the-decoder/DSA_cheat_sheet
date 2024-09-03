#include <stdio.h>
int main()
{
    int year=2012;
    if(year%4==0)
    {
        if(year%100==0)
        {
            if(year%400==0)
            printf("leap year");
            else
            printf("not leap");
        }
       else
        printf("leap year");
    }
    else
    printf("not leap");
}