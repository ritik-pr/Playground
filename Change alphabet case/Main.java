#include <stdio.h>
#include <string.h>
int main() {
	char s;
  scanf("%c",&s);
  if(s>=65 && s<=90)
  {
    s=s+32;
    printf("%c",s);
  }
  else
  {
    s=s-32;
    printf("%c",s);
  }
	return 0;
}