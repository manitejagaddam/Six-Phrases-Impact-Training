import java.util.Scanner;
class square_for
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
			   System.out.printf("* ");
		}
		
		
		
		
	 }
}