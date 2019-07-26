#include<stdio.h>
#include<math.h>
int main()
{
  float a,b,c,r1,r2,d;
  scanf("%f%f%f",&a,&b,&c);
  d=((b*b)-(4*a*c));
    if(d==0){
      r1=(-b)/(2*a);
      printf("root1 = %.2f  root2 = %.2f",r1,r1);
    }else if(d>0){
    r1=(-b-sqrt(d))/(2*a);
    r2=(-b+sqrt(d))/(2*a);
     printf("root1 = %.2f  root2 = %.2f",r2,r1);
    }else{
    printf("root1 = %.2f + %.2fi  ",-b/(2*a),sqrt(-d)/(2*a));
     printf("root2 = %.2f - %.2fi",-b/(2*a),sqrt(-d)/(2*a));}
  //Type your code here
  
}