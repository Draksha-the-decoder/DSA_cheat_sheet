#include <stdio.h>

int main()
{
    int base=5;
    int power=-4;double ans=1.0;
    if(power>0)
    {
      for(int i=1;i<=power;i++)
        ans=ans*base;     
    }  
    else
    {
        for(int i=power;i<0;i=i+1)
        ans=ans*(1.0/base);  
    }
     printf("%f",ans); 
}