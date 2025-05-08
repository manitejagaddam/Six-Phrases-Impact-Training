import java.util.Scanner;
class arms_gen_v2
{
     private static int numberOfDigits ( int data )
	 {
	    int copy_data;
		int nod; // number Of Digits
		for( copy_data = data, nod  = 0; copy_data !=0 ; copy_data/=10)
		{
		   nod ++;
		}
		return nod;
	 }
     public static void main(String [] args)
	 {
		Scanner kbd = new Scanner ( System.in );
        int n;
		int num;
		int nod_num;
		int copy_num;
		int digit;
		int powered_digit;
		int sum;
		n = kbd.nextInt();
		long begin = System.currentTimeMillis();
		for( num = 1 ; num <= n; num++)
		{
//		   nod_num = ((int)Math.log10(num)+1);;
           nod_num = numberOfDigits( num );
		   copy_num = num;
		   sum = 0;
		   while ( copy_num != 0 )
		   {
		   digit = copy_num % 10;
		   powered_digit =(int) Math.pow(digit, nod_num);
		   sum += powered_digit;
		   copy_num /= 10;
		   }
		   if ( sum == num )
		      System.out.printf("%d ", num);
		}
		long stop = System.currentTimeMillis();
		double duration = ( stop - begin ) / 1000.0;
		System.out.printf("n=%d, duration = %.3f",n, duration);
		
		
		
		
		
		
		
		
		
	 }
}