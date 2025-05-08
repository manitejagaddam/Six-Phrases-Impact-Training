import java.util.Scanner;
class sum_35_opti2
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
        int num3;
		long sum3;
		num3 = n / 3;
		sum3 = 3 * ( num3 * (num3+1))/2;
        int num5;
		long sum5;
		num5 = n / 5;
		sum5 = 5 * ( num5 * (num5+1))/2;
        int num15;
		long sum15;
		num15 = n / 15;
		sum15 = 15 * ( num15 * (num15+1))/2;
		sum = ( sum3 + sum5 ) - sum15;

		long stop = System.currentTimeMillis();
		double duration = ( stop - begin ) / 1000.0;
		System.out.printf("n=%d sum = %d duration = %.3f", n, sum,duration);
	 }
}