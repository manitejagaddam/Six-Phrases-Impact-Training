import java.util.Scanner;
class square_Demo
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
		    for( col = 1; col <= n; col +=1)
			{
			   System.out.printf("*");
			}
		}
		
		
		
		
	 }
}