class charat_demo
{
     public static void main(String [] args)
	 {
		String s = "test string";
		//for( char v : s)
		  // System.out.println(v);
		int s_ind;
        for( s_ind = 0; s_ind < s.length(); s_ind++)
           System.out.printf("%c ", s.charAt( s_ind));		
	 }
}