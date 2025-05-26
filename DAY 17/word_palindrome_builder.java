import java.util.Scanner;
class word_palindrome_builder
{
     public static void toLower ( StringBuilder str)
	 {
	    // charAt
		// setCharAt
		int str_ind;
		for ( str_ind= 0 ; str_ind < str.length(); str_ind++)
		{
		    // check if uppercase
			char ch;
			ch = str.charAt ( str_ind );
			if ( ch >= 'A' && ch <= 'Z')
			{
			  ch+=32;
			  str.setCharAt( str_ind, ch);
			}
		}
	 }
     public static boolean isPalindrome( StringBuilder word )
	 {
	     int front ;
		 int rear;
		 for( front = 0, rear = word.length() - 1;
		          front < rear;
				  front++, rear--)
		   if ( word.charAt( front) != word.charAt( rear ) )
               return false;

        return true;			   
	 }
	 
     public static void main(String [] args)
	 {
		Scanner kbd = new Scanner ( System.in );
        String str = kbd.next();
		StringBuilder str_bld = new StringBuilder ( str );
		toLower( str_bld );
		if ( isPalindrome ( str_bld ) )
		    System.out.println( " P A L I N D R O M E ");
	    else
		    System.out.println( " not P A L I N D R O M E ");
		
	 }
}