/*
		gcd(a,b) = gcd ( b, a%b)

*/
import java.util.Scanner;
class gcd_euclid
{
     public static void main(String [] args)
	 {
		Scanner kbd = new Scanner ( System.in );
		long num1;
		long num2;
		long num1_mod_num2;
		num1 = kbd.nextLong();
		num2 = kbd.nextLong();
		
		num1_mod_num2 = num1 % num2; // prime
		while ( num1_mod_num2 != 0)
		{
		   num1 = num2;
		   num2 = num1_mod_num2;
		   num1_mod_num2 = num1 % num2; // secondary
		}
		System.out.println(num2);
		
		
		
		
		
		
		
		
		
		
		
	 }
}