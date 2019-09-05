#include<stdio.h>
int main()
{
  int len;
  int arr[20000];
  int no,count=0;
  
  scanf("%d",&len);
  for(int i=0;i<len;i++)
  {
    scanf("%d",&arr[i]);
  }
  scanf("%d",&no);
  
  for(int i=0;i<len;i++)
  {
    if(arr[i]==no)
    {
      count++;
      printf("%d",i+1);
    }      
  }
  if(count==0)
    printf("%d isn't present in the array.",no);
 
  return 0;
}