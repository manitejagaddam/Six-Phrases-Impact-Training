class remove_duplicates
{
     public static void print( int [] arr )
	 {
	 for( int val : arr )
	    System.out.printf("%d ", val);
		
	 System.out.println();	
	 }
     public static int [] remove_duplicates ( int [] arr )
	 {
	    int [] newArr = new int [ arr.length ];
		int arr_ind;
		int dup_eraser;
		int newArr_ind;
		for ( arr_ind = 0, newArr_ind  =0;arr_ind < arr.length; arr_ind ++)
		{
			if ( arr [ arr_ind ]  == -1 ) 
				continue;
		   // erase dup 
		   for( dup_eraser = arr_ind + 1; dup_eraser < arr.length; dup_eraser++)
		   {
		       if ( arr [ arr_ind ]  == arr [ dup_eraser ])
			       arr [ dup_eraser ] = -1;
		   }
		   newArr [ newArr_ind ]  = arr [ arr_ind ];
		   newArr_ind++;
		}
		while ( newArr_ind < arr.length )
		{
		    newArr [ newArr_ind ] = - 1;
			newArr_ind++;
		}
		for( arr_ind = 0; arr_ind < arr.length; arr_ind++)
		    arr [ arr_ind ] = newArr [ arr_ind ];
		return arr;	
	 }
     public static void main(String [] args)
	 
	 {
		int [] arr = {6,7,7,8,1,3,6,7,8,2,3,8,7,6,5,6,7,1,3,2,8,7,6,7,8,2,3,1,1,1};
		print(arr);
		print(remove_duplicates(arr));
	 }
}
