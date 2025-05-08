import java.util.Scanner;
class lsd_access
{
     public static void main(String [] args)
	 {
		Scanner kbd = new Scanner ( System.in );
		int num;
		num = kbd.nextInt();
		int digit;
		// LSD
		// Find the power
		// 1 011 011 101 100 110
		// use modulo operator and QUERY the digit_s
		// process
		// remove the digit_s 
		if ( num < 0)
			num = 0 - num;
		// num *= -1
		// num = -num
		// num = Math.abs(num)
		while ( num != 0) // 344 34
		{
		digit = num % 10;
		System.out.println(digit);
		num/=10;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	 }
}