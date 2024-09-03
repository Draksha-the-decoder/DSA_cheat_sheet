#include <stdio.h>
#include <math.h>
int main()
{
    int bin=100110011;
    int deci=0;
    int pos=0;
    while(bin>0)
    {
        int d=bin%10;
        deci=deci+ pow(2*d,pos);
        pos++;
        bin=bin/10;
    }
    printf("decimal equivalent = %d",deci);

}