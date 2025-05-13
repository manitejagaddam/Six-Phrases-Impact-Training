import java.util.Scanner;
class ourpower
{
     private static int power_helper ( int base, int expo )
	 {
	    if ( expo == 1)
		     return base;
			return base * power_helper ( base, expo - 1); 
	 }
     public static int power ( int base, int expo )
	 {
	     // arms and validation
		 if ( expo <0 ) return 0;
		 if ( base == 1 ) return 1;
		 if ( expo == 0 ) return 1;
		 if ( expo == 1 ) return base;
		 if ( expo == 2)
		     return base * base;
			 
			 return power_helper( base, expo );
	 }
     public static void main(String [] args)
	 {
		Scanner kbd = new Scanner ( System.in );
        int base;
		int exponent;
		base = kbd.nextInt();
		exponent = kbd.nextInt();
		int res;
		res = power ( base, exponent);
		System.out.printf("%d^%d=%d\n", base, exponent, res);
	 }
}
