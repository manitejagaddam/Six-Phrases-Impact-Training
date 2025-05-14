class int_arr
{
     public static void main(String [] args)
	 {
	    int [] arr = {6,1,9,2,4,7};
		int arr_ind;
		for ( arr_ind  = 0 ; arr_ind < arr.length; arr_ind++)
           System.out.printf("%d ", arr [ arr_ind ] );
	    System.out.println();
		for( arr_ind = arr.length - 1; arr_ind >= 0; arr_ind--)
           System.out.printf("%d ", arr [ arr_ind ] );
			
		   
	 }
}