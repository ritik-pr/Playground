#include<stdio.h>

int main()
{
	float r,angle;
    float  length;
	scanf("%f%f",&r,&angle);
   length=(2*3.14*r)*(angle/360);
  printf("%.2f",length);
}
