// temp = arr [ arr.length-1]
// ind = arr.length-2
// arr [ ind + 1 ] = arr [ ind ]4
// ind --
// arr [ 0 ] = temp;import java.util.Scanner;
import java.util.Random;
import java.util.Scanner;
class arr_Rotate
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
     public static void arrRotator ( int [] arr )
	 {
		  int temp;
		  int arr_ind;
		  temp = arr [ arr.length-1 ];
		  for( arr_ind = arr.length-2 ; arr_ind >= 0; arr_ind--)
		    arr [ arr_ind + 1 ] = arr [ arr_ind ] ;
		
		arr [ 0 ] = temp;
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
		   arrRotator ( arr );
		   print(arr);
		   
		   
		   
	 }
}