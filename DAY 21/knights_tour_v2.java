/*
main()
{
  user input dimension

  user input - row , col 

  solver( dim, row, col )
}



solver ( dim, row, col )
{
    // arms length and validation


   // set an environment
   create a grid
int [] [] grid = new int [ dim ] [ dim ]

 helper ( grid, row, col, 1)
}



helper ( grid, row, col, moveNumber )
{
   // enumerate all choices
   int wr;
   int wc;
   // Loop one by 1
   // check constraint

   // option1 -1 -2

  wr = row -1;
wc = col - 2;
if ( wr >= 0 && wc >= 0 && grid [ wr ] [ wc] == 0)
{
   grid [ wr ] [ wc ] = moveNumber;
   helper( grid, wr, wc, moveNumber+1)
   grid [ wr ] [ wc ] = 0;

}

  

}

0 to 7

1.30 

*/
import java.util.Scanner;

class knights_tour_v2
{ 
	 private static void print ( int [][] board , int dim )
	 {
		 int row;
		 int col;
		 for( row = 0; row < dim; row++, System.out.println())
		 {
			 for( col = 0; col < dim; col++)
				 System.out.printf("%02d  ", board [ row ] [col]);
		 }
	 }
     private static boolean kt_solver_helper ( int [][] cb, int dim, int [][] moves ,int row, int col , int moveNumber)
	 {
		 int move_row;
		 int move_col;

		 cb [ row ] [ col ] = moveNumber;
		 /* 
		 debug
		 print(cb,dim);
		 Scanner kbd = new Scanner ( System.in );
         char ch;
		 kbd.next().charAt(0);
		 */
		 if ( moveNumber == (dim * dim ))
		 {
			    print(cb, dim);
				return true ;
		 }
		 int moves_ind;
		 boolean res = false;
		 for( moves_ind  = 0; moves_ind < 8 ; moves_ind ++)
		 {
		 move_row = row + moves[moves_ind] [ 0 ];
		 move_col = col + moves[moves_ind] [ 1 ];
		 if( res == false && move_row >= 0 && move_col >= 0 && move_row < dim && move_col < dim && cb [ move_row ] [ move_col ] == 0)
		 {
			  res =  kt_solver_helper ( cb, dim, moves, move_row, move_col, moveNumber+1);
		 }
		 //return false;
	    }
				 cb [ row ] [ col ] = 0;

		return false;
	 }
     public static void kt_solver ( int dim, int row, int col )
	 {
	     // arms length
		 if ( dim < 5 ) 
		    return;
	     // create an environment
         int [][] cb = new int [ dim ] [ dim ];
		 int [][] moves = {
		                                    {-1,-2},
		                                    {-2,-1},
		                                    {-2,1},
		                                    {-1,2},
		                                    {1,2},
		                                    {2,1},
		                                    {2,-1},
		                                    {1,-2}
											
		                                    };
		 // call helper - recursive, pass, initiate
		 
		 kt_solver_helper ( cb, dim, moves, row, col , 1);
		 
			
	 }
     public static void main(String [] args)
	 {
		Scanner kbd = new Scanner ( System.in );
        int dim;
		int row;
		int col;
		dim = kbd.nextInt();
		/*row = kbd.nextInt();
		col = kbd.nextInt();
		kt_solver ( dim, row, col );*/

		row = 0;
		for( col = 0; col < dim; col ++ )
		{
			System.out.printf("dim = %d,Row = %d, Col = %d\n", dim, row, col);
		kt_solver ( dim, row, col );
		}
		
	 }
}














