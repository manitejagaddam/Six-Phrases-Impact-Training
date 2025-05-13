import java.util.Scanner;
class print_n_to_1_recursive
{
     private static void print_n_to_1_helper ( int n)
	 {
	    // base case
		if ( n == 0) return;
		
		System.out.printf("%d ", n );
		print_n_to_1_helper( n- 1);
	 }
     public static void print_n_to_1 ( int n )
	 {
	     // arm
		 if ( n == 1)
		 {
		    System.out.printf("%d", 1);
			return;
		 }
		 // env
		 
		 // call helper
		 
		 print_n_to_1_helper( n);
		 
		 
		 
		 
		 
	 }
     public static void main(String [] args)
	 {
		Scanner kbd = new Scanner ( System.in );
        int n;
		n = kbd.nextInt();
		print_n_to_1 ( n );
	 }
}
