#include<stdio.h>
int main()
{
 int a,b;
  scanf("%d",&a);
  scanf("%d",&b);
  
  if(a>b)
  {
    printf("num1 is the greatest");
  }
  else if(a<b)
  {
     printf("num2 is the greatest");
  }
  
  else
  {
     printf("Both number Equal");
  }
  return 0;
}