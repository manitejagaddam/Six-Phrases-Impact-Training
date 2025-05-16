import java.util.Scanner;
import java.util.Random;
class insertion_sort
{
	private static void print( int arr  [] )
	 {
	     for( int val : arr)
		    System.out.printf("%d ", val);
	     System.out.println();		 
	 }
     public static void insertion_sort ( int [] arr )
	 {
	   int unsorted_pos;
	   
	   int shifter;
	   int temp;
	   for( unsorted_pos = 1; unsorted_pos < arr.length; unsorted_pos++)
	   {
	   shifter = unsorted_pos ;
	   
	   while ( shifter > 0 && arr [ shifter ] < arr [ shifter - 1] )
	   {
	      temp = arr [ shifter ];
		  arr [ shifter ] = arr [ shifter - 1];
		  arr [ shifter - 1 ] = temp;
		  shifter--;
	   }
	  
	   }
	 }
     public static void main(String [] args)
	 {/*                                     -----------------------------
		//int [] arr  = {10,20,30,40,50,60,70,80,90,42,25,15,67,28,27,100,51,0,89};
		//int [] arr  = {10,20,30,40,50,60,70,80,90,42,25};
		//.int [] arr = {35,47,56,23,99,43, 36,14,88,43,21,77,55,36,18,69,42};
		print(arr);
		insertion_sort( arr );
		print(arr);*/
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
		insertion_sort(arr);
		//print( bubbleSort(arr));
		long end   = System.currentTimeMillis();
		double time_taken = ( end - begin ) / 1000.0;
		System.out.printf("Insertion noe = %d, time_taken = %.3f", noe, time_taken);
		
	 }
}
