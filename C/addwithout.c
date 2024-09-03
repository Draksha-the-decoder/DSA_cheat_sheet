/*#include <stdio.h>
#include <math.h>
int main()
{
    int a=10;
    int b=20;
    int sum=a;
    for(int i=1;i<=b;i++)
    {
        sum++ ;
    }
    printf("sum=%d",sum);
}*/

#include <stdio.h>//half adder
#include <math.h>
int main()
{
    int a=-9;
    int b=90;
    int sum=0; int carry=0;
     while(b !=0)
    {
        sum=a^b;
        carry= (a&b)<<1;
        a=sum;
        b=carry;
    }    
    printf("sum=%d",sum);
}