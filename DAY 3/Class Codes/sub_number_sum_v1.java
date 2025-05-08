import java.util.Scanner;
class sub_number_sum_v1
{
     public static void main(String [] args)
	 {
		Scanner kbd = new Scanner ( System.in );
        int num;
		int copy_num1;
		int copy_num2;
		int digit_s;
		int power;
		int sum;
		num = kbd.nextInt();
		copy_num1 = num;
		sum = 0;
		while ( copy_num1 != 0)
		{
		   copy_num2 = copy_num1;
		   power=10;
		   while ( power/10 < copy_num2)
		   {
		      digit_s = copy_num2 % power;
			  System.out.println( digit_s);
			  sum += digit_s;
			  power *= 10;
		   }
		   copy_num1/=10;
		}
		System.out.printf("sum = %d", sum);
	 }
}