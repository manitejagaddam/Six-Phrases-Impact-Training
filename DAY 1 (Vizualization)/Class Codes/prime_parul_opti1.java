import java.util.Scanner;
class prime_parul_opti1
{
     public static void main(String [] args)
	 {
		long num;
		long cf; // CHECK FOR FACTOR
		boolean factor_found_flag;
		factor_found_flag = false;
		Scanner kbd = new Scanner ( System.in );

		num = kbd.nextLong();
		long begin = System.currentTimeMillis();
		if ( num % 2 == 0)
		   factor_found_flag = true;
		   else
		for(cf = 3 ; cf <= Math.sqrt(num)  ; cf+=2)
        {
		   if ( num % cf == 0)
		   {
		       factor_found_flag = true;
			   break;
		   }
	    }
	    long stop = System.currentTimeMillis();
		double duration = ( stop - begin ) / 1000.0;
		if ( factor_found_flag == false )
		System.out.printf(" PRIME  %d -> duration = %.3f", num, duration);
}

}






