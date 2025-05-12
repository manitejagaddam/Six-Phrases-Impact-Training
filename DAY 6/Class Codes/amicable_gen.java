/*


	Loop from 1 to n => num
	    220       284
	for num find sof_num 
	      284            220
	for sof_num find sof_sof_num*/
	
	
	
	
import java.util.Scanner;	
class amicable_gen
{
     public static void main(String [] args)
	 {
		Scanner kbd = new Scanner ( System.in );
		int n;
		int num;
		int sof_num;
		int sof_sof_num;
		int isFactor;
		n = kbd.nextInt();
		for( num = 1; num <= n ; num ++)
		{
		  sof_num = 1;
		  for ( isFactor = 2; isFactor * isFactor <= num; isFactor++)
		  {
		    if ( num % isFactor == 0 )
			    sof_num += ( isFactor + (num/isFactor) );
		  }
		  sof_sof_num = 1;
		  for ( isFactor = 2; isFactor * isFactor <= sof_num ; isFactor++)
		  {
		    if ( sof_num % isFactor == 0)
			{
			   sof_sof_num += ( isFactor + (sof_num/isFactor) );
			   if( sof_sof_num > num )
				    break;
			}
		  }
		  if ( num == sof_sof_num && num < sof_num)
		     System.out.printf("%d %d\n", num, sof_num);
		}
		
	 }
}
	
	
	
	
	
	
	
	
	
	