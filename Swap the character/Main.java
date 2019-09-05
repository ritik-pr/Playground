#include<stdio.h>
#include<string.h>
int main()
{
  char a[200],a1[2000],a12[2000];
  scanf("%s",a);
  scanf("%s",a1);
  scanf("%s",a12);
  int x,y,z;
  x=strlen(a);
  y=strlen(a1);
  z=strlen(a12);
  
  for(int i=0;i<x;i++)
  {
    if(a[i] == 'a' || a[i] == 'e' ||  
           a[i] == 'i' || a[i] == 'o' ||  
           a[i] == 'u' || a[i] == 'A' ||  
           a[i] == 'E' || a[i] == 'O' ||  
           a[i] == 'U'|| a[i] == 'I')
    {
      a[i]='$';
    }
  } 
  for(int i=0;i<y;i++)
  {
    if(!(a1[i] == 'a' || a1[i] == 'e' ||  
           a1[i] == 'i' || a1[i] == 'o' ||  
           a1[i] == 'u' || a1[i] == 'A' ||  
           a1[i] == 'E' || a1[i] == 'O' ||  
           a1[i] == 'U'|| a1[i] == 'I') )
    {
      a1[i]='#';
    }
  }
  for(int i=0;i<z;i++)
  {
    if(a12[i] >= 'a' && a12[i] <='z')
    {
      a12[i]=a12[i]-32;
    }
  }
   printf("%s%s%s",a,a1,a12);
  
  return 0;
  
}