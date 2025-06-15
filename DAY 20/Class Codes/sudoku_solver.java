/*


solve ( grid )

arm length / validation
check if nor filled


environment - 2d copy


call helper - recursive , pass, initiate
12.38
solve_helper (  orig, copy, 0,0                         );


safety ( copy, row, col, value )











*/

//1:01 1.50

class sudoku_solver
{
	 public static void printGrid ( int [][] grid )
	 {
		 int row;
		 int col;
		 System.out.println();
		 for( row = 0; row < grid.length; row++, System.out.println())
		 {
			   for( col = 0; col < grid[0].length; col++)
				    System.out.printf("%d ", grid[ row ] [ col ]);
		 }	 

	 }
     public static boolean isSafe ( int [][] grid, int row, int col, int tv ) // tv test value
	 {
	   int tr; //test row
	   int tc; // test 
	   // row 
	   for( tr = row, tc = 0; tc < 9; tc++)
	     if ( grid [ tr ] [ tc ] == tv)
		      return false;
	   // col check
	   
	   for( tc = col, tr = 0; tr < 9; tr++)
	     if ( grid [ tr ] [ tc ] == tv)
		      return false;
        int submat_row;
        int submat_col;
        submat_row = ( row - (row % 3));
        submat_col = ( col - (col % 3));
        for( tr = 0; tr < 3; tr++)
		{
			 for( tc = 0; tc < 3;tc++)
			 {
				   if ( grid [ submat_row + tr ] [ submat_col + tc ] == tv )
					     return false;
			 }
		}
		return true;
	 }
     public static void sudoku_solver_helper ( int [] [] orig, int [][] copy, int row, int col )
	 {
	 
	 
	    // enumarate all the choices
		// 1 2 3 4 5 6 7 8 9
		int testValues;
		int wr;
		int wc;
		wr = row;
		wc = col;
		if ( wc == 9 )
		{
		   wc = 0;
		   wr++;
		}
		if ( wr == 9 )
	    {
			  printGrid( copy );
			  return;
		}
		if ( orig [ wr ] [ wc ] == 0)
		{
			for( testValues = 1; testValues < 10; testValues ++)
			{
				if ( isSafe( copy, wr, wc, testValues))
				{
					copy [ wr ] [ wc ]  = testValues;;
					sudoku_solver_helper ( orig, copy, wr, wc+1 );
					copy [ wr ] [wc ] = 0;
				}
			}
		}
		else
			sudoku_solver_helper ( orig, copy, wr, wc+1 );
	 }
     public static void sudoku_solver ( int [][] grid )
	 {
	   // arm length / validation 
	   
	   // set an environment
	   int [][] copy = new int [grid.length][grid.length];
	   int r;
	   int c;
	   for ( r = 0; r < 9; r++)
		   for( c= 0; c< 9; c++)
			   copy [ r ] [ c ] = grid [ r] [ c ];
	   // call helper recursive , pass, initiate 
	   sudoku_solver_helper( grid, copy, 0, 0);
	   
	 }
     public static void main(String [] args)
	 {
		/*int [ ][ ] grid = 
		              {
                      {3, 0, 6, 5, 0, 8, 4, 0, 0},
                      {5, 2, 0, 0, 0, 0, 0, 0, 0},
                      {0, 8, 7, 0, 0, 0, 0, 3, 1},
                      {0, 0, 3, 0, 1, 0, 0, 8, 0},
                      {9, 0, 0, 8, 6, 3, 0, 0, 5},
                      {0, 5, 0, 0, 9, 0, 6, 0, 0},
                      {1, 3, 0, 0, 0, 0, 2, 5, 0},
                      {0, 0, 0, 0, 0, 0, 0, 7, 4},
                      {0, 0, 5, 2, 0, 6, 3, 0, 0}
                      };
					 */ 
	int grid[][] = 
{

{8,0,0,0,0,0,0,0,0},
{0,0,3,6,0,0,0,0,0},
{0,7,0,0,9,0,2,0,0},
{0,5,0,0,0,7,0,0,0},
{0,0,0,0,4,5,7,0,0},
{0,0,0,1,0,0,0,3,0},
{0,0,1,0,0,0,0,6,8},
{0,0,8,5,0,0,0,1,0},
{0,9,0,0,0,0,4,0,0}
        };
				  

        sudoku_solver ( grid );
	 }
}











