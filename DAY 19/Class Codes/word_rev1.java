class word_rev1
{
     public static void main(String [] args)
	 {
		String str = "one two three four five six seven eight nine ten";
		//StringBuilder str_bld = new StringBuilder ( str );
		String [] words = str.split(" ");
		int front;
		int rear;
		String temp;
		System.out.println( str );
		for ( front = 0, rear = words.length -1 ; front < rear ; front++, rear --)
		{
		   temp = words [ front ];
		   words [ front ] = words [ rear ];
		   words [ rear] = temp;
		}
		StringBuilder newStr = new StringBuilder();
		for( int ind = 0; ind < words.length; ind++)
		{
		      newStr.append( words [ ind ]);
			  newStr.append(" ");
		}
		System.out.println( newStr );	  
	 }
}