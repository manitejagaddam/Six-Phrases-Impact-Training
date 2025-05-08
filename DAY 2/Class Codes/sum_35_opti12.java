import java.util.Scanner;
class sum_35_opti12
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
		for ( num = 3; num <= n; num +=3)
		    sum+=num;
		for ( num = 5; num <= n; num +=5)
			      sum+=num;
		for ( num = 15; num <= n; num +=15)
			      sum-=num;

		long stop = System.currentTimeMillis();
		double duration = ( stop - begin ) / 1000.0;
		System.out.printf("n=%d sum = %d duration = %.3f", n, sum,duration);
	 }
}