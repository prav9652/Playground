#include<stdio.h>
int main()
{
  int a[100],i,n,b,c,flag=1;
  scanf("%d",&n);
  for(i=0;i<n;i++)scanf("%d",&a[i]);
  scanf("%d%d",&b,&c);
  for(i=0;i<n;i++)
    if(b==a[i])
    {printf("Element 1 index = %d",i);flag=0;break;}
  if(flag)printf("Element 1 index = -1");
  flag=1;
  for(i=0;i<n;i++)
    if(c==a[i])
    {printf("\nElement 2 index = %d",i);flag=0;break;}
  if(flag)printf("\nElement 2 index = -1");
  	//type your code here
}