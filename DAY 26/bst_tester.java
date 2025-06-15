


class bst 
{
class Node
{
    int data;
	Node left;
	Node right;
	
	Node ( int data )
	{
	    this.data = data;
		left = null;
		right = null;
	}
}





class qNode
{
	Node inQ;
	qNode qNext;
	
	qNode ( Node keep)
	{
		inQ = keep;
		qNext = null;
	}
}
class queue
{
	qNode front;
	qNode rear;
	
	queue()
	{
		front = null;
		rear  = null;  
	}
	boolean isEmpty()
	{
		return front==null;
	}
	
	void enque ( Node keepSafe)
	{
		qNode tref = new qNode ( keepSafe );
		if ( front == null )
		{
			 front = tref;
			 rear  = tref;
		}
		else 
		{
			rear.qNext = tref;
			rear = tref;
		}
		
	}
	
	
	Node deque ()
	{
		Node giveBack;
		giveBack = front.inQ;
		front = front.qNext;
		if ( front == null )
			rear = null;
		return giveBack;
	}
	
	
	
	
	
	
	
	
}













    Node root;
	int non;
	
	bst()
	{
	    root = null;
		non = 0;
	}
	void add( int value )
	{
	   Node newNode = new Node ( value );
	   if ( root == null )
	   {
	      root = newNode;
	   }
	   else
	   {
	     Node tref;
		 Node prev;
		 for( tref = root, prev = null; tref != null;prev=tref,
		   tref = value > tref.data ? tref.right : tref.left );
		   if ( prev.data > value )
		      prev.left = newNode;
		   else
              prev.right = newNode;		   
	   }
	   non++;
	}
	void inOrder_helper( Node tref ) // traversal reference
	{
	   if ( tref == null )
	      return;
		  inOrder_helper ( tref.left );
		  System.out.printf("%d ", tref.data );
		  inOrder_helper ( tref.right );
	}
	void inOrder()
	{
	   // armlength
	   if ( root == null )
	        return;
	   if ( non == 1)
	   {
	      System.out.printf("%d", root.data);
		  return;
	   }
	   // environment
	   
	   // 
	   inOrder_helper ( root );	   
	   
	   
			
	}
	void postOrder()
	{
		// armlength
	   if ( root == null )
	        return;
	   if ( non == 1)
	   {
	      System.out.printf("%d", root.data);
		  return;
	   }
	   // environment
	   
	   // 
	   postOrder_helper ( root );	
	}
	void postOrder_helper ( Node tref )
	{
		if ( tref  == null ) 
			return;
		
	    postOrder_helper ( tref.left );
		postOrder_helper ( tref.right );
	    System.out.printf("%d ", tref.data);
		
	}
	void preOrder()
	{
		// armlength
	   if ( root == null )
	        return;
	   if ( non == 1)
	   {
	      System.out.printf("%d", root.data);
		  return;
	   }
	   // environment
	   
	   // 
	   preOrder_helper ( root );	
	}
	void preOrder_helper ( Node tref )
	{
		if ( tref  == null ) 
			return;
	    System.out.printf("%d ", tref.data);
		
	    preOrder_helper ( tref.left );
		preOrder_helper ( tref.right );
		
	}
    void levelOrder()
	{
		// armlength
		
		// 
		queue ourQ = new queue();
		
		levelOrder_helper ( ourQ);
		
	}
	
	void levelOrder_helper ( queue yourQ)
	{
		yourQ.enque(root);
		Node forProc;
		while ( yourQ.isEmpty()==false)
		{
			forProc = yourQ.deque();
			System.out.printf("%d ", forProc.data);
			if ( forProc.left != null )
				yourQ.enque ( forProc.left );
			if ( forProc.right != null )
				yourQ.enque ( forProc.right );
			
		}
	}

	
}


class bst_tester
{
     public static void main(String [] args)
	 {
		bst b1_tree = new bst();
		int arr [] = {40,20,60,10,30,50,70,5,15,25,35,45,55,65,75};
		// add all nodes
		for ( int arr_ind = 0; arr_ind < arr.length; arr_ind++)
			   b1_tree.add ( arr [ arr_ind ] );
		b1_tree.inOrder();
		System.out.println();
		b1_tree.postOrder();
		System.out.println();
		b1_tree.preOrder();
		System.out.println();
		b1_tree.levelOrder();
		
	 }
}










