class polyDivisible_base10
{
     private static void polyDivisible_helper ( int [] used, int radix, int curr_res, int digit_wf)
	 {
	      // check for SOLVED
		  if ( digit_wf == radix )
		  {
		     System.out.println( curr_res );
			 return; 
		  }
	     // enumerate all the choices
		 // 1,2.......radix - 1
		 int choice_digit;
         for( choice_digit = 1; choice_digit < radix ; choice_digit ++)
         {
		      if ( used [ choice_digit ] == 1)
			      continue;
			  int res = curr_res * 10 + choice_digit;
			  if ( res % digit_wf == 0 )
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
		solvePolyDivisible ( 10) ;
	 }
}