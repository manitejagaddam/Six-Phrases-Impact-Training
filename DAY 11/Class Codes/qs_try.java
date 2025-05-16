class qs_try
{
private static void print( int arr  [] )
	 {
	     for( int val : arr)
		    System.out.printf("%d ", val);
	     System.out.println();		 
	 }
     public static void main(String [] args)
	 {
		int [] arr = {34,56,67,12,24,67,89,11,90,22,67,78,10,15,40,99,90,42};
		int lf;
		int sf;
		int temp;
		int imp_value;
		
		imp_value = arr [ arr.length - 1];
		lf = 0;
		sf = arr.length - 2;
		print( arr );
		while ( true )
		{
		   while ( lf < sf && arr [ lf ] < imp_value )
		      lf++;
		   while ( sf > lf && arr [ sf ] >= imp_value)
              sf--;

            if ( lf < sf )
			{
			    temp = arr [ lf ];
				arr [ lf ] = arr [ sf ];
				arr [ sf ] = temp;
			}
			else
			 break;
			
		
		}
		print ( arr );
		
		
		
		

	 }
}