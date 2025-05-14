import java.util.Scanner;
import java.util.Random;
class find_largest
{
	public static void print ( int [] arr )
	 {
	     for ( int data : arr )
		    System.out.printf("%d ", data);
			
	    System.out.println();
	 }
     public static void main(String [] args)
	 {
		int noe;
		Scanner kbd = new Scanner ( System.in );
        noe = kbd.nextInt();
		int [] arr = new int [ noe ];
		Random rnd = new Random();
		int arr_ind;
		for( arr_ind = 0;arr_ind < noe; arr_ind ++)
		   arr [ arr_ind ] = rnd.nextInt(10000);
		int largest;
		largest = Integer.MIN_VALUE;
		for( arr_ind = 0; arr_ind < arr.length; arr_ind++)
		  if ( arr [ arr_ind ] > largest )
		      largest = arr [ arr_ind ] ;
		  
		  print( arr );
		  System.out.println( largest )
		  ;
			  
	 }
}





