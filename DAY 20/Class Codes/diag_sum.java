import java.util.Scanner;
import java.util.Random;
class diag_sum
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
		Random rnd = new Random();
		int row;
		int col;
		int [][] arr = new int [ dim ] [ dim ];
		for( row = 0; row < dim ; row++)
		  for ( col = 0; col < dim; col ++)
		     arr [ row ] [ col ] = rnd.nextInt( 10);
		print( arr );

        // major diag_sum
        int major_diag_sum = 0;
        for( row = 0, col = 0; row < dim; row++, col++)
            major_diag_sum += arr [ row ] [ col ];		
        // minor diag_sum
        int minor_diag_sum = 0;
        for( row = 0, col = dim-1; row < dim; row++, col--)
            minor_diag_sum += arr [ row ] [ col ];  
        int diag_sum = major_diag_sum + minor_diag_sum;
        if ( dim % 2 != 0 )
            diag_sum -= arr [ dim / 2 ] [ dim / 2 ];
        System.out.printf("Major = %d\n",major_diag_sum );
        System.out.printf("Minor = %d\n",minor_diag_sum );
        System.out.printf("Diag_sum = %d\n", diag_sum );
		
	 }
}