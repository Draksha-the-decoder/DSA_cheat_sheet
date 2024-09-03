#include <stdio.h>
#define n 1
struct
{
    char name[10];
    int roll;
    double percentage;
}student[n];

int main()
{
    for(int i=0;i<n;i++)
    {
        scanf("%s",student[i].name);
        scanf("%d",&student[i].roll);
        scanf("%lf",&student[i].percentage);
    }
    for(int i=0;i<n;i++)
    {
        printf("%s\n",student[i].name);
        printf("%d\n",student[i].roll);
        printf("%lf\n",student[i].percentage);
    }
    return 0;
}
