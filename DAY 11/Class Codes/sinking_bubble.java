import java.util.Scanner;
import java.util.Random;
class sinking_bubble
{
	public static int [] bubbleSort( int [] arr )
	{
	    int arr_ind;
		int temp;
		int iter;
		boolean swap_happened=true;
		for( iter = 0; iter < arr.length && swap_happened == true; iter++)
		{
			swap_happened = false;
		for(arr_ind = 0; arr_ind  < arr.length - (iter + 1) ; arr_ind++)
		{
		   if ( arr [ arr_ind ] > arr [ arr_ind + 1])
		   {
		      temp = arr [ arr_ind ] ;
			  arr [ arr_ind ]  = arr [arr_ind +1 ];
			  arr [ arr_ind + 1 ] = temp;
			  swap_happened = true;
		   }
		}
		}
		return arr;
	}
	 private static void print( int arr  [] )
	 {
	     for( int val : arr)
		    System.out.printf("%d ", val);
	     System.out.println();		 
	 }
     public static void main(String [] args)
	 {
		Scanner kbd = new Scanner ( System.in );
		int noe;
		noe = kbd.nextInt();
		int [] arr = new int [ noe ];
		Random rnd = new Random();;
		int arr_ind;
		for( arr_ind = 0; arr_ind < noe; arr_ind++)
		    arr [ arr_ind ] = rnd.nextInt(1000);
		//print (arr);
		long begin = System.currentTimeMillis();
		bubbleSort(arr);
		//print( bubbleSort(arr));
		long end   = System.currentTimeMillis();
		double time_taken = ( end - begin ) / 1000.0;
		System.out.printf("Bubble noe = %d, time_taken = %.3f", noe, time_taken);
		
		
		 
	 }
}


