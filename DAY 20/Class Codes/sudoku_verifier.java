class sudoku_verifier
{
     public static boolean verifier ( boolean [] fa )
	 {
	    int fa_ind;
		for( fa_ind = 1; fa_ind < 10; fa_ind++)
		   if ( fa [ fa_ind ] == false)
		       return true;
			   
		return false;	   
	 }
	 public static void reInit( boolean [] fa )
	 {
		 int fa_ind;
		for( fa_ind = 1; fa_ind < 10; fa_ind++)
		     fa [ fa_ind ] =  false;
	 }
     public static void main(String [] args)
	 {
		int [] [] sudoku =
				 {
					 {4,3,5,2,6,9,7,8,1},
					 {6,8,2,5,7,1,4,9,3},
					 {1,9,7,8,3,4,5,6,2},
					 {8,2,6,1,9,5,3,4,7},
					 {3,7,4,6,8,2,9,1,5},
					 {9,5,1,7,4,3,6,2,8},
					 {5,1,9,3,2,6,8,7,4},
					 {2,4,8,9,5,7,1,3,6},
					 {7,6,3,4,1,8,2,5,9}
				 };
		boolean [] freq_arr 	= new boolean [ 10 ];
        int row;
		int col;
		boolean error_flag=false;
		for ( row = 0; row < 9; row++)
		{
		   for ( col = 0; col < 9; col ++)
		   {
		      freq_arr [ sudoku[row] [col] ] = true;
		   }
		   error_flag = verifier( freq_arr );
		   //System.out.println ( error_flag );
		    if ( error_flag == true ) 
				      break;
				  reInit(freq_arr);
		}
		System.out.println ( error_flag );
        if ( error_flag == false )
		{
			for ( col = 0; col < 9; col++)
			{
			   for ( row = 0; row < 9; row ++)
			   {
				  freq_arr [ sudoku[row] [col] ] = true;
			   }
			   error_flag = verifier( freq_arr );
			    if ( error_flag == true ) 
				      break;
				 reInit(freq_arr); 
			}
		}
		System.out.println ( error_flag );
		 if ( error_flag == false ) // sub matrix
		{
		     int subMat_row;
			 int subMat_col;
			 for( subMat_row = 0; subMat_row < 9; subMat_row+=3)
			 {
			    for( subMat_col = 0; subMat_col < 9; subMat_col +=3)
				{
				   for( row = 0; row < 3; row++)
				   {
				      for( col = 0; col < 3; col++)
		freq_arr [ sudoku [ subMat_row + row ] [ subMat_col +col ] ] = true;
					  }
				  error_flag = verifier( freq_arr );
				  if ( error_flag == true ) 
				      break;
				  reInit(freq_arr);
				}
				
				
			 }
		
		}
		System.out.println ( !error_flag );
      
	 }
}