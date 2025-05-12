/*

    1   1   1900
    12  5   2025
    */

#include<stdio.h>
#include<stdlib.h>
#define BDD 1
#define BMM 1
#define BYYYY 1900
char * days[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
struct b1_parul_date
{
    int offSet;

};







void dayOf(struct b1_parul_date gd )
{
    printf("%s", days [ gd.offSet % 7 ]);
}
static int isLeap ( int year )
{
    return ( ( (year%4==0) && (year%100!=0) ) || (year%400==0) );
}
struct b1_parul_date constructDate( int dd, int mm, int yyyy)
{
    int lut_months[] = {0,0,31,59,90,120,151,181,212,243,273,304,334};
   // walk as years
   struct b1_parul_date temp;
   temp.offSet = 0;
   int temp_year;
   for( temp_year = BYYYY ; temp_year < yyyy ; temp_year++)
   {
       temp.offSet += ( 365 + isLeap ( temp_year));
   }
   temp.offSet += lut_months [ mm ];
   temp.offSet += dd;
   if ( isLeap (yyyy) && mm > 2)
    temp.offSet++;

    return temp;

}
void printDate ( struct b1_parul_date gd ) // given date
{
    struct b1_parul_date temp;
     int lut_months[] = {0,0,31,59,90,120,151,181,212,243,273,304,334};
    //printf("%d", gd.offSet);
    temp.offSet = gd.offSet;
    int dd;
    int mm;
    int yyyy;
    for( yyyy = BYYYY; temp.offSet > 365 ; yyyy += 1)
    {
         temp.offSet -= ( 365 + isLeap ( yyyy ));
    }
    for ( mm = 1; temp.offSet > lut_months[mm]; mm++);
    mm--;
    dd = temp.offSet - lut_months[ mm ];
    printf("%02d/%02d/%d\n", dd, mm, yyyy);
}
struct b1_parul_date addDate ( struct b1_parul_date gd, int nod )
{
   struct b1_parul_date temp;
   temp.offSet = gd.offSet + nod;
   return temp;
}
int main()
{

 struct b1_parul_date today ;
 today = constructDate( -12, -45, 2025);
 printDate ( today );
 struct b1_parul_date dob_nisarg;
 dob_nisarg = constructDate( 23, 6, 2002);
 struct b1_parul_date matDate = addDate( dob_nisarg , 10000);

 dayOf ( today);
 dayOf ( dob_nisarg );
 today







}
