import java.util.Scanner;
class sum_of_digits_recursive
{
     private static int sumOfDigits_helper ( int value )
	 {
	   if ( value == 0 ) 
		 return 0;
		 return value % 10 + sumOfDigits_helper ( value / 10);
	 }
     public static int sumOfDigits ( int val )
	 {
	    // arms
		int copy_val;
		if ( val <  0)
		   copy_val = -val;
		   else
		   copy_val = val;
		if ( copy_val > 0 && copy_val < 10 )
        {
		   return copy_val;
			 }		 
			 // env
			 // call helper - recursv
			 return sumOfDigits_helper ( copy_val );
	 }
     public static void main(String [] args)
	 {
		Scanner kbd = new Scanner ( System.in );
        int num;
		int sod_num;
		num = kbd.nextInt();
		sod_num = sumOfDigits ( num );
		System.out.printf("num = %d , sod_num =%d\n",num, sod_num);
	 }
}