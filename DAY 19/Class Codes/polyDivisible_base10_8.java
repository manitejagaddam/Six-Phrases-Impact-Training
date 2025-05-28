class polyDivisible_base10_8
{
     private static int converter ( int data , int base )
	 {
	    int copy_data;
		int digit;
		int octalPower;
		int res;
		
		copy_data = data;
		octalPower = 1;
		res = 0;
		while ( copy_data != 0)
		{
		   digit = copy_data % 10;
		   res = res + digit * octalPower;
		   octalPower *= base;
		   copy_data/=10;
		}
		return res;
	 }
     private static void polyDivisible_helper ( int [] used, int radix, int curr_res, int digit_wf)
	 {
	  if ( digit_wf == radix )
		  {
		     System.out.println( curr_res );
			 return; 
		  }
	 int choice_digit;
		 int res;
		 int deciRes;
         for( choice_digit = 1; choice_digit < radix ; choice_digit ++)
         {
		      if ( used [ choice_digit ] == 1)
			      continue;
			  res = curr_res * 10 + choice_digit;
			//  if ( radix != 10)
			     deciRes = converter( res , radix );
			 		
			  if ( deciRes % digit_wf == 0 )
			  {
			       used [ choice_digit ] = 1;
				   polyDivisible_helper ( used, radix, res, digit_wf+1);
				   used [ choice_digit ] = 0;		   
			  }
         }
		 
	}
	 
     public static void solvePolyDivisible( int radix )
	 {
	    // arms length, validation
		
		// set an environment
		int [] used = new int [ radix ];
		
		// call helper - recursive, pass, initiate
		polyDivisible_helper ( used, radix, 0, 1);
	 }
     public static void main(String [] args)
	 {
		solvePolyDivisible ( 2 ) ;
		System.out.println();
		solvePolyDivisible ( 4 ) ;
		System.out.println();
		solvePolyDivisible (  6 ) ;
		System.out.println();
		solvePolyDivisible ( 8 ) ;		
		System.out.println();
		solvePolyDivisible ( 10 ) ;
		
	 }
}