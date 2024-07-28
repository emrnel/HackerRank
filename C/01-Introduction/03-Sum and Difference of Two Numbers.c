#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main()
{
    int num1, num2;
    float fl1, fl2;

    scanf("%d %d",&num1,&num2);
    scanf("\n");
    scanf("%f %f",&fl1,&fl2);

    int intsum = num1 + num2;
    int intdiff = num1 - num2;
    float flsum = fl1 + fl2;
    float fldiff = fl1 - fl2;

    printf("%d %d\n",intsum,intdiff);
    printf("%.1f %.1f",flsum,fldiff);

    return 0;
}
