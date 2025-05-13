import java.util.Scanner;
class rearrrange_smallest
{
     public static int rearrange ( int value )
	 {
	    int [] freq_arr = new int [ 10 ];
		int copy_value;
		int digit ;
		int rearrange_value = 0;
		for( copy_value = value; copy_value != 0; copy_value /= 10)
		{
		    digit = copy_value % 10;
			freq_arr [ digit ] ++;
		}
		int freq_arr_ind;
		for( freq_arr_ind = 1; freq_arr_ind < 10; freq_arr_ind ++)
		{
		    if ( freq_arr [ freq_arr_ind ] > 0 )
			{
			   rearrange_value = freq_arr_ind;
			   freq_arr [ freq_arr_ind ] -= 1;
			   break;
			}
		}
		for( freq_arr_ind = 0; freq_arr_ind < 10; freq_arr_ind ++)
		{
		    while ( freq_arr [ freq_arr_ind ] > 0 )
			{
			   rearrange_value = rearrange_value * 10 + freq_arr_ind;
			   freq_arr [ freq_arr_ind ] -=  1;
			}
		}		
		return rearrange_value;
	 }
     public static void main(String [] args)
	 {
		Scanner kbd = new Scanner ( System.in );
        int num;
		int rearranged_num;
		num = kbd.nextInt();
		rearranged_num = rearrange ( num );
		System.out.printf("%d\t%d", num, rearranged_num);
	 }
}