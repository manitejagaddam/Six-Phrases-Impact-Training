import java.util.Scanner;
import java.util.Random;
class arr_reverse
{
public static void print ( int [] arr )
	 {
	     for ( int data : arr )
		    System.out.printf("%d ", data);
			
	    System.out.println();
	 }
	 private static void swap( int [] arr, int pos1, int pos2 )
	 {
		  int temp;
		  temp = arr [ pos1 ] ;// save
		  arr [ pos1 ]  = arr [ pos2 ] ; // update
		  arr [ pos2 ]  = temp ; // update
	 }
     public static void arrReverser ( int [] arr )
	 {
		  int start;
		  int end;
		  for( start =0, end = arr.length-1; start < end;start++,end--)
		  {
			  swap (arr, start, end);
		  }
	 }

     public static void main(String [] args)
	 {
		Scanner kbd = new Scanner ( System.in );
        Random rnd = new Random();
		int noe;
		noe = kbd.nextInt();
		int [] arr = new int [ noe ]; // allocate memory
		int arr_ind;
		for( arr_ind = 0; arr_ind < noe; arr_ind++)
		   arr [ arr_ind ] = rnd.nextInt(1000);
		   
		   print(arr);
		   arrReverser ( arr );
		   print(arr);
		   
		   
		   
	 }
}