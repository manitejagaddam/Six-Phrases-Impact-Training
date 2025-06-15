class b1_demo
{
   static int data = 1234;
   int n1;
   int n2;
   int n3;
   
   b1_demo ( int n1, int n2, int num3 )
   {
      this.n1 = n1;
	  this.n2 = n2;
	  n3 = num3;
   }
   void print()
   {
      System.out.printf("n1 = %d, n2 = %d , n3 = %d\n", n1, n2, n3);
   }
}
class thisDemo
{
     public static void main(String [] args)
	 {
		b1_demo obj1 = new b1_demo ( 1,2,3);
		b1_demo obj2 = new b1_demo ( 11,22,33);
		obj1.print();
		obj2.print();
	 }
}