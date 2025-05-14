import java.util.Scanner;
class read_phoneNum_as_we_do
{
     private static void printNum_word( int digit )
	 {
	     String []  words = {"Zero","One","Two","Three",
		 "Four","Five","Six","Seven","Eight","Nine"};
		System.out.printf("%s ", words [ digit ] );
	 }
     public static void main(String [] args)
	 {
		Scanner kbd = new Scanner ( System.in );
		long phoneNumber;
		long copy_phoneNumber;
		long power;
		int curr;
		int prev;
		int ctr;
		phoneNumber = kbd.nextLong();
		// find the power
		power = 1;
		copy_phoneNumber = phoneNumber;
		while ( copy_phoneNumber / power > 9)
		    power *= 10;
			
		prev = (int)(copy_phoneNumber / power);
		ctr = 1;
		copy_phoneNumber = copy_phoneNumber % power;
		power = power / 10;
		while ( power != 0)
		{
		    curr = (int)(copy_phoneNumber / power);
			if ( curr == prev )
			    ctr++;
	        else
			{
			   // handle prev ctr 
			   while ( ctr != 0)
			   {
			    if ( ctr >= 3 && ctr != 4)
				{
				    System.out.printf("Triple ");
					ctr -= 3;
				} 
				else if ( ctr == 4 || ctr == 2)
				{
				    System.out.printf("Double ");
					ctr -= 2;
				}
				else 
				{
				   ctr -= 1;
				}
				printNum_word(prev);
				  
				
			   }
			   prev = curr;
			   ctr = 1;
			}
			  copy_phoneNumber = copy_phoneNumber % power;
			  power /= 10;
		}
		
		while ( ctr != 0)
			   {
			    if ( ctr >= 3 && ctr != 4)
				{
				    System.out.printf("Triple ");
					ctr -= 3;
				} 
				else if ( ctr == 4 || ctr == 2)
				{
				    System.out.printf("Double ");
					ctr -= 2;
				}
				else 
				{
				   ctr -= 1;
				}
				printNum_word(prev);
				  
				
			   }
	 }
}







