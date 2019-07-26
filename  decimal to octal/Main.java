#include<stdio.h>
void fun(int n){
if(n==0)return;
else {fun(n/8);printf("%d",n%8);}}
int main()
{
  int n;
  scanf("%d",&n);
  fun(n);
  //type your code here
  return 0;
}