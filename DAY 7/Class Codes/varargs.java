class varargs
{
     public static int add (int ... vals )
	 {
	    int sum;
		sum = 0;
	    /*for ( int  num : vals )
		   sum += num;*/
	   int vals_ind;
	   for( vals_ind = 0; vals_ind < vals.length; vals_ind ++)
         sum += vals [ vals_ind ];		   
		return sum;   
		
	 }
     public static void chumma (String str, double d, int ... vals )
	 {
	 }

     public static void main(String [] args)
	 {
		 System.out.println(add(1,2));
		 System.out.println(add(1,2,7,9,3,4));
		 System.out.println(add(6,9,7,4));
		 System.out.println(add(67,34,12));
		 System.out.println(add(11,222));
		 System.out.println(add(11,22));
		 
	 }

}