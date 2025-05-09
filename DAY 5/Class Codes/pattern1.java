import java.util.Scanner;
class pattern1
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
		   for( col = 1; col <= n-row+1; col++)
             System.out.printf("* ");
           for( col = 1; col <= row - 1; col ++)
             System.out.printf("# ");
		   System.out.println();
		}
	 }
}