import java.util.Scanner;
class print_all_factors_opti_better
{
     public static void main(String [] args)
	 {
		Scanner kbd = new Scanner ( System.in );
		int num;
		int isFactor;
		num = kbd.nextInt();
		long start = System.currentTimeMillis();
		for( isFactor = 1; isFactor < Math.sqrt(num) ; isFactor++)
		 {
		    if ( num % isFactor == 0)
			    System.out.printf("%d %d\n", isFactor, num/isFactor); 
		 }
		 if ( isFactor * isFactor == num )
			    System.out.printf("%d\n", isFactor); 
			 
		 
		 long stop = System.currentTimeMillis();
		 double duration = ( stop - start) / 1000.0;
		 
		 System.out.printf("\n%.3f\n",duration);

	 }
}