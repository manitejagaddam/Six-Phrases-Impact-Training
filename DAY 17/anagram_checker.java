/*
Given two words/sentences , check if they are anagram.

"listen" and "silent", 
"race" and "care", 
"Astronomer" and "Moon starer", 
"funeral" and "real fun", 
"Eleven plus two" and "Twelve plus one". 

isAnagram ( SB o1, SB o2)
{
}
*/

class anagram_checker
{
     public static boolean isAnagram ( String str1, String str2 )
	 {
	    int [] freq_array = new int [ 26 ];
		char ch;
		int ch_ind;
		int str_ind;
		for( str_ind =0; str_ind < str1.length(); str_ind++)
		{
		   ch = str1.charAt( str_ind );
		   if ( Character.isLetter(ch))
		   {
		   if ( ch >= 65 && ch <= 90 )
		      ch_ind = ch - 65;
		   else 
              ch_ind = ch - 97;		
			  freq_array [ ch_ind ] ++;
           }			  
		}
		for( str_ind =0; str_ind < str2.length(); str_ind++)
		{
		   ch = str2.charAt( str_ind );
		   if ( Character.isLetter(ch))
		   {
		   if ( ch >= 65 && ch <= 90 )
		      ch_ind = ch - 65;
		   else 
              ch_ind = ch - 97;		
			  freq_array [ ch_ind ] --;
           }			  
		}
        int freq_array_ind;
		for( freq_array_ind =0; freq_array_ind < 26; freq_array_ind++)
		    if ( freq_array [ freq_array_ind ] != 0)
			     return false;
				 
		return true;		 
	 }
     public static void main(String [] args)
	 {
		String s1 = "Eleven plus two";
		String s2 = "Twelve plus One";
		if (isAnagram ( s1 , s2 ))
		     System.out.printf("A N A G R A M");
		else	 
		     System.out.printf("not A N A G R A M");

	 }
}










