class int_arr_sum_avg
{
     public static void main(String [] args)
	 {
	    int [] arr = {6,1,9,2,4,7};
		int arr_ind;
		int sum;
		double average;
		sum = 0;
		for ( arr_ind  = 0 ; arr_ind < arr.length; arr_ind++)
           sum += arr [ arr_ind ];
	    System.out.println(sum);
		//average = sum / (arr.length*1.0);
		average = (double) sum / arr.length;
		System.out.println( average );
		System.out.print  ( average );
		System.out.printf("\n%1.3f", average);

			
		   
	 }
}