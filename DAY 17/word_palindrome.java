import java.util.Scanner;
class word_palindrome
{
     public static boolean isPalindrome( String word )
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
	 public static String toLower ( String s)
	 {
		 String res_str = "";
		 int s_ind;
		 for( s_ind = 0 ; s_ind < s.length(); s_ind++)
		 {
			 char ch = s.charAt ( s_ind );
			 if ( ch >= 'A' && ch <= 'Z' )
			 {   
		     ch +=32;
			 }
				res_str += ch;
		 }
		 return res_str;
	 }
     public static void main(String [] args)
	 {
		Scanner kbd = new Scanner ( System.in );
        String str = kbd.next();
		str = toLower ( str );
		System.out.println(str);
		if ( isPalindrome ( str ) )
		    System.out.println( " P A L I N D R O M E ");
	    else
		    System.out.println( " not P A L I N D R O M E ");
		
	 }
}