import java.util.Scanner;
class print_all_factors_v1
{
     public static void main(String [] args)
	 {
		Scanner kbd = new Scanner ( System.in );
		int num;
		int isFactor;
		num = kbd.nextInt();
		long start = System.currentTimeMillis();
		for( isFactor = 1; isFactor <= num ; isFactor++)
		 {
		    if ( num % isFactor == 0)
			    System.out.printf("%d ", isFactor); 
		 }
		 long stop = System.currentTimeMillis();
		 double duration = ( stop - start) / 1000.0;
		 
		 System.out.printf("\n%.3f\n",duration);

	 }
}