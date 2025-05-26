import java.util.Scanner;
class str
{
     public static void main(String [] args)
	 {
		Scanner kbd = new Scanner ( System.in );
        String str = null;
		str = new String("This is a test String"); // String ( char [] );
		System.out.println(str);
		String str1 = new String ( str ); // String ( String );
		System.out.println(str1);
		
	 }
}