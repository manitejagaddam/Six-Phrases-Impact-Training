import java.util.Scanner;
class lsd_access_harshad
{
     public static void main(String [] args)
	 {
		Scanner kbd = new Scanner ( System.in );
		int num;
		num = kbd.nextInt();
		int digit;
		int copy_num;
		int sod; // sum of digits
		sod =0;
		copy_num = num;
		while ( num != 0) // 344 34
		{
		digit = num % 10;
		//System.out.println(digit);
		sod += digit;
		num/=10;
		}
		num = copy_num;
		System.out.printf("%s", num % sod == 0 ? "Harshad" : "Not Harshad");
		//System.out.println(sod);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	 }
}