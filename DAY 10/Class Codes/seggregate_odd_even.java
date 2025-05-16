import java.util.Scanner;
import java.util.Random;
class seggregate_odd_even
{
	public static void print( int [] arr )
	 {
	 for( int val : arr )
	    System.out.printf("%d ", val);
		
	 System.out.println();	
	 }
	 public static int [] seggregate_odd_even ( int [] arr )
	 {
	    int [] evens = new int [ arr.length ];
		int [] odds  = new int [ arr.length ];
		int arr_ind;
		int evens_ind;
		int odds_ind;
		evens_ind = 0;
		odds_ind  = 0;
		for ( arr_ind = 0; arr_ind < arr.length ; arr_ind ++ )
		{
		  if ( arr [ arr_ind ] % 2 == 0 )
		  {
		     evens [ evens_ind++ ] = arr [ arr_ind ];
		  }
		  else
		  {
		     odds [ odds_ind ++ ] = arr [ arr_ind ];
		  }
		}
		for(arr_ind =  0; arr_ind < evens_ind ; arr_ind ++)
		    arr [ arr_ind ] = evens [ arr_ind ];
		int cpy_ind;
		for ( cpy_ind = 0; cpy_ind < odds_ind ; cpy_ind++)
		   arr [ arr_ind++ ] = odds [ cpy_ind ];
		return arr;
		}
     public static void main(String [] args)
	 {
		Scanner kbd = new Scanner ( System.in );
		int noe;
		noe = kbd.nextInt();
		int [] arr  =  new int [ noe ];
		Random rnd = new Random();
		int arr_ind;
		for( arr_ind = 0; arr_ind < noe; arr_ind ++)
		   arr [ arr_ind ] = rnd.nextInt( 100);
		print(arr);
        print(seggregate_odd_even(arr));		
		   
		   
	 }
}