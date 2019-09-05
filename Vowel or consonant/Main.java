#include<stdio.h>
int main()
{
  char str;
  scanf("%c",&str);
  
  if(str=='a' || str=='e' || str=='i' || str=='o' || str=='u' || str=='A' || str=='E' || str=='O' || str=='I' || str=='u' )
    printf("Vowel");
  else
    printf("Consonant");
  return 0;
}