
import java.util.Scanner;
import java.util.Random;
//12.38
class quickSort
{
     private static void print ( int [] arr )
	 {
	    for( int value : arr )
		    System.out.printf("%d ", value );
		System.out.println();	
	 }
	 private static int [] qs_helper ( int [] arr, int start, int last)
	 {
	    int imp_value;
		int lf;
		int sf;
		if ( start >= last ) 
			return arr;
		lf = start;
		sf = last - 1;
		imp_value = arr [ last ];
		int temp;
		while ( true )
		{
		     while ( lf < last && arr [ lf ] < imp_value )
			     lf ++;
		     while ( sf >= start && arr [ sf ] >= imp_value )
                 sf--;
            if ( lf < sf )
			{ 
			   temp = arr [ lf ] ;
			   arr [ lf ] = arr [ sf ];
			   arr [ sf ] = temp;
			}
			else break;	 
	    }
		//if ( lf < sf )
		{
		temp = arr [ lf ] ;
		arr [ lf ] = arr [ last ];
		arr [ last ] = temp;
		}
	qs_helper ( arr, start, lf-1);
		qs_helper ( arr, lf+1, last);
		return arr;
	 }
	 public static int [] qs( int [] arr)
	 {
	  // arm
	  // env
	  // call
	  qs_helper( arr, 0, arr.length - 1);
	  return arr;
	 }
     public static void main(String [] args)
	 {
		Scanner kbd = new Scanner ( System.in );
        int noe;
		noe = kbd.nextInt();
		int [] arr = new int [ noe ];
		Random rnd = new Random ();
		int arr_ind;
		for( arr_ind = 0; arr_ind < noe; arr_ind++ )
		   arr [ arr_ind ] = rnd.nextInt(100);
		//print ( arr );
		long start = System.currentTimeMillis();
		qs( arr);
		long stop = System.currentTimeMillis();
		double time_taken = ( stop - start ) / 1000.0;
		System.out.printf("QUICK Sort %d elments - time taken = %.3f\n", noe, time_taken);
		//print (arr);
		

		}
}