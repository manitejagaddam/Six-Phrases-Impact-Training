/*

    1   1   1900
    12  5   2025
    */

#include<stdio.h>
#include<stdlib.h>
#define BDD 1
#define BMM 1
#define BYYYY 1900
char* days[] = { "Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday" };
class b1_parul_date
{
    int offSet;
public:
    void dayOf()
    {
        printf("%s", days[offSet % 7]);
    }
    static int isvalid(int dd, int mm, int yyyy)
    {
        if (yyyy <= 0) return 0;
        if (mm <= 0 || mm > 12) return 0;
        if (dd <= 0) return 0;
        int dim[] = { 0,31,28,31,30,31,30,31,31,30,31,30,31 };
        if (isLeap(yyyy) == 1)
            dim[2] = 29;
        if (dd > dim[mm])
            return 0;

        return 1;

    }
    static int isLeap(int year)
    {
        return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
    }
    b1_parul_date(int dd = 1, int mm = 1, int yyyy = 1900)
    {
        int lut_months[] = { 0,0,31,59,90,120,151,181,212,243,273,304,334 };
        if (isvalid(dd, mm, yyyy) == 0)
        {
            dd = 1;
            mm = 1;
            yyyy = 1900;
        }
        // walk as years

        offSet = 0;
        int temp_year;
        for (temp_year = BYYYY; temp_year < yyyy; temp_year++)
        {
            offSet += (365 + isLeap(temp_year));
        }
        offSet += lut_months[mm];
        offSet += dd;
        if (isLeap(yyyy) && mm > 2)
            offSet++;

        //return temp;

    }
    void printDate() // given date
    {
        struct b1_parul_date temp;
        int lut_months[] = { 0,0,31,59,90,120,151,181,212,243,273,304,334 };
        //printf("%d", gd.offSet);
        temp.offSet = offSet;
        int dd;
        int mm;
        int yyyy;
        for (yyyy = BYYYY; temp.offSet > 365; yyyy += 1)
        {
            temp.offSet -= (365 + isLeap(yyyy));
        }
        for (mm = 1; temp.offSet > lut_months[mm]; mm++);
        mm--;
        dd = temp.offSet - lut_months[mm];
        printf("%02d/%02d/%d\n", dd, mm, yyyy);
    }
    struct b1_parul_date addDate(int nod)
    {
        struct b1_parul_date temp;
        temp.offSet = offSet + nod;
        return temp;
    }
}; // struct b1_parul_date ends here
int main()
{

    struct b1_parul_date today(-12, -45, 2025);
    //printDate ( today );
    today.printDate();
    struct b1_parul_date dob_nisarg(23, 6, 2002);
    struct b1_parul_date matDate;
    matDate = dob_nisarg.addDate(10000);

    today.dayOf();
    dob_nisarg.dayOf();







}
