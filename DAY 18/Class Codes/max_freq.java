class max_freq
{
     public static void main(String [] args)
	 {
		String str = """
This feature, introduced in Java 15, enhances code
 readability by allowing strings to span multiple
 lines directly in the source code, without the need 
 for explicit concatenation or escape sequences. 
 Text blocks begin and end with three double-quote 
 characters (\"\"\"). The content within these 
 delimiters can span multiple lines, and line breaks 
 are preserved as part of the string.
   """;

        int [] freq_arr = new int [ 128 ];
	 int str_ind;
     for( str_ind = 0; str_ind < str.length(); str_ind++)
         freq_arr [ str.charAt(str_ind)]++;
     int max = 0;
	 int ind_max;
	 ind_max  = 0;
	 int freq_arr_ind;
     for( freq_arr_ind = 0 ; freq_arr_ind < 128; freq_arr_ind++)
        if ( freq_arr_ind != 32 && freq_arr [ freq_arr_ind ] > max )
		{
          max = freq_arr [ freq_arr_ind ];
		  ind_max = freq_arr_ind;
		}

      System.out.printf( "char = %c occurrences = %d\n", (char) ind_max, max);	  	  

		 
	 }
}