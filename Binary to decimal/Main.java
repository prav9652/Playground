#include<stdio.h>
#include<string.h>
int main()
{
  char ip[100];int i,s=0,j;
  scanf("%s",ip);
  for(i=strlen(ip)-1,j=0;i>=0;i--,j++){
  s=s+((ip[i]-'0')*pow(2,j));}
  printf("%d",s);
  //Type your code here
  return 0;
}