import java.util.Scanner;
class switch_alphabet
{
     public static void main(String [] args)
	 {
		Scanner kbd = new Scanner ( System.in );
        char ch;
		ch = kbd.next().charAt(0);
		if ( (ch >= 65 && ch <= 90) || ( ch >= 97 && ch <= 122) )
		{
		    switch ( ch )
			{
			    case 'a':
			    case 'e':
			    case 'i':
			    case 'o':
			    case 'u':
			    case 'A':
			    case 'E':
			    case 'I':
			    case 'O':
			    case 'U': System.out.println("Vowel"); break;
			   default : System.out.println("Consonant");
				
			}
		}
		else
		     System.out.println("Enter an Alphabet");
	 }
}