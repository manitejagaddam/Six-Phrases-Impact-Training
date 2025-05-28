class word_rev2
{

     public static void rev ( StringBuilder str, int st, int lt)
	 {
	    int front;
		int rear;
		char temp;
		for ( front = st, rear = lt ; front < rear ; front++, rear--)
		{
		   temp = str.charAt ( front );
		   str.setCharAt( front, str.charAt ( rear ));
		   str.setCharAt ( rear, temp);
		}
	 }
     public static void main(String [] args)
	 {
		String str = "one two three four five six seven eight nine ten";
		StringBuilder str_bld = new StringBuilder ( str );
		rev( str_bld, 0, str_bld.length() - 1 );
		System.out.println( str_bld );
		int wb; // word begin
		int we; // word end
		wb = 0;
		we = 0;
		
		while (wb < str_bld.length() )
		{
			while ( we < str_bld.length() && str_bld.charAt(we) != ' ')
				we++;
			we--;
			rev ( str_bld, wb, we );
			we+=2;
			wb = we;
		}
		System.out.println( str_bld );
		
		
		
     }
	 
}	 