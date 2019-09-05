#include <stdio.h>
int main()
{
  long int a,b,c;
  scanf("%ld%ld",&a,&b);
  
  if(b>=0)
  {
  c=pow(a,b);
  printf("%ld",c);
  }
  else
  {
    printf("Wrong input");
  }
    return 0;
}