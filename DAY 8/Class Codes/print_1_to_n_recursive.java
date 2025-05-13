import java.util.Scanner;
class print_1_to_n_recursive
{
	private static void print_1_to_n_helper ( int num, int n)
	{
	   // base
	   if ( num > n) return;
	   
	   System.out.printf("%d ", num);
	   print_1_to_n_helper ( num+1, n);
	}
     public static void print_1_to_n ( int n )
	 {
	    // arm
		if ( n == 1)
		{
		   System.out.print(1);
		   return;
		   }
		// set an env

		// call helper - recursive, pass the env, initiate
		print_1_to_n_helper ( 1, n );
		
		
	 }
     public static void main(String [] args)
	 {
		Scanner kbd = new Scanner ( System.in );
        int till;
		till = kbd.nextInt();
		print_1_to_n( till );
	 }
}