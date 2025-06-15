import java.util.Scanner;
import java.util.Random;
class List
{
   Node start;
   Node last;
   int non; // number of nodes
   class Node
   {
       int data;
	   Node next;
	   
	   Node( int data )
	   {
	     this.data = data;
		 next = null;
	   }
   
   }
   
   List()
   {
      start = null;
	  last  = null;
	  non = 0;
   }
   void add ( int data )
   {
       Node newNode = new Node ( data );
	   if ( start == null )
	   {
	     start = last = newNode;
	   }
	   else
	   {
	      last.next = newNode;
		  last      = newNode;
	   }
	   non++;
   }
   
   void print()
   {
      Node tref;
	  for ( tref = start; tref != null; tref = tref.next)
	      System.out.printf("%d ", tref.data);
	  System.out.println();	  
   }
   
   void sort()
   {
      Node tref;
	  Node work;
	  Node hold;
	  Node poi;
	  Node prev;
	  work = start.next;
	  hold = work.next;
	  start.next = null;
	  while ( work != null )
	  {
	     work.next = null;
		 for( poi = start, prev=null; poi != null && poi.data <= work.data ; prev= poi, poi = poi.next);
		 if ( poi == start )
		 {
		    work.next = start;
			start = work;
		 }
		 else
		 {
		   prev.next = work;
		   work.next = poi;
		 }
		 work = hold;
		 if ( hold != null )
		    hold = hold.next;
		 //print();
	  }
	  
   }
   
 
   
}

class ListDemo
{
     public static void main(String [] args)
	 {
		Scanner kbd = new Scanner ( System.in );
		int noe;
		noe = kbd.nextInt();
		Random rnd = new Random ();
		int itr;
		List testList = new List();
		for( itr = 0; itr < noe; itr++)
		  testList.add ( rnd.nextInt(89) + 10 );
        testList.print();
		testList.sort();
		testList.print();
	 }
}