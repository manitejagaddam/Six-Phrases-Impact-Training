import java.util.Scanner;
class triangle_2
{
     public static void main(String [] args)
	 {
		Scanner kbd = new Scanner ( System.in );
        int n;
		int row;
		int col;
		//n = kbd.nextInt();
		for ( n = kbd.nextInt(), row = n; row >= 1; row--, System.out.println())
		{
		    for( col = 1; col <= row;col ++ )
			   System.out.printf("* ");
		}
		
		
		
		
	 }
}