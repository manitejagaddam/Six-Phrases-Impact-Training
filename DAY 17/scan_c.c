#include<stdio.h>

void main(){
    int a,b,c,x,y,z;
    int p,q,r;

    printf("Enter three integers : ");
    scanf("%d %d %d",&a,&b,&c);
    printf("%d %d %d\n\n",a,b,c);

    printf("Enter two 4-digit numbers :" );
    scanf("%2d %4d",&x,&y);
    printf("%d %d\n\n",x,y);

    printf("Enter two integers : ");
    scanf("%*d %d",&a,&x);
    printf("%d %d\n\n",a,x);

    printf("Enter a 9-digit number : ");
    scanf("%3d %4d %3d",&p,&q,&r);
    printf("%d %d %d\n\n",p,q,r);

    printf("Enter two 3-digit numbers :");
    scanf("%*d %d",&x,&y);
    printf("%d %d\n\n",x,y);

}
