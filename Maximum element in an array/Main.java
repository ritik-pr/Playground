#include<stdio.h>
int main()
{
  	int n,arr[1000];
  scanf("%d",&n);
  for(int i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  for(int i=1;i<n;i++)
  {
    if(arr[0]<arr[i])
      arr[0]=arr[i];
   
  }
   printf("%d",arr[0]);
  return 0;
  
}