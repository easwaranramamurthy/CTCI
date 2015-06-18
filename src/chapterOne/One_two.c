#include <stdio.h>

void reverse(char str[]){
    int n = 0;
    while(str[n]){
        n++;
    }
    
    int i=0;
    while(i<n/2){
        char temp = *(str+i);
        *(str+i) = *(str+n-i-1);
        *(str+n-i-1) = temp;
        i++;
    }
}

int main()
{
    char str[] = "abcba";
    reverse(str);
    printf("%s\n", str);
    return 0;
}

