#include<stdio.h>
int main()
{
  int n,a=0,b=1,c;
  scanf("%d",&n);
  if(n==1)printf("%d",a);else if(n==2) printf("%d %d",a,b);
  else{
    printf("%d %d ",a,b);n=n-2;
  while(n){
  c=a+b;
  printf("%d ",c);
  a=b;b=c;n--;}}
  //Type your code here
  return 0;
}