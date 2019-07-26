#include<stdio.h>
#include<string.h>
int main()
{
  //Type your code here
  char st[100];
  scanf("%[^\n]s",st);
  printf("%d",strlen(st));
  return 0;
}