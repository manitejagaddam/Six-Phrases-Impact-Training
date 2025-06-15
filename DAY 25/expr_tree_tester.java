class Node
{
    char oper_ator_and;
    Node left;
	Node right;
	Node ( char ch )
	{
		oper_ator_and = ch;
		left = null;
		right = null;
	}
	
}
class stack_node
{
   Node inStack;
   stack_node next;
   stack_node ( Node inStack )
   {
      this.inStack = inStack;
	  next = null;
   }
}

class stack
{
    stack_node top;
	stack ()
	{
	   top = null;
	}
	void push (Node keep)
	{
	   stack_node push_in = new stack_node( keep );
	   if ( top == null )
	      top = push_in;
	   else
       {
	      push_in.next = top;
		  top = push_in;
	   } 
	}

	Node pop ()
	{
	  Node giveBack = top.inStack;
	  top = top.next;
	  return giveBack;
	   
	}
	
}
class tree_expr
{
	 Node root;
	 static int row = 4;
	 tree_expr (Node rt)
	 {
		 root = rt;
	 }
	 void draw()
	 {
		 // arm
		 // env 
		 // call
		 console.cls();
		  draw_tree (1, 100, root );
	 }
void draw_tree( int start  , int end ,  Node dispptr)
{
   int col;
   
   col = (end - start )/ 2 + start;
   if(dispptr != null )  {
   console.gotoxy(row,col);
   System.out.printf("%c",dispptr.oper_ator_and);
   row+=2;
   draw_tree(start,end/2 + start/2,dispptr.left);
   draw_tree(end/2  +start/2 + 1, end , dispptr.right);
   row-=2;
   }
}
   int solve ()
   {
	   // arm
	   // env 
	   // call helper
	   
	   return solve_helper( root );
	   
   }
   int solve_helper ( Node tref)
   {
	  int left_expr_val;
      int right_expr_val;	  
	  if ( tref.left == null && tref.right == null )
		   return tref.oper_ator_and - '0';
	  
	  left_expr_val  = solve_helper ( tref.left );
	  right_expr_val = solve_helper ( tref.right);
	  int res=0;
				  int multiplyCtr;
	  switch ( tref.oper_ator_and )
	  {
		  case '+' : return left_expr_val+right_expr_val;
		  case '-' : return left_expr_val - right_expr_val;
		  case '*' : return left_expr_val * right_expr_val;
		  case '/' : return left_expr_val / right_expr_val;
		  case '%' : return left_expr_val % right_expr_val;
		  case '^' :
		          
				  for( res = 1, multiplyCtr=0 ; multiplyCtr < right_expr_val; multiplyCtr++)
					     res *= left_expr_val;
				  	 
	  }
	  
	  return res;
   }
   

	 
	 
}
class console
{
    public static void gotoxy( int row, int col )
	{
	   System.out.printf("%c[%d;%dH", 27,row, col); 
	}
	public static void cls()
	{
	   System.out.printf("\033[2J"); 
	}

}
class expr_tree_tester
{
	public static boolean isOperator ( char ch )
	{
		return ( ch == '+' || ch == '-' || ch == '*' ||
		         ch == '/' || ch == '%' || ch == '^');
		
	}
     public static void main(String [] args)
	 {
		String expr = "36+28+*82/35^**";
		int expr_ind;
		stack ourStack = new stack();
		Node newNode;
		Node rt;
		
		
		for( expr_ind = 0; expr_ind < expr.length(); expr_ind++)
		{
		      if ( isOperator( expr.charAt ( expr_ind)) == true )
			  {
			     newNode = new Node ( expr.charAt ( expr_ind) );
				 newNode.right = ourStack.pop();
				 newNode.left  = ourStack.pop();
				 ourStack.push ( newNode );
			  }
			  else
			  {
			     newNode = new Node ( expr.charAt ( expr_ind) );
				 ourStack.push ( newNode );

			  }
		}
		rt = ourStack.pop();
			tree_expr root = new tree_expr ( rt );
		root.draw();
		int res = root.solve();
		console.gotoxy(20,20);
		System.out.printf("res = %d\n", res);
	 }
}















