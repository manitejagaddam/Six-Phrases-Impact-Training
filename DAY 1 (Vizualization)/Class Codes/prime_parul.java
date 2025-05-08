import java.util.Scanner;
class prime_parul
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
		for(cf = 2 ; cf <= Math.sqrt(num)  ; cf++)
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






