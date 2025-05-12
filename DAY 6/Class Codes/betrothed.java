import java.util.Scanner;
class betrothed
{
     public static void main(String [] args)
	 {
		Scanner kbd = new Scanner ( System.in );
		int num1;
		int num2;
		int sof_num1;
		int sof_num2;
		int isFactor;
		int sum_of_proper_divisors_num;
		num1 = kbd.nextInt();
		num2 = kbd.nextInt();
		for(isFactor = 2, sof_num1 = 1; isFactor * isFactor <= num1 ; isFactor++)
		{
		   if ( num1 % isFactor == 0 )
		      sof_num1 += ( isFactor + (num1/isFactor) );
		}
		for(isFactor = 2, sof_num2= 1; isFactor * isFactor <= num2 ; isFactor++)
		{
		   if ( num2 % isFactor == 0 )
		      sof_num2 += ( isFactor + (num2/isFactor) );
		}
		//    48        76        75        49
		if ( num1 == (sof_num2+1) && num2 == (sof_num1+1) )
		   System.out.printf("(%d %d)are BETROTHED\n", num1, num2);
        else
		   System.out.printf("(%d\t%d)are NOT BETROTHED\n", num1, num2);
		
  		 
  		 

	 }
}