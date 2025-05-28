class many_base
{
     public static void main(String [] args)
	 {
		String str = "ABCD";
		int base;
		for( base = 14; base < 37; base++)
		   System.out.printf("base %d Value %d\n", base, Integer.parseInt(str,base));
	 }
}