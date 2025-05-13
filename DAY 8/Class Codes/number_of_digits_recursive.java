import java.util.Scanner;
class number_of_digits_recursive
{
     private static int numberOfDigits_helper ( int num )
	 {
	     if ( num == 0 )return 0;
		 return 1 + numberOfDigits_helper ( num / 10);
	 }
     public static int numberOfDigits ( int data )
	 { 
	     // arm
		 if ( data > 0 && data < 10) return 1;
		 if ( data >-10 && data < 0 ) return 1;
		 // env
		 // call helper - recursive, pass, initiate
		 return numberOfDigits_helper( data );
		 
		 
	 }
     public static void main(String [] args)
	 {
		Scanner kbd = new Scanner ( System.in );
        int num;
		num = kbd.nextInt();
		int nod_num;
		nod_num = numberOfDigits(  num );
		System.out.printf("num = %d, nod_num = %d", num, nod_num);
	 }
}