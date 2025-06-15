import java.util.Scanner;
import java.util.Random;
class x_matrix
{
 public static void print ( int [][] arr )
	 {
	    int row;
		int col;
		System.out.println();
		for( row = 0; row < arr.length; row++, System.out.println())
		    for( col = 0; col < arr[0].length; col ++)
			   System.out.printf("%02d ", arr [ row ] [ col ] );
	 }
     public static void main(String [] args)
	 {
		Scanner kbd = new Scanner ( System.in );
        int dim;
		dim = kbd.nextInt();
		int [][] arr = new int [ dim ] [ dim ];
		int row;
		int col;
		Random rnd = new Random ();
		for( row = 0; row  < dim; row++)
		   arr [ row ] [ row ] = rnd.nextInt(10);
		   
		for( row = 0, col = dim - 1; row < dim; row++, col--)
		   arr [ row ] [ col ] = rnd.nextInt(98)+1;
		
		//arr [ 0 ] [ 2 ] = 1;
		boolean x_matrix_flag;
		x_matrix_flag = true;
        for( row =0; row < dim; row++)
		{
			for ( col = 0 ; col < dim ; col ++)
			{
				if ( row==col || (row+col+1)==dim)
				{
					if ( arr [ row ] [ col ] == 0 )
					{
						x_matrix_flag = false;
						break;
					}
						
				}
				else
				{
					if ( arr [ row ] [ col ] != 0 )
					{
						x_matrix_flag = false;
						break;
					}					
				}
			}
		}			
		print ( arr );
		System.out.println ( x_matrix_flag );
		   
		   
		   
		   
		   
	 }
}