class any_base_ours
{
	public static long anyBaseConverter (String strval, int base )
	{
	   int strval_ind;
	   long power;
	   int digit;
	   long res;
	   char ch;
	   res = 0;
	   power = 1;
	   for( strval_ind = strval.length() - 1; strval_ind >= 0; strval_ind --)
	   {
		  ch = strval.charAt( strval_ind );
		  if ( ch > '9' )
	           digit = ch - 55;
		  else
               digit = ch - 48;			  
		  res = res + digit * power;
		  power *= base;
	   }
	   return res;
	}
     public static void main(String [] args)
	 {
	     System.out.println( anyBaseConverter("123456789", 10));	
	 }
}