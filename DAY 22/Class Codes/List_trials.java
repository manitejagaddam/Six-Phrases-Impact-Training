class Node 
{
    int data;
	Node next;
	
	Node ( int data )
	{
	    this.data = data;
		next = null;
	}
}
class List
{
     Node head;
	 Node tail;
	 int number_of_nodes;
	 
	 List ()
	 {
	    head = null;
		tail = null;
		number_of_nodes = 0;
	 }
	 void remove ( int delVal )
	 {
		 // if empty
		 if ( head == null )
			  return;
		  Node curr;
		  Node prev;
		  prev = null;
		  for( curr = head; curr != null &&  curr.data != delVal; prev =curr, curr = curr.next);
		  if ( curr == null )
			  return;
		  if( head == tail )
		  {
			    head = null;
				tail = null;
				number_of_nodes = 0;
		  }
		  else if ( curr == head )
		  {
			  head = head.next;
			  number_of_nodes -= 1;
		  } else if ( curr == tail )
		  {
			  tail = prev;
			  tail.next = null;
			  number_of_nodes -=1;
		  } 
		  else 
		  {
			     prev.next = curr.next;
				 number_of_nodes-=1;
		  }
		  
	 }
	 void delete()
	 {
		 head = null;
		 tail = null;
		 number_of_nodes = 0;
	 }
	 int count()
	 {
		 return number_of_nodes;
	 }
	 void print()
	 {
	    Node tref;
		for( tref =head; tref != null; tref=tref.next)
		   System.out.printf("%d ", tref.data);
	   System.out.println();
	   System.out.println();
	   
	 }
	 void append ( int data )
	 {
	    Node newNode = new Node ( data );
		if( head == null )
		{  
		   head = newNode;
		   tail = newNode;
		   number_of_nodes = 1;
		}
		else
		{
		     tail.next = newNode;
			 tail = newNode;
			 number_of_nodes++;
		}
	
	 }
	 void removeAt ( int pos )
	 {
		 if ( pos < 0 || pos >= number_of_nodes )
			 return;
		 if ( number_of_nodes == 0)
			 return;
		 int ctr;
		 Node curr;
		 Node prev;
		 for( ctr = 0, curr = head, prev = null;
		         ctr < pos; ctr++, prev = curr, 
				  curr = curr.next);
		if ( pos == 0)
		{
			head = head.next;
			number_of_nodes--;
        } else if ( curr == tail )
		{
			tail = prev;
			tail.next = null;
			number_of_nodes--;
		}		
        else{
			prev.next = curr.next;
			number_of_nodes--;
		}			
	 }
	 void insertAt( int pos , int value)
	 {
		  Node newNode = new Node ( value );
		  if ( head == null )
		  {
			   head = tail =newNode;
			   number_of_nodes = 1;
			   return;
		  }
		  if ( pos >= number_of_nodes )
		  {
			  tail.next = newNode;
			  tail = newNode;
			  number_of_nodes++;
			  return;
		  }
		  if ( pos <= 0)
		  {
			   newNode.next = head;
			   head = newNode;
			   number_of_nodes++;
			   return;
		  }
		  int ctr;
		  Node curr;
		  Node prev;
		  for( ctr=0, curr= head, prev = null; ctr < pos; ctr++,prev = curr, curr = curr.next);
		       prev.next = newNode;
			   newNode.next = curr;
			   number_of_nodes++;
			   
		     return;
	 }
	 void reverse()
	 {
		 if ( number_of_nodes == 0 )
			 return;
		 if ( number_of_nodes == 1);
		 else if ( number_of_nodes == 2)
		 {
			 tail.next = head;
			 head.next = null;
		 }
		 else
		 {
			 Node prevNode;
			 Node currNode;
			 Node nextNode;
			 
			 prevNode = null;
			 currNode = head;
			 nextNode = head.next;
			 
			 while( currNode != null )
			 {
				  currNode.next = prevNode;
				  prevNode = currNode;
				  currNode = nextNode;
				  if ( nextNode != null)
					   nextNode = nextNode.next;
			 }
		}
		 Node temp;
		 temp = head;
		 head = tail;
		 tail = temp;
		 
		 
	 }

}







class List_trials
{
     public static void main(String [] args)
	 {
		List b1_list = new List();
		b1_list.append(31);
		b1_list.append(10);
		b1_list.append(28);
		b1_list.append(57);
		b1_list.append(61);
		b1_list.append(21);
		b1_list.append(32);
		b1_list.append(17);
		b1_list.append(27);
		b1_list.append(33);
		b1_list.append(34);
		b1_list.append(26);
		b1_list.append(99);
		b1_list.print();
		b1_list.remove( 27 );
		b1_list.print();
		b1_list.remove( 31 );
		b1_list.print();
		b1_list.remove( 99 );
		b1_list.print();
		
		//b1_list.delete();
		
		b1_list.insertAt( 6, 55);
		b1_list.print();
		b1_list.insertAt( -6, 26);
		b1_list.print();
		b1_list.insertAt( 66, 29);
		b1_list.print();
		b1_list.removeAt ( 0);
		b1_list.print();
		b1_list.removeAt ( 4);
		b1_list.print();
		b1_list.removeAt ( 10);
		b1_list.print();
		
		b1_list.reverse();
		b1_list.print();
		
		b1_list.delete();
		b1_list.append(10);
		b1_list.append(20);
		b1_list.print();
		b1_list.reverse();
		b1_list.print();
		
		
		
		
		
		
		
		
		
		
	 }
}



