#include<stdio.h>
int main()
{
  float p,yr;
  float rate,interest;
  scanf("%f\n %f\n %f",&p,&yr,&rate);
  interest = (p*rate*yr)/100;
  printf("%f",interest);
  return 0;
}