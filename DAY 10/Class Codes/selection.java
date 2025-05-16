import java.util.Scanner;
import java.util.Random;
class selection
{
	public static void print( int [] arr )
	 {
	 for( int val : arr )
	    System.out.printf("%d ", val);
		
	 System.out.println();	
	 }
	 public static int [] selection_sort ( int [] arr )
	 {
	    int smallest;
		int smallest_pos;
		int scope_begin;
		int get_smaller;
		
		
		for ( scope_begin =  0; scope_begin < arr.length; scope_begin ++)
		{	
		smallest = Integer.MAX_VALUE;
		smallest_pos = - 1;
				for( get_smaller = scope_begin ; get_smaller < arr.length; get_smaller++)
				{  
					if ( arr [ get_smaller ] < smallest )
					{
						smallest = arr [ get_smaller ];
						smallest_pos = get_smaller;
					}
				}
				int temp ;
				temp = arr [ scope_begin ] ;
				arr [ scope_begin ]  = smallest;
				arr [ smallest_pos ] = temp;
		}
		return arr;
		
		
		
		
		
		
	 }
     public static void main(String [] args)
	 {
		int noe;
		Scanner kbd = new Scanner(System.in);
		noe = kbd.nextInt();
		int [] arr = new int [ noe ];
		Random rnd = new Random();
		int arr_ind;
		for( arr_ind  = 0; arr_ind < noe; arr_ind ++)
		    arr [ arr_ind ] = rnd.nextInt(100);
		print(arr);
        print(selection_sort(arr));		
			
	 }
}