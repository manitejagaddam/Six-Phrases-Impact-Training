#include<stdio.h>
#include<stdlib.h>
void a()
{
int num1;
int num2;
int num3;
printf("a () %u %u %u\n", &num1, &num2, &num3);
//b();
}
void b()
{
int num1;
int num2;
int num3;
printf("b () %u %u %u\n", &num1, &num2, &num3);
}
int main()
{
int num1;
int num2;
int num3;
printf("main () %u %u %u\n", &num1, &num2, &num3);
a();
b();
}
