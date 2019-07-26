#include<stdio.h>
#include<math.h>
int main()
{
  //type your code here
  int n;
  scanf("%d",&n);
 // printf("%d\n",n);
  if(n%2==0){int j=(n/2)-1;
    printf("%.0f",pow(3,j));
  }else{
   // printf("%d\n",n/2);
  printf("%.0f",pow(2,n/2));}
  return 0;
}