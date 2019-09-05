#include<stdio.h>
int main()
{
  	int n,a,b,arr[1000],x=0,y=0;
  scanf("%d",&n);
  
  for(int i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  scanf("%d\n%d",&a,&b);
  
  for(int i=0;i<n;i++)
  {
    if(arr[i]==a)
    {
      printf("Element 1 index = %d\n",i);
    x++;
    }
  }
  if(x == 0)
  printf("Element 1 index = -1\n");
  for(int i=0;i<n;i++)
  {
    if(arr[i]==b)
    {
      printf("Element 2 index = %d\n",i);
   y++;
    }
  }
  if(y==0)
      printf("Element 2 index = -1");

  
}