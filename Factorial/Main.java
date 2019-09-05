#include<stdio.h>
int main()
{
	 long int fact=1;
  long int n;
  scanf("%ld",&n);
  
  for(int i=1;i<=n;i++)
  {
    fact *=i;
  }
  printf("%ld",fact);
  
}