import java.util.Scanner;
class pattern
{
     public static void main(String [] args)
	 {
		Scanner kbd = new Scanner ( System.in );
		int n;
		int row;
		int col;
		int printNum;
		printNum = 1;
		n = kbd.nextInt();
		for( row = 1; row <= n; row++, System.out.println())
		{
		   if ( row % 2 == 0)
		   {
		      for ( col =1 ; col <= row; col +=1)
			     System.out.printf("%d ", printNum++);
		   }
		   else
		   {
		      for ( col =1 ; col <= row; col +=1)
                    ++printNum;
		      for ( col =1 ; col <= row; col +=1)
			     System.out.printf("%d ", --printNum);
			  printNum+=row;
		   }
		}
	 }
}