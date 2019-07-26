#include<stdio.h>
#include<limits.h>
int main()
{
  	//type your code here
   int a[100],n,i,max=INT_MIN;
  scanf("%d",&n);
  for(i=0;i<n;i++){scanf("%d",&a[i]);if(max<a[i])max=a[i];}
  printf("%d",max);
  
  
}