#include<stdio.h>
int main()
{
  int a,b,c;
  scanf("%d\n %d\n %d",&a,&b,&c);
  
  if(a>b && a>c)
  {
    if(b>c)
      printf("%d",b);
    else
      printf("%d",c);
  }
  else if(b>c && b>a)
  {
    if(a>c)
      printf("%d",a);
    else
      printf("%d",c);
  }
  else
  {
    if(b>a)
      printf("%d",b);
    else
      printf("%d",a);
  }
}