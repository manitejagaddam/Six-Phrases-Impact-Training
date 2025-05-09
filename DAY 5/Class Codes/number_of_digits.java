// find the number of digits
import java.util.Scanner;
class number_of_digits
{
     public static void main(String [] args)
	 {
		Scanner kbd = new Scanner ( System.in );
		long number;
		int digit_s;
		int nod; //number of Digits
		number = kbd.nextLong();
		//number = 1233456789012345L;
		nod = 0;
		while ( number != 0)
		{
		    digit_s =(int) (number % 10);
			// process
			nod ++;
			System.out.println(digit_s);
			number /= 10;
		}
        System.out.println( nod );
	 }
}