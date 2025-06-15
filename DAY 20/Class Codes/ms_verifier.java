//data_type [] [] = new data_type [ s1 ] [ s2 ];
class ms_verifier
{
     public static void main(String [] args)
	 {
		int [ ] [  ] ms = {
                            {39,48,57,10,19,28,37},
                            {47,56,16,18,27,36,38},
                            {55,15,17,26,35,44,46},
                            {14,23,25,34,43,45,54},
                            {22,24,33,42,51,53,13},
                            {30,32,41,50,52,12,21},
                            {31,40,49,58,11,20,29}
                             };
		int dim;
        int startNum;
		int checkSum;
		int row;
		int col;
		int calcSum=0;
		boolean error_flag = false;
		int mid;
		startNum = 10;
		dim = 7;
		mid = startNum + ( ( dim*dim) - 1 )/2;
		checkSum = mid * dim;
		System.out.println(checkSum);
		// row check 
		for ( row = 0; row < dim; row ++)
		{
			 calcSum = 0;
			 for( col = 0; col < dim; col++)  
				 calcSum += ms [ row ] [ col ];
			 
			 if ( calcSum != checkSum )
			 {
				 error_flag = true;
				 break;
			 }
			 
		}
		// col Checkbox
		if ( error_flag == false )
		{
			for( col = 0; col < dim; col++)
			{
				  calcSum = 0;
				  for ( row = 0; row < dim; row++)
					   calcSum += ms [ row ] [ col ];
			
				if ( calcSum != checkSum )
				{
					error_flag = true;
					break;
				}
			}
		}
		// major diagonal check
		if ( error_flag == false )
		{
			for( row = 0, col = 0; row < dim; row++,col++)
				calcSum += ms [ row ] [ col ];
				
		    if ( calcSum != checkSum )
			{
				error_flag = true;
			}
		}
		// minor diagonal check
		if ( error_flag == false )
		{
			for( row = 0, col = dim - 1 ; row < dim; row++,col--)
				calcSum += ms [ row ] [ col ];
				
		    if ( calcSum != checkSum )
			{
				error_flag = true;
			}
		}
		System.out.println( error_flag ) ;
		
		
		
		
		
		
		
        		
 

	 }
}