class toeplitz
{
     public static void main(String [] args)
	 {
		int [][] arr = {
			      // v  v  v  v  v   v
					{12,15,25,35,45,65},
					{23,12,15,25,35,45},
					{34,23,12,15,25,35},
					{45,34,23,12,15,25},
					{56,45,34,23,12,15},
					{67,56,54,34,23,12},
					{78,67,56,45,34,23},
					{89,78,67,56,45,34}
				};
		int row_dim = arr.length;
		int col_dim = arr[0].length;

        int row;
		int col;
		int m_row;
		int m_col;
		
		int safe;
		boolean error_flag = false;
		// horizontal
		for( row = 0, col = 0; col < col_dim; col ++)
		{
			
		    safe = arr [ row ] [ col ];
			for( m_row = row+1, m_col = col+1; m_row < row_dim && m_col < col_dim ; m_row++, m_col++)
			{
				
			    if ( arr [ m_row ] [ m_col ] != safe)
				{
				   error_flag = true;
				   break;
				}
			}
				
		}
		// vertical
		
		for( row = 1, col = 0; row < row_dim; row ++)
		{
		    safe = arr [ row ] [ col ];
			for( m_row = row+1, m_col = col+1; m_row < row_dim && m_col < col_dim ; m_row++, m_col++)
			    if ( arr [ m_row ] [ m_col ] != safe)
				{
				   error_flag = true;
				   break;
				}
				
		}
		
		System.out.println( ! error_flag );
		
		



	 } // main 




		
} // class