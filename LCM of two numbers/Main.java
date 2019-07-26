#include<stdio.h>
int main()
{
  int a,b,i,j;
  scanf("%d%d",&a,&b);i=a;j=b;
 // printf("%d\n",a);
while(a!=b){
if(a>b)a-=b;
else b-=a;}
  printf("%d",(i*j)/a);
  return 0;
}