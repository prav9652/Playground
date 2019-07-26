#include<stdio.h>
#include<string.h>
int main()
{
	//type your code here
  char s[100];int i,c=0;
  scanf("%s",s);
  if(strlen(s)>20)
    printf("Invalid Input");
  else{
  for(int i=0;s[i]!='\0';){
  if(s[i]==s[i+1]){c++;i++;}
  else {printf("%c%d",s[i],c+1);c=0;i++;}}}
  
  
}