#include <stdio.h>

int main()
{ 
  int a,b,c;
  char ch;
  scanf("%d%c%d%c%d",&a,&ch,&b,&ch,&c);
 // printf("%s\n",ip);
 // a=ip[0]-'0';b=ip[2]-'0';c=ip[4]-'0';
 //printf("%d\n",a);
 if(a>b && a>c){
  printf("%d",a);}
  else{ if(b>c)
    printf("%d",b);
       else printf("%d",c);}
return 0;
  // type your code here
}