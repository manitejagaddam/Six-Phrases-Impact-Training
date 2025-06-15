import java.util.Scanner;
import java.util.Random;
class Dll
{
   Node front;
   Node rear;
   int non; // number of nodes 
   class Node
   {
       Node prev;
	   int data;
	   Node next;
	   
	   Node ( int value )
	   {
	       data = value;
		   prev = null;
		   next = null;
	   }
   }
   
   Dll ()
   {
      front = null;
	  rear  = null;
	  non = 0;
   }
   
   
   void add ( int value )
   {
     Node newNode = new Node ( value );
	 // Empty
	 
	 if ( front == null )
	 {
	   front = rear = newNode;
	 }
	 else
	 {
	    Node tref;
		for ( tref = front; tref != null && tref.data <= value   ; tref = tref.next );
        // insert at begin
		  if ( tref == front )
		  {
		       newNode.next = front;
			   front.prev = newNode;
			   front = newNode;
		  }
          else if ( tref == null )   // insert at end
          {
		     newNode.prev = rear;
			 rear.next = newNode;
			 rear = newNode;
		  }else
		  {
		      newNode.prev = tref.prev;
			  newNode.next = tref;
			  tref.prev.next = newNode;
			  tref.prev = newNode;
		  }
      // insert in between	   
	 }
	 non++;
   }
   void forwardPrint()
   {
      Node tref;
	  if ( front == null )
	      return;
		  
	  for( tref = front ; tref != null ; tref = tref.next)
         System.out.printf("%d ", tref.data);

       System.out.println();
       System.out.println();
	   
   }
   void reversePrint()
   {
      Node tref;
	  if ( front == null )
	      return;
		  
	  for( tref = rear ; tref != null ; tref = tref.prev)
         System.out.printf("%d ", tref.data);

       System.out.println();
       System.out.println();
	   
   }
   void delete ( int delVal )
   {
	   Node tref;
	   for( tref = front; tref != null && tref.data < delVal; tref=tref.next);
	   // no such node
	   if ( tref == null || tref.data > delVal )
		   return;
	   // start
	    if ( tref == front )
		{
			 front = front.next;
			 front.prev = null;
		} else if ( tref == rear )
		{
			rear = rear.prev;
			rear.next = null;
		} else
		{
			 tref.prev.next = tref.next;
			 tref.next.prev = tref.prev;
		}
		
	   // end
	   
	   // middle
   }
   
}



class Dll_tester
{
     public static void main(String [] args)
	 {
		Scanner kbd = new Scanner ( System.in );
        int noe;
		noe = kbd.nextInt();
		Random rnd = new Random ();
		int iter;
		Dll b1_list = new Dll();
		for ( iter = 0; iter < noe; iter ++)
		   b1_list.add( rnd.nextInt(89) + 10);
		   
		   b1_list.forwardPrint();
		   b1_list.reversePrint();
		   
		   int delVal ;
		   do
		   {
		   delVal = kbd.nextInt();
		   if ( delVal != -1 )
		   {
			   b1_list.delete(delVal );
			   b1_list.forwardPrint();
		   }
		   } while ( delVal != -1 );
	 }
}








