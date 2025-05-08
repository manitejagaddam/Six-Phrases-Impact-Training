#include<stdio.h>
#include<stdlib.h>
#include<math.h>
int main()
{

    int expo;
    for( expo = 1; expo < 10; expo++)
    {
        printf("%d ^ %d = %f\n", 10,expo, pow(10,expo));
    }
    return EXIT_SUCCESS;
}
