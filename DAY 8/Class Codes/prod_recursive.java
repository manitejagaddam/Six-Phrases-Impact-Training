import java.util.Scanner;
class prod_recursive
{
     private static int multilply_helper ( int mand, int mier )
	 {
	    // base 
		if (mier == 0)
		   return 0;
		   return mand + multilply_helper ( mand , mier - 1);
	 }
	 
     public static int multilply ( int multiplicand, int multiplier )
     {
	     if ( multiplicand == 0 || multiplier == 0)
		     return 0;
	     if ( multiplicand == 1)
		    return multiplier;
	     if ( multiplicand == -1)
		    return -multiplier;
			
		 if ( multiplier == 1)
		     return multiplicand;
		 if ( multiplier == -1)
		     return -multiplicand;
			 
		// env
			int work_multiplicand;
			int work_multiplier;
			int sign_mand;
			int sign_mier;
			sign_mand = 1;
			sign_mier = 1;
			
			work_multiplicand = multiplicand;
			work_multiplier   = multiplier;
			if ( work_multiplicand < 0)
			{
			   work_multiplicand = -work_multiplicand;
			   sign_mand = -1;
			   }
			if ( work_multiplier < 0)
			{
               work_multiplier   = -work_multiplier;
			   sign_mier = -1;
			   }
            int res;
			res = multilply_helper( work_multiplicand, work_multiplier);
			
			 return res * sign_mand * sign_mier;
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
     }	 

     public static void main(String [] args)
	 {
		Scanner kbd = new Scanner ( System.in );
		int multiplicand;
		int multiplier;
		int product;
		multiplicand = kbd.nextInt();
		multiplier   = kbd.nextInt();
		product = multilply( multiplicand, multiplier );
		System.out.printf("%d X %d = %d\n", multiplicand, multiplier, product);
	 }
}