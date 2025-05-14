class int_arr_sum
{
     public static void main(String [] args)
	 {
	    int [] arr = {6,1,9,2,4,7};
		int arr_ind;
		int sum;
		sum = 0;
		for ( arr_ind  = 0 ; arr_ind < arr.length; arr_ind++)
           sum += arr [ arr_ind ];
	    System.out.println(sum);

			
		   
	 }
}