import java.util.Scanner;
class lsd_access_sod
{
     public static void main(String [] args)
	 {
		Scanner kbd = new Scanner ( System.in );
		int num;
		num = kbd.nextInt();
		int digit;
		int sod; // sum of digits
		sod =0;
		while ( num != 0) // 344 34
		{
		digit = num % 10;
		//System.out.println(digit);
		sod += digit;
		num/=10;
		}
		System.out.println(sod);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	 }
}