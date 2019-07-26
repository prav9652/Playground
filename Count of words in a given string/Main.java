#include<stdio.h>

int main()
{
  //Type your code here
  char st[100];int i,c=0;
scanf("%[^\n]s",st);
  for(i=0;st[i]!='\0';i++){
  if(st[i]==' ')c++;}
  printf("%d",c+1);
}