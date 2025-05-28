import java.util.Scanner;
class n_queen
{
			  static int solCtr;

	private static boolean isSafe ( int [] qpos, int noq, int qno, int pos)
	{
		int row;
		int col;
		// left up diagional
		for ( row = qno-1, col = pos -1 ; row >= 0 && col >= 0; row--, col--)
		     if ( qpos [ row ] == col ) return false;  
		// up
		for ( row = qno-1, col = pos  ; row >= 0 && col >= 0; row--)
		     if ( qpos [ row ] == col ) return false;  
		
		// right up diagional
		for ( row = qno-1, col = pos+1 ; row >= 0 && col < noq ; row--, col++)
		     if ( qpos [ row ] == col ) return false;  
		 
		 return true;
		
	}
	private static void printBoard ( int [] qpos )
	{
		int row;
		int col;
		for ( row = 0; row < qpos.length; row ++, System.out.println())
		{
			for ( col = 0; col < qpos.length; col ++)
			{
				System.out.printf("%c ", qpos [ row ] == col ? 'Q' : '-');
			}
		}
		System.out.println();
	}
	 private static int solve_n_queen_helper ( int [] qpos, int noq, int qno )
	 {
		  // enumarate all the choices
		  // 0,1,2....noq-1
		  if ( qno == noq )
		  {
			  //printBoard(qpos);
			  solCtr++;
			  return solCtr;
		  }
		  int pos;
		  for ( pos = 0 ; pos < noq ; pos ++) // accesing all options
		  {
			  if ( isSafe( qpos, noq, qno, pos ) )
			  {
				  qpos [ qno ]  = pos;
				  solve_n_queen_helper ( qpos, noq, qno+1);
				  qpos [ qno ] = -1;
			  }
		  }
		  return solCtr;
	 }
     public static int  solve_n_queen ( int noq )
	 {
	     // arms length , validation
		 if ( noq == 1)
		     {
			//    System.out.println( 1 );
				return 1 ;
			 }
			 if ( noq <= 3 )
		     {
		//	    System.out.println( 0 );
				return 0;
			 }
	   // setup an Environment   
        int [] qpos = new int [ noq ];
        int qpos_ind;
		for ( qpos_ind = 0 ; qpos_ind < noq ; qpos_ind ++)
			   qpos [ qpos_ind ]  = -1;
		   
		// call helper - recursive, pass , initiate
        return solve_n_queen_helper( qpos, noq, 0 );		
        		
			 
	 }
     public static void main(String [] args)
	 {
		Scanner kbd = new Scanner ( System.in );
        int noq; // number of queens
		noq = kbd.nextInt();
		System.out.printf("NOQ = %d Solutions = %d\n", noq, solve_n_queen ( noq ));
	 }
}