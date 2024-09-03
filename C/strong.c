#include <stdio.h>  //strong = sum of factorial equal to number
#include <math.h>
int main()
{
int n=678; 
  int n1=n, c=0, sumoffact=0; 
   while(n1>0)
   {
      int d=n1%10;
      sumoffact = sumoffact + fact(d);
      n1 = n1/10;
   }
   if(sumoffact==n)
    printf("strong");
   else
    printf("not strong");   
}
int fact(int d)
{
    int f=1;
    for (int i=1;i<=d;i++)
    f=f*i;
    return f;
}