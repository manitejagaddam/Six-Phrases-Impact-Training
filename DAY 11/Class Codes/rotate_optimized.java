import java.util.Scanner;
class rotate_optimized
{
     private static void print( int arr  [] )
	 {
	     for( int val : arr)
		    System.out.printf("%d ", val);
	     System.out.println();		 
	 }
	 private static void rev( int [] arr, int start, int last)
	 {
	    int begin;
		int end;
		begin = start;
		end   = last;
		while ( begin < end )
		{
		   int temp;
		   temp = arr [ begin ] ;
		   arr [ begin ] = arr [ end ];
		   arr [ end ] = temp;
		   begin++;
		   end--;
		}
	 }
     public static int [] rotate ( int [] arr, int rot_factor)
	 {
	     rev( arr, 0, arr.length-1);
		 rev( arr, 0, rot_factor -1 );
		 rev( arr, rot_factor, arr.length-1);
		 return arr;
	 }
     public static void main(String [] args)
	 {
		Scanner kbd = new Scanner ( System.in );
		int noe;
		noe = kbd.nextInt();
		int [] arr = new int [ noe ];
		int arr_ind;
		for( arr_ind = 0; arr_ind < noe; arr_ind ++)
           arr [ arr_ind ] = arr_ind + 1;
		int rot_factor;
		print(arr);
		rot_factor = kbd.nextInt();
		print( rotate ( arr, rot_factor ));
		
		
	 }
}