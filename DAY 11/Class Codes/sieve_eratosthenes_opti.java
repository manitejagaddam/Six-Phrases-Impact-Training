import java.util.Scanner;
class sieve_eratosthenes_opti
{
     public static void main(String [] args)
	 {
		Scanner kbd = new Scanner ( System.in );
		int range;
		int primeCtr;
		int composite_ind;
		int composite_ctr;

		range = kbd.nextInt();
		boolean [] composite = new boolean [ range ];
		composite [ 0 ] = true;
		composite [ 1 ] = true;
		composite_ctr = 2;
		int multiples;
		int prime;
		prime = 2;
		long start = System.currentTimeMillis();
		for ( multiples = 4; multiples < range ; multiples +=2)
		{
		      composite [ multiples ] = true;
		}
		composite_ctr += ( range / 2) -2;
		int inc;
		for( prime = 3; prime * prime < range ; prime+=2)
		{
		    if ( composite [ prime ] == true ) 
			     continue;
			 inc = prime << 1;
		    for ( multiples = prime * prime ; multiples < range; multiples += inc )
			{
				if ( composite [ multiples ] == false)
				{
			    composite [ multiples ] = true;
				composite_ctr ++ ;
				}
			}
		}
		
		primeCtr = range - composite_ctr;;
		/*for( composite_ind = 2; composite_ind < range; composite_ind ++)
		   if ( composite [ composite_ind ] == false)
		       primeCtr++;*/
			long stop = System.currentTimeMillis();   
		System.out.printf("Primes in the Range 1 to %d is %d", range, primeCtr);	   
		double dura = ( stop - start ) / 1000.0;
		System.out.printf( " Duration = %.3f", dura);
		
		
		
		
		
	 }
}
