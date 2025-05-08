import java.util.Scanner;
class sum_35
{
     public static void main(String [] args)
	 {
		Scanner kbd = new Scanner ( System.in );
        int n;
		int num; 
		long sum;
		sum = 0;
		n = kbd.nextInt();
		long begin = System.currentTimeMillis();
		for ( num = 1; num <= n; num ++)
		{
		  if ( num % 3 == 0 || num % 5 == 0)
		     sum+=num;
		}
		long stop = System.currentTimeMillis();
		double duration = ( stop - begin ) / 1000.0;
		System.out.printf("n=%d sum = %d duration = %.3f", n, sum,duration);
	 }
}