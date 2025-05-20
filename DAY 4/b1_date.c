#include<stdio.h>
#include<stdlib.h>
struct b1_date
{
    unsigned short folded_date;

};
// behaviours
struct b1_date makeDate( int dd, int mm, int yyyy)
{
    struct b1_date temp;
    temp.folded_date = ( yyyy - 1980 ) * 512 + mm * 32 + dd;
    return temp;
}

void showDate ( struct b1_date gd ) // gd -> given date
{
    int dd;
    int mm;
    int yyyy;
    yyyy = 1980 + ( gd.folded_date / 512);
    mm   = (gd.folded_date % 512) / 32;
    dd   = (gd.folded_date%512) % 32;
    printf("%02d:%02d:%d\n", dd, mm , yyyy);
}
static int days_in_months [] = {0,31,28,31,30,31,30,31,31,30,31,30,31};

#define TRUE 1
#define FALSE 0
static int isLeap( int year)
{
    return ( ( (year%4==0) && (year%100!=0) ) || (year%400==0) ) ? TRUE : FALSE;
}
struct b1_date addDate( struct b1_date gd, int nod  ) // nod -> number of days
{
    struct b1_date temp;
    int dd;
    int mm;
    int yyyy;
    yyyy = 1980 + ( gd.folded_date / 512);
    mm   = (gd.folded_date % 512) / 32;
    dd   = (gd.folded_date%512) % 32;
    int copy_nod = nod;
    while ( copy_nod != 0 )
    {
    dd+=1;
    if ( dd > days_in_months [ mm ] )
    {
        mm+=1;
        if ( mm > 12)
        {
            mm = 1;
            yyyy+=1;
            if ( isLeap(yyyy) == TRUE)
            {
                days_in_months [ 2] = 29;
            }
            else
            days_in_months [ 2 ] = 28;
        }
        dd = 1;
    }





    copy_nod-=1;
    }




    temp.folded_date = ( yyyy - 1980 ) * 512 + mm * 32 + dd;

    return temp;

}
struct b1_date subtractDate ( struct b1_date gd, int nod )
{
    struct b1_date temp;
    int dd;
    int mm;
    int yyyy;
    yyyy = 1980 + ( gd.folded_date / 512);
    mm   = (gd.folded_date % 512) / 32;
    dd   = (gd.folded_date%512) % 32;
    int copy_nod = nod;

    while ( copy_nod != 0)
    {
        dd -= 1;
        if ( dd == 0)
        {
            mm-=1;
            if ( mm == 0)
            {
                yyyy--;
            if ( isLeap(yyyy) == TRUE)
            {
                days_in_months [ 2] = 29;
            }
            else
            days_in_months [ 2 ] = 28;

                mm=12;
            }
            dd = days_in_months [ mm ];

        }

     copy_nod-=1;

    }
    temp.folded_date = ( yyyy - 1980 ) * 512 + mm * 32 + dd;

return temp;
}
int main()
{

    struct b1_date dob_nisarg ;
    dob_nisarg = makeDate(23,6,2002);
    struct b1_date deposit_date;
    deposit_date = makeDate(23,6,2002);
    struct b1_date maturity_date;
    maturity_date = addDate( dob_nisarg, 5000);
    showDate( dob_nisarg );
    showDate(deposit_date);
    showDate(maturity_date);
    struct b1_date dob_parimala;

    struct b1_date today;
    today = makeDate( 8, 5, 2025);
    dob_parimala = subtractDate ( today, 7415 );
    showDate(dob_parimala);








    return EXIT_SUCCESS;
}
