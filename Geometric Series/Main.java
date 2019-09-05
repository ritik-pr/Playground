#include<stdio.h>
#include<math.h>
int main()
{
  int n,a,b,c,d;
  scanf("%d",&n);
  
  if(n%2==1)
  {
    d=(n-1)/2;
    a=pow(2,d);
    printf("%d",a);
  }
  
  else
  {
    c=(n-1)/2;
    b=pow(3,c);
    printf("%d",b);
  }
  return 0;
}