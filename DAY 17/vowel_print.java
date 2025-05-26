class vowel_print

{
     private static boolean isVowel ( char ch)
	 {
	    return ch == 'a' || ch == 'A' ||
		       ch == 'e' || ch == 'E' ||
			   ch == 'i' || ch == 'I' ||
			   ch == 'o' || ch == 'O' ||
			   ch == 'u' || ch == 'U';
			   
	 }
     public static void main(String [] args)
	 {
		String str = "One Two three four five six seven eight nine ten";
		int str_ind;
	    System.out.println(str);
		for ( str_ind = 0; str_ind < str.length(); str_ind++)
		    System.out.printf("%c", isVowel( str.charAt(str_ind)) ? str.charAt(str_ind) : ' ');
	 }
}





