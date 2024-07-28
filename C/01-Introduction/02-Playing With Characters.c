#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
#define MAX_LEN 100


int main()
{
    char ch;
    char str[MAX_LEN];
    char s[MAX_LEN];

    scanf("%c", &ch);
    scanf("%s",&str);
    scanf("\n");
    scanf("%[^\n]%*c", s);

    printf("%c\n",ch);
    printf("%s\n",str);
    printf("%s",s);
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    return 0;
}
