class update_sum_all
{
     public static void print ( int [] arr )
	 {
	     for ( int data : arr )
		    System.out.printf("%d ", data);
			
	    System.out.println();
	 }
     public static void main(String [] args)
	 {
		int [] arr = {6,9,1,2,4,7};
		int arr_ind;
		int sum;
		sum = 0;
		print ( arr );
		for ( arr_ind  = 0; arr_ind < arr.length; arr_ind++)
		     sum = sum + arr [ arr_ind ];
		for ( arr_ind = 0; arr_ind < arr.length; arr_ind ++)
             arr [ arr_ind ] = sum - arr [ arr_ind ];
		print ( arr );	 
	 }
}