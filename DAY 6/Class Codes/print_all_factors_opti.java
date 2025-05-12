import java.util.Scanner;
class print_all_factors_opti
{
     public static void main(String [] args)
	 {
		Scanner kbd = new Scanner ( System.in );
		int num;
		int isFactor;
		num = kbd.nextInt();
		long start = System.currentTimeMillis();
		for( isFactor = 1; isFactor <= num/2 ; isFactor++)
		 {
		    if ( num % isFactor == 0)
			    System.out.printf("%d ", isFactor); 
		 }
			    System.out.printf("%d ", num); 
		 
		 long stop = System.currentTimeMillis();
		 double duration = ( stop - start) / 1000.0;
		 
		 System.out.printf("\n%.3f\n",duration);

	 }
}