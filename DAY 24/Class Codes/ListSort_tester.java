import java.util.Scanner;
import java.util.Random;
class ListSort
{
    Node start;
	Node last;
	int non;
	
   class Node
   {
      int data;
	  Node next;
	  
	  Node ( int data )
	  {
	     this.data = data;
		 this.next = null;
	  }
   }
   ListSort ()
   {
    start = null;
	last = null;
	non = 0;
   }
   
   void add (int data)
   {
      Node newNode = new Node ( data );
	  if ( non == 0)
	  {
	     start = last = newNode;
	  }
	  else
	  {
	     last.next = newNode;
		 last = newNode;
	  }
	  non++;
   }
   
   void print()
   {
      Node tref;
	  for ( tref = start; tref != null ; tref = tref.next )
	      System.out.printf("%d ", tref.data);
		  
	   System.out.println();
	   System.out.println();
	   
   }
     
    void sort_insertion ()
    {
	     Node proc;
		 Node hold;
		 Node poi;
		 Node prev;
		 proc = start.next;
		 hold = proc.next;
		 
		 start.next = null;
		 while ( proc != null )
		 {
		   proc.next = null;
		   for( poi = start,prev=null; poi != null && proc.data >= poi.data; prev=poi,poi = poi.next);
		   // insert at begin
		   if ( poi == start )
		   {
		      proc.next = start;
			  start = proc;
		   }
		   else
		   {
		      proc.next = poi;
			  prev.next = proc;
			  
		   }
		   
		   proc = hold;
		   if ( hold != null )
		       hold = hold.next;
		 }
    }	
   
   
   
   
   
   
}
class ListSort_tester
   {
	 public static void main(String [] args)
	 {
		Scanner kbd = new Scanner ( System.in );
        int noe;
		noe = kbd.nextInt();
		Random rnd = new Random();
		ListSort b1_ListSort = new ListSort();
		int iter;
		for ( iter = 0; iter < noe; iter ++)
			b1_ListSort.add ( rnd.nextInt ( 899 ) + 100 ) ;
		b1_ListSort.print();
		b1_ListSort.sort_insertion();
		b1_ListSort.print();
	 }
   }
   