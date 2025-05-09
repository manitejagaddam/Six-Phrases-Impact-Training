import java.util.Scanner;
class pattern1_1
{
     public static void main(String [] args)
	 {
		Scanner kbd = new Scanner ( System.in );
        int n;
		int row;
		int col;
		int col1;
		n = kbd.nextInt();
		
		for( row = 1; row <= n; row++)
		{
		   // star
		   for( col = 1; col <= n-row+1; col++)
             System.out.printf("%d ",col);
			 //temp = 1;
           for( col1 = 1; col1 <= row - 1; col1 ++)
             System.out.printf("%d ", col1);
		   System.out.println();
		}
	 }
}