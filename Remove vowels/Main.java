#include<stdio.h>
#include<string.h>
int main()
{
  char string[100];
   int length = 0, i = 0, j = 0, k = 0, count = 0;
  scanf("%[^\n]s", string);
  
    length = strlen(string);
    count = length;
    for (j = 0; j < length;) {
        switch (string[j]) {
        case 'a':
        case 'A':
        case 'e':
        case 'E':
        case 'i':
        case 'I':
        case 'o':
        case 'O':
        case 'u':
        case 'U':
            for (k = j; k < count; k++) {
                string[k] = string[k + 1];
                //printf("\nstring : %s",string);
            }
            count--;
            break;
        default:
            j++;
        }
    }
    string[count] = '\0';
    printf("%s", string);
    return 0;
  
  
  return 0;
}