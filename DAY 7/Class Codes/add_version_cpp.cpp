
#include<stdio.h>
#include<stdlib.h>
int add( int n1, int n2 )
{
    int sum;
    sum = n1 + n2;
    return sum;

}

int add( int n1, int n2 , int n3 )
{
    int sum;
    sum = n1 + n2 + n3;
    return sum;

}


void swapArr( int ptr1[], int ptr2[] )
{
    int temp;
    temp = ptr1[ 0 ];
    ptr1 [ 0 ] = ptr2 [ 0 ];
    ptr2 [ 0 ] = temp;

}

void swapPtr ( int * ptr1, int *ptr2)
{
    int temp;
    temp = *(ptr1 );
    *(ptr1) = *ptr2;
    *ptr2 = temp;
}

int main()
{

    printf( " sum of 10 and 20 = %d\n", add( 10, 20));
    printf( " sum of 100 and 200 and 300 = %d\n", add( 100, 200, 300));
    int n1;
    int n2;
    n1 = 100;
    n2 = 200;
    printf("b4 n1 = %d, n2 = %d\n", n1, n2);
    swapArr( &n1, &n2);
    printf("A1 n1 = %d, n2 = %d\n", n1, n2);
    swapPtr( &n1, &n2);
    printf("A2 n1 = %d, n2 = %d\n", n1, n2);

}









