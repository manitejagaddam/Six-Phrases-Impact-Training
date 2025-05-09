import java.util.Scanner;
class sqaure_while
{
     public static void main(String [] args)
	 {
		Scanner kbd = new Scanner ( System.in );
        int n;
		int row;
		int col;
		n = kbd.nextInt();
		row = 1;
		while ( row <= n  )
		{
		   col =1;
		   while ( col <= n )
		   {  
		      System.out.printf("*");
			  col ++;
			  }
		   
		   row++;
		   System.out.println();
		}
		
	 }
}