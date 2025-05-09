import java.util.Scanner;
class square_hollow
{
     public static void main(String [] args)
	 {
		Scanner kbd = new Scanner ( System.in );
        int n;
		int row;
		int col;
		//n = kbd.nextInt();
		for ( n = kbd.nextInt(), row = 1; row <= n; row++, System.out.println())
		{
		    for( col = 1; col <= n;col ++ )
			if ( row == 1 || row == n || col == 1 || col == n)
			   System.out.printf("* ");
			else
			   System.out.printf("  ");
		}
		
		
		
		
	 }
}