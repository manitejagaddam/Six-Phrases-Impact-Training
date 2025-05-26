class ques
{
     public static void main(String [] args)
	 {
		String str1 = "Sridhar is Good in 'C'" ;
		String str2 = " , Now in Java Too";
		String str3 = "Sridhar is Good in 'C' , Now in Java Too" ;
		//String str4 = str1 + str2;
		String str4 = str1.concat(str2);
		System.out.printf(" str3 == str4 %s\n", str3 == str4 );
		
		System.out.printf(" str3 == str4 %s\n", str3.equals(str4 ));
		

	 }
}