import java.util.Scanner;
class abund_defi_perf
{
     public static void main(String [] args)
	 {
		Scanner kbd = new Scanner ( System.in );
		int num;
		int isFactor;
		int sum_of_proper_divisors_num;
		num = kbd.nextInt();
		sum_of_proper_divisors_num = 1;
		long start = System.currentTimeMillis();
		int until = Math.sqrt(num());
		for( isFactor = 2; isFactor < until ; isFactor++)
		 {
		  if ( num % isFactor == 0)
        sum_of_proper_divisors_num += ( isFactor + (num/isFactor) ); 
		 }
		 if ( isFactor * isFactor == num )
		      sum_of_proper_divisors_num += isFactor;
			     
			 
		 
		 long stop = System.currentTimeMillis();
		 double duration = ( stop - start) / 1000.0;
		 
		 System.out.printf("\n%.3f\n",duration);
		 System.out.printf("SOPD = %d\n", sum_of_proper_divisors_num);
		 if ( num == sum_of_proper_divisors_num )
		     System.out.println("P E R F E C T !!!!!");
	     else if ( num > sum_of_proper_divisors_num )
		     System.out.println("D E F I C I E N T!!!!!");
	     else
		     System.out.println("A B U N D A N T!!!!!");
		 
  		 
  		 

	 }
}