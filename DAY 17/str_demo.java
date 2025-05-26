class str_demo
{
     public static void main(String [] args)
	 {
		String str1 = "Welcome to Learn String with Sri";
		String str2 = "Welcome to Learn String with Sri";
		String str3 = "Welcome to Learn String with Sri";
		
		System.out.printf( "str1 == str2 %s\n", str1 == str2);
		System.out.printf( "str2 == str3 %s\n", str2 == str3);
		String str4 = new String("Welcome to Learn String with Sri in Java").intern();
		String str5 = new String("Welcome to Learn String with Sri in Java").intern();
		String str6 = new String("Welcome to Learn String with Sri").intern();
		System.out.printf( "str4 == str5 %s\n", str4 == str5);
		System.out.printf( "str5 == str6 %s\n", str5 == str6);
		
		
	 }
}