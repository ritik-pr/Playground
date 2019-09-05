#include<stdio.h>
int main()
{
  int year;
  scanf("%d",&year);
  
  int leap=year%2;
  if(leap==0)
  {
    printf("Leap year");
  }
  else
  {
    printf("Not Leap year");
  }
  
  return 0;
}