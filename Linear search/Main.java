#include<stdio.h>
int main()
{
  int n,i,a[100],s,flag=0;
  scanf("%d",&n);
  for(i=0;i<n;i++){
  scanf("%d",&a[i]);}
  scanf("%d",&s);
  for(i=0;i<n;i++)
    if(s==a[i]){printf("%d",i+1);flag=1;break;}
  if(!flag)printf("%d isn't present in the array.",s);
  //Type your code here
  return 0;
}