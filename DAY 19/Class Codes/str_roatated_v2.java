// 0123456
// hellohi
// 0123456
// ellohih
// s1_ind 0 1 0 1 2 3 4 5 6 7
// s2_ind 4 5 6 0 1 2 3 4 5 

class str_roatated_v2
{
     public static void main(String [] args)
	 {
	   String s1 = "waterbottle";
       String s2 = "ttlewaterbo";
	   //String s1 = "hellohi";
	   //String s2 = "ellohih";
       int s1_ind;
	   int s2_ind;
	   int work_s2_ind;
	   s1_ind = 0;
	   
	   for( s2_ind  = 0 ; s2_ind < s2.length(); s2_ind++)
	   {
		  
        if ( s1.charAt(0) == s2.charAt(s2_ind)) 
		 {
		s1_ind = 1;
		work_s2_ind = s2_ind + 1;
		if ( work_s2_ind == s2.length())
			     work_s2_ind=0;
		while ( s1_ind < s1.length())
		{ 
		   if ( s1.charAt ( s1_ind ) == s2.charAt(work_s2_ind))
           {
		      s1_ind++;
			  work_s2_ind++;
			  if ( work_s2_ind == s2.length())
			     work_s2_ind=0;			 
           }	
           else break;		   
		}
		 }
	   }
		if ( s1_ind == s1.length())
		   System.out.println("true");
		else
		   System.out.println("false");
		
			 
	 }
}