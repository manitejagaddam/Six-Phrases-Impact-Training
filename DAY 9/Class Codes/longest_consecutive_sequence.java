import java.util.Scanner;
import java.util.Random;
class longest_consecutive_sequence
{
	 public static void sort ( int [] arr )
	 {
	    int unsorted;
		int shifter;
	    for( unsorted = 1; unsorted < arr.length; unsorted++ )
		{
		   for ( shifter = unsorted; shifter > 0 && arr [ shifter ] < arr [ shifter - 1]; shifter -=1 )
		   {
		      int temp = arr [ shifter ] ;
			  arr [ shifter ] = arr [ shifter - 1 ];
			  arr [ shifter - 1 ] = temp;
		   }
		}
	 }
	 public static void print ( int [] arr )
	 {
	    int arr_ind;
		for ( arr_ind = 0; arr_ind < arr.length; arr_ind++)
		   System.out.printf("%d ", arr [ arr_ind ] );
		   System.out.println();
	 }
	 public static int getLongest ( int [] arr )
	 {
		 int begin;
		 int stretch;
		 int stretch_len;
		 int max_stretch_len;
		 begin = 0;
		 stretch = 0;
		 max_stretch_len = 0;
		 while ( true )
		 {
		 while ( stretch < arr.length-1 && arr [ stretch + 1 ] == (arr [ stretch ] + 1))
		 {
			 stretch++;
		 }
		 stretch_len = ( stretch - begin ) +1;
		// System.out.printf("slen = %d, stretch = %d\n", stretch_len, stretch);
		 if ( stretch_len > max_stretch_len )
			 max_stretch_len = stretch_len;
		 if ( stretch_len == 1)
			 stretch++;
		 begin = stretch;
		 if ( stretch == arr.length)
			 break;
		 }
		 return max_stretch_len;
		 
	 }
     public static void main(String [] args)
	 {
		int noe;
		Scanner kbd = new Scanner ( System.in );
		noe = kbd.nextInt();
		int [] arr = new int [ noe ];
		int arr_ind;
		Random rnd = new Random(1000000000);
		for( arr_ind = 0; arr_ind < noe; arr_ind++)
		    arr [ arr_ind ] = rnd.nextInt( 10000 );
		sort( arr );
		//print(arr);
		System.out.println(getLongest(arr));
		
		
	 }
}