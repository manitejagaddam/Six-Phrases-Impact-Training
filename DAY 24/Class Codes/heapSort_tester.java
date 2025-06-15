import java.util.Scanner;
import java.util.Random;

class heapSort_tester
{
     private static void maxHeapify ( int [] arr, int pno, int li)
	 {
	   int left_child;
	   int right_child;
	   left_child  = pno * 2 + 1;
	   right_child = left_child + 1;
	   int temp;
	   // child
	   if ( left_child > li )
	   { 
	       return;
	   }
	   // parent with single child
	   if ( left_child == li )
	   {
	        if ( arr [ pno ] < arr [ left_child ] )
			{
			   temp = arr [ pno ];
			   arr [ pno ] = arr [ left_child ];
			   arr [ left_child ]  = temp;
			}
			return;
	   }
	   
	   // parent with both children
	   
	   if ( arr [ pno ] < arr [ left_child ] || arr [ pno ] < arr [ right_child ])
	   {
	   
	       if (arr [ left_child ]  > arr [ right_child ] )
		   {
		   	   temp = arr [ pno ];
			   arr [ pno ] = arr [ left_child ];
			   arr [ left_child ]  = temp;
			   maxHeapify ( arr, left_child, li );
		   
		   }
		   else
		   {
		   	   temp = arr [ pno ];
			   arr [ pno ] = arr [ right_child ];
			   arr [ right_child ]  = temp;
			   maxHeapify ( arr, right_child, li );
		   
		   }
	   }
	   
	   
	   
	 }
     private static int [] heapSort_helper ( int []  arr )
	 {
	    int num_of_parents;
		num_of_parents = arr.length / 2;
		int pno;
		int lastIndex;
		int temp;
		lastIndex = arr.length - 1;
		for ( pno = num_of_parents - 1; pno >= 0; pno--)
		{
		     maxHeapify ( arr, pno, lastIndex);
		}
		temp = arr [ 0 ];
		arr [ 0 ]  = arr [ lastIndex ];
		arr [ lastIndex ] = temp;
		lastIndex --;
		while ( lastIndex >= 0 )
		{
		maxHeapify ( arr, 0, lastIndex);
		temp = arr [ 0 ];
		arr [ 0 ]  = arr [ lastIndex ];
		arr [ lastIndex ] = temp;
		lastIndex--;
		}
		return arr;
	 }
     public static int [] heapSort ( int [] arr )
	 {
	    // arm length
		// set an environment
		// call helper - recursive
		heapSort_helper ( arr );
		return arr;
		
	 }
	 public static void print( int [] arr )
	 {
	  for ( int data : arr )
	    System.out.printf("%02d ",data);
	  System.out.println();	
	 }
     public static void main(String [] args)
	 {
      	Scanner kbd = new Scanner ( System.in );
	    int  noe;
		noe = kbd.nextInt();
	//	noe = 10;
		int [] arr = new int [ noe ];
		Random rnd = new Random();
		int arr_ind;
		for ( arr_ind = 0; arr_ind < noe; arr_ind++)
		   arr [ arr_ind ] = rnd.nextInt();
	   
	    long start = System.currentTimeMillis();
		heapSort( arr );
	    long stop = System.currentTimeMillis();
		double duration = ( stop - start ) / 1000.0;
		System.out.printf("H E A P sort noe = %d, time_taken  %.3f\n", noe, duration);
		 
		
		 /*
		 int [] arr1 = { 5,15,10,25,55,35,75,45,95,50,70,40,60,90,3};
		print( arr1); 
        heapSort ( arr1 );
        print( arr1);	
       */
	   
		   
		   
	 }
}