import java.util.Scanner;
class polyDivisibleSri
{
    public static long anyBaseConverter (String strval, int base )
	{
	   int strval_ind;
	   long power;
	   int digit;
	   long res;
	   char ch;
	   res = 0;
	   power = 1;
	   for( strval_ind = strval.length() - 1; strval_ind >= 0; strval_ind --)
	   {
		  ch = strval.charAt( strval_ind );
		  if ( ch > '9' )
	           digit = ch - 55;
		  else
               digit = ch - 48;			  
		  res = res + digit * power;
		  power *= base;
	   }
	   return res;
	}
     private static void polyDivisible_solver_helper( 
	   int [] used, int radix, String res, String pd, int pd_ind )
	   {
	       if ( pd_ind == radix )
		   {
		       System.out.println( res );
			   return;
		   }
	      // enemerate all the options
		  // pd -> ind 0		  to base - 1
		  int work_pd_ind;
		  String test;
		  char ch;
		  for( work_pd_ind = 1; work_pd_ind < radix ; work_pd_ind ++)
		  {
		     if ( used [ work_pd_ind] == 1)
			      continue;
		     test = res + pd.charAt( work_pd_ind );
             long testValue;
             testValue = anyBaseConverter ( test, radix);
			 int testDigit;
			 ch = pd.charAt( pd_ind);
			 if ( ch >= 'A')
			     testDigit = ch - 55;
			 else
			    testDigit = ch - 48;
             if ( testValue % testDigit == 0 )
			 {
			     used [ work_pd_ind ] = 1;
				 
				 polyDivisible_solver_helper ( used, radix, test, pd, pd_ind+1);
				 
				 used [ work_pd_ind ] = 0;
			 }
			 
		  }
	   }
     public static void polyDivisible_solver( int base )
	 {
	   // arms length and validation
	   if ( base == 2)
	   {
	     System.out.println(1);
         return ;		 
	   }
	   if ( base % 2 != 0)
	       return;
		// setup an envuronement
        int [] used = new int [ base ];
		
        String possible_digits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		// CALL HELPER - RECURSIVE , PASS , INITIATE
		
		polyDivisible_solver_helper ( used, base, "", possible_digits, 1 );
		
	   
	   
	   
	 }
     public static void main(String [] args)
	 {
		Scanner kbd = new Scanner ( System.in );
        int base;
		base = kbd.nextInt();
		polyDivisible_solver ( base );
	 }
}