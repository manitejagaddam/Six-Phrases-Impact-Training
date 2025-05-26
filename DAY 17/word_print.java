class word_print
{     private static boolean isVowel ( char ch)
	 {
	    return ch == 'a' || ch == 'A' ||
		       ch == 'e' || ch == 'E' ||
			   ch == 'i' || ch == 'I' ||
			   ch == 'o' || ch == 'O' ||
			   ch == 'u' || ch == 'U';
			   
	 }
	 private static boolean wordTest ( String str , int wb, int we )
	 {
		 boolean wb_vowel;
		 boolean we_vowel;
		 wb_vowel = isVowel ( str.charAt( wb ));
		 we_vowel = isVowel ( str.charAt( we ));
		 return (wb_vowel && we_vowel ) || (!wb_vowel && !we_vowel );
	 }
	 private static void wordPrint ( String str , int pos1, int pos2 )
	 {
		 for( int ind = pos1; ind <= pos2 ; ind++)
			  System.out.printf("%c", str.charAt ( ind ));
		  System.out.println();



		 }

     public static void main(String [] args)
	 {
		String str = "one two three Four Five Six Seven Eight Nine Ten Eleven Twelve Thirteen";
		int word_begin;
		int word_end;
		word_begin = 0;
		word_end = 0;
		while ( word_end < str.length() )
		{
			while ( word_end < str.length() &&  str.charAt ( word_end ) != ' ')
				 word_end++;
			 word_end--;
			if ( wordTest ( str, word_begin, word_end) )
			{
				wordPrint ( str, word_begin, word_end);
		    }
				
				word_end+=2;
				word_begin = word_end;
				
			
		}
		
		
	 }
}