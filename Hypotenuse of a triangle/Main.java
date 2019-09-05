#include<stdio.h>
#include<math.h>
int main()
{
  float s1,s2,s3;
  scanf("%f%f",&s1,&s2);
  
  s3=sqrt((s2*s2)+(s1*s1));
  printf("%.2f",s3);
 
  
  return 0;
}