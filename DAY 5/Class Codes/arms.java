import java.util.Scanner;
class arms
{
     public static void main(String [] args)
	 {
	   Scanner kbd = new Scanner ( System.in );
	   int num;
	   int nod_num;
	   int digit;
	   int powered_digit;
	   int sum;
	   int copy_num;
	   
	   num = kbd.nextInt();
	   // find the number of digits
	   
	   nod_num = 0;
	   copy_num = num;
	   while ( copy_num != 0)
	   {
	   copy_num /= 10;
	   nod_num++;
	   }
	   
	   copy_num = num;
	   
	   sum = 0;
	   while ( copy_num != 0)
	   {
	   digit = copy_num % 10;
	   powered_digit =(int) Math.pow( digit, nod_num );
	   sum += powered_digit;
	   copy_num /= 10;
	   }
	   if ( sum == num )
	       System.out.println("Armstrong");
	    else
	       System.out.println("! Armstrong");
		   

	   
	   
	   
	   
	   
	   
	
	 }
}
