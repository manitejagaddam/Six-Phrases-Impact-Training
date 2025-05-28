#include<stdio.h>
#include<stdlib.h>
int main ( int argc , char*argv[])
{

int ctr;
for( ctr = 0; ctr < argc; ctr++)
{
   printf("%s at %u\n", argv[ctr], *(argv+ctr));
}


return EXIT_SUCCESS;
}
