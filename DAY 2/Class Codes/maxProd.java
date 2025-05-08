import java.util.Scanner;
class maxProd{
	 private static void print_three( int num )
	 {
	  for( int copy_num = num; copy_num != 0; copy_num-=3)
	     System.out.print("3 ");
	 }
     public static void main(String [] args)
	 {
		Scanner kbd = new Scanner ( System.in );
		int num;
		num = kbd.nextInt();
	    if ( num % 3 == 0)
		   print_three(num);
		else if ( num % 3 == 1)
        {
			System.out.printf("2 2 ");
			print_three(num-4);
		}		
		else
		{
			System.out.printf("2 ");
			print_three(num-2);

		}
		   

	 }
}