import java.util.Scanner;

class kaprekar
{
     public static void main(String [] args)
	 {
		Scanner kbd = new Scanner ( System.in );
        int num;
		long sqr_num;
		long part1;
		long part2;
		long power;
		num = kbd.nextInt();
		
		sqr_num = 1L * num * num;
		power  = 10;
	    part1 = sqr_num / power;
		part2 = sqr_num % power;
	
		while ( part2 < num )
		{
		if ( part1 + part2 == num )
		   {
		      System.out.println("KAPREKAR");
			  break;
		   }
		power *= 10; 
	    part1 = sqr_num / power;
		part2 = sqr_num % power;		
		}
		
		
		
		
		
		
		
		
	 }
}




