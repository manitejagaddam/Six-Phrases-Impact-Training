import java.util.Scanner;
class pyramid
{
     public static void main(String [] args)
	 {
		Scanner kbd = new Scanner ( System.in );
        int n;
		int row;
		int col;
		
		n = kbd.nextInt();
		
		for( row = 1; row <= n; row++)
		{
		   // star
		   for( col = 1; col <= n-row; col++)
             System.out.printf("  ");
			 //temp = 1;
           for( col = 1; col <= 2*row - 1; col ++)
             System.out.printf("* ");
		   System.out.println();
		}
	 }
}