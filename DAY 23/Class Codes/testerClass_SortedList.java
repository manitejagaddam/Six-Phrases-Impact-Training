/*

Node class

SortedList

tester class


Node 
{
   int data;
   Node next;
   // constructor
}


SortedList 
{

Node start;
int non; // number of nodes


constructor()
{
}



}

*/

import java.util.Scanner;
import java.util.Random;
import java.util.HashSet;
import java.util.Set;


class SortedList 
{

  class Node 
  {
    int data;
	Node next;
	
	Node ( int data )
	{
	
	   this.data = data;
	   next  = null;
	}
	
  }
  Node start;
  int non; // number of nodes
  
  SortedList ()
  {
   start = null;
   non = 0;
  }
  void add ( int data )
  {
       Node newNode = new Node ( data );
	   Node tref; 
	   Node prev;
	   
	   for ( tref = start , prev = null; tref != null &&  data >= tref.data;
                        prev = tref, tref = tref.next );
        if ( prev == null )
        {
		     newNode.next = start;
			 start = newNode;
        }		
		else
		{
		    newNode.next = tref;
			prev.next = newNode;
		}
		non++;
  }
  void print ()
  {
  
     Node tref;
	 for ( tref = start; tref != null; tref = tref.next)
	     System.out.printf("%d ", tref.data);
     System.out.println();
     System.out.println();
	 
  }
  int findMidNode()
  {
	  //  validate
	  Node slow;
	  Node fast;
	  Node prev = null;
	  
	 slow = fast = start; 
	 while ( fast != null ) 
	  {
		  prev = slow;
		  slow = slow.next;
		  fast = fast.next;
		  if ( fast != null )
			  fast = fast.next;
		  
	  }
	  return prev.data;
  }
  
  void del_nth_node_end( int n )
  {
	  Node prev = null;
	  Node front;
	  Node rear;
	  int iter;
	  rear = start;
	  for( iter = 1, front = start; iter < n ; iter++, front=front.next);
	  
	  while ( front.next != null )
	  {
		  prev = rear;
		  rear = rear.next;
		  front = front.next;
	  }
	  prev.next = rear.next;
  }
  void formLoop ( int pos )
  {
	  Node store;
	  Node tref;
	  int iter;
	  for ( iter = 0, store = start; iter < pos ; iter++, store = store.next);
	  for( tref = store ; tref.next != null; tref = tref.next);
	  tref.next = store;
	  
  }
  boolean detectLoop_two_pointers()
  {
	  Node slow;
	  Node fast ;
	  slow = fast = start;
	  
	  while ( fast != null )
	  {
		  slow = slow.next;
		  fast = fast.next;
		  if ( fast != null )
			   fast = fast.next;
		   if ( slow == fast )
			    return true;
	  }
	  return false;
  }
  boolean detectLoop_remove_two_pointers()
  {
	  Node slow;
	  Node fast ;
	  slow = fast = start;
	  
	  while ( fast != null )
	  {
		  slow = slow.next;
		  fast = fast.next;
		  if ( fast != null )
			   fast = fast.next;
		   if ( slow == fast )
		   {
			   // loop removal code
			   // detect Circular Linked List
			   if ( fast == start )
			   {
				   while ( fast.next != start )
					   fast = fast.next;
				   
				   fast.next = null;
				   return true;
				   
			   }
			   
			   
			   // else
			   slow = start;
			   while ( slow.next != fast.next )
			   {
				     slow = slow.next;
					 fast = fast.next;
			   }
			   fast.next = null;
               return true;			   
		   }
	  }
	  return false;
  }
  boolean detectLoop_sets()
  {
	  Set < Node > references = new HashSet <>();
	  Node tref;
	  for( tref = start; tref != null; tref = tref.next )
	  {
		  if ( references.contains( tref ) == true )
			  return true;
		  else
			   references.add( tref);
	  }
	  return false;
  }
  boolean detect_remove_Loop_sets()
  {
	  Set < Node > references = new HashSet <>();
	  Node tref;
	  Node prev;
	  prev = null;
	  for( tref = start; tref != null;  prev = tref, tref = tref.next )
	  {
		  if ( references.contains( tref ) == true )
			  {
				  prev.next = null;
				  return true;
			  }
		  else
		  {
			   references.add( tref);
			  
		  }
	  }
	  return false;
  }
}



class testerClass_SortedList
{
     public static void main(String [] args)
	 {
		SortedList b1_list = new SortedList ();
		int noe;
		Scanner kbd = new Scanner ( System.in );
        noe = kbd.nextInt();
		Random rnd = new Random ();
		int iter;
		for ( iter = 0; iter < noe; iter++)
		    b1_list.add( rnd.nextInt( 90 ) + 10);
		b1_list.print();	
		
		int midVal = b1_list.findMidNode();
		System.out.printf("mid = %d\n", midVal );
		b1_list.del_nth_node_end( 5 );
		b1_list.print();	
		b1_list.formLoop ( 0 );
	//  b1_list.print();	
		
		System.out.println( b1_list.detectLoop_sets());
		System.out.println( b1_list.detect_remove_Loop_sets());
		b1_list.print();
		b1_list.formLoop(0);
		System.out.println( b1_list.detectLoop_two_pointers());
		System.out.println( b1_list.detectLoop_remove_two_pointers());
		b1_list.print();
		
		
		
	 }
}





/*
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 
                                                 
21 22 23 24 25 26  27 28 29 30
                             f 
*/


