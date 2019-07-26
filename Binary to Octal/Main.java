#include<stdio.h>
#include<string.h>

void fun(int n){
if(n==0)return;
fun(n/8);
printf("%d",n%8);}
int main()
{
  
  char s[100];
  int i,j=0,c=0;
  scanf("%s",s);//printf("%s",s);
  for(i=strlen(s)-1;i>=0;i--,j++){
  c=c+(s[i]-'0')*pow(2,j);}
  //printf("%d",c);
  fun(c);
  return 0;
}