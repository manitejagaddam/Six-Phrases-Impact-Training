/*
Given a phrase check if it is palindrome
"A man, a plan, a canal, Panama" 
"Mr. Owl ate my metal worm" 
"Do geese see God?" 
"Was it a car or a cat I saw?"

* Convert string with only letters
* Change to lower case
* Palindrome Check

*/
import java.util.Scanner;
class phrase_palindrome_builder
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
	 public static Strin toAlphabets ( StringBuilder str_bld )
	 {
	     StringBuilder res = new StringBuilder();
		 int str_bld_ind;
		 for( str_bld_ind = 0; str_bld_ind < str_bld.length(); str_bld_ind++)
		    if ( Character.isLetter ( str_bld.charAt ( str_bld_ind) ))
			   res.append( str_bld.charAt ( str_bld_ind));
        System.out.println( res );	    
		//str_bld = res;		   
		 return res;
	 }
     public static void main(String [] args)
	 {
		Scanner kbd = new Scanner ( System.in );
        String str = kbd.nextLine();
		StringBuilder str_bld = new StringBuilder ( str );
		str_bld = toAlphabets( str_bld );
		toLower( str_bld );
		System.out.println( str_bld );
		if ( isPalindrome ( str_bld ) )
		    System.out.println( " P A L I N D R O M E ");
	    else
		    System.out.println( " not P A L I N D R O M E ");
		
	 }
}