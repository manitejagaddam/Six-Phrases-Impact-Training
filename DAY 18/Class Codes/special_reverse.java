class special_reverse
{
     public static void main(String [] args)
	 {
	    String str = "t44hi,s i3s a t####est s%%%ent,*ence f(o)r spe4cial r$$$everser";
	
		StringBuilder str_bld = new StringBuilder(str);
		
		int front;
		int rear;
		char temp;
		char ch;
		front = 0;
		rear = str.length() - 1;
		System.out.println( str_bld );
		while ( front < rear )
		{
		    ch = str_bld.charAt ( front);
		   while ( front < rear && Character.isLetter(ch) == false) // get the front point to a character
		   {
		      front++;
			  ch = str_bld.charAt ( front);
		   }
		   ch = str_bld.charAt ( rear);
		   while (rear > front && Character.isLetter(ch) == false) // get the rear point to a character
		   {
		      rear--;
			  ch = str_bld.charAt ( rear );
		   }
		   if ( front < rear )
		   {
		   temp = str_bld.charAt( front );
		   str_bld.setCharAt ( front, str_bld.charAt(rear) );
		   str_bld.setCharAt ( rear, temp);
		   front++;
		   rear--;
		   }
		   
		   
		}
				System.out.println( str_bld );

	 }
}