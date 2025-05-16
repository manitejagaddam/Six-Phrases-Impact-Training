import java.util.Scanner;
class sieve_eratosthenes
{
     public static void main(String [] args)
	 {
		Scanner kbd = new Scanner ( System.in );
		int range;
		range = kbd.nextInt();
		boolean [] composite = new boolean [ range ];
		composite [ 0 ] = true;
		composite [ 1 ] = true;
		int multiples;
		int prime;
		prime = 2;
		long start = System.currentTimeMillis();
		for ( multiples = 4; multiples < range ; multiples +=2)
		      composite [ multiples ] = true;
		for( prime = 3; prime * prime < range ; prime+=2)
		{
		    if ( composite [ prime ] == true ) 
			     continue;
		    for ( multiples = prime * prime ; multiples < range; multiples += prime )
			    composite [ multiples ] = true;
		}
		
		int primeCtr;
		int composite_ind;
		primeCtr = 0;
		for( composite_ind = 2; composite_ind < range; composite_ind ++)
		   if ( composite [ composite_ind ] == false)
		       primeCtr++;
			long stop = System.currentTimeMillis();   
		System.out.printf("Primes in the Range 1 to %d is %d", range, primeCtr);	   
		double dura = ( stop - start ) / 1000.0;
		System.out.printf( " Duration = %.3f", dura);
		
		
		
		
		
	 }
}
