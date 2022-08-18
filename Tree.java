class Tree {
public Node root ;

public Tree (){
root = null ;
}//end of const


public void insert( int id ){
Node inNode = new Node ();
inNode.Item = id ;

if ( root == null )
  root = inNode ;
else
   {
   Node cur = root ;
   Node parent ;

 while ( true ){
 parent = cur ;

 if ( id < cur.Item){

 cur = cur.LeftChild ;
 if ( cur == null ){
	 parent.LeftChild = inNode ;
	 return ;
	}

 }//end of go left
 else
 {
	 cur = cur.RightChild ;
	 if ( cur == null ){
		parent.RightChild = inNode ;
		return ;
	 }
}//end of go right


 }//end of while
}//end of not root

}//end of insert

public void Display(){
while (  root.RightChild != null && root.LeftChild !=  null){
	System.out.println( root.Item  );
	System.out.println( root.RightChild.Item );
	System.out.println( root.LeftChild.Item );

}
	}//end of display

public void traverse ( int TravType){

	switch ( TravType){
		case 1 : System.out.println(" preorder travers ");
		         preorder (  root );
		         break ;
	    case 2 : System.out.println(" inorder travers ");
	             inorder ( root );
	             break ;
	    case 3 : System.out.println(" postorder travers");
	             postorder ( root );
	             break;

		}//end of switch

	}//end of travType

	private void preorder ( Node PreRoot ){

		if ( PreRoot != null ){
			System.out.println( PreRoot.Item);
			preorder (PreRoot.LeftChild );
			preorder (PreRoot.RightChild);

		}//end of pre if
		}//end of preorder

	private void inorder ( Node InRoot){

		if ( InRoot != null ) {
			inorder ( InRoot.LeftChild );
			System.out.println ( InRoot.Item);
			inorder ( InRoot.RightChild);
		}//end of inorder if
		}//end of inorder

    private void postorder ( Node PoRoot ){

		if ( PoRoot != null ){
			postorder ( PoRoot.LeftChild);
			postorder ( PoRoot.RightChild);
			System.out.println( PoRoot.Item);

			}// end of postorder if

		}// end of postorder

	public Node Search ( int Key ){
		Node cur = root ;

		while ( cur.Item != Key ){

			if ( Key < cur.Item)
			  cur = cur.LeftChild ;
			  else
			  cur = cur.RightChild ;
			  if (cur == null )
			   return null ;

			}//end of while Serach
return cur ;
		}// end of Search

public int SumTree (  Node Temp){
	int SumLeft , SumRight , Sum ;
	Sum = SumLeft = SumRight = 0;
	if ( root == null ){
		System.out.println(" tree is empty");
	return 0 ;

		}//end of check tree if
	else {
		if ( Temp.LeftChild != null )
		SumLeft = SumTree ( Temp.LeftChild);

		if ( Temp.RightChild != null  )
		SumRight = SumTree( Temp.RightChild);

		Sum = Temp.Item + SumLeft + SumRight;
		return Sum;
		}
	}//end of sum

public boolean Delete ( int Key ){

	Node cur = root ;
	Node parent = root  ;
	boolean isLeft =  true ;

	while ( cur.Item != Key ){


		parent = cur ;
		if ( Key < cur.Item){
             isLeft =  true ;
             cur =  cur.LeftChild ;
			}// end of first delete if
			else
			{
				isLeft = false ;
				cur = cur.RightChild ;
			}
		if ( cur == null)
		return false ;
		}// end of delete while


		//no child -- simple delete
		if ( cur.LeftChild == null && cur.RightChild == null ){
			if ( cur == root )
			root = null ;
			  else
			if ( isLeft)
			parent.LeftChild = null ;
			  else
			parent.RightChild = null ;
			}// end of 3 if

//have chid
//1 no right child
              else
            if ( cur.RightChild == null )
            if ( cur == root )
                root = cur.LeftChild ;
              else
            if ( isLeft )
            parent.LeftChild = cur.LeftChild ;
              else
            parent.RightChild = cur.RightChild ;

// 2 no left childe
              else
            if ( cur.LeftChild == null)
            if ( cur == root )
                root = cur.RightChild;
               else
            if ( isLeft)
                parent.LeftChild = cur.RightChild ;
              else
                parent.RightChild = cur.RightChild ;
              else
              {
				  Node success = cur ;
		   if ( cur == root )
		   root = success ;
		      else
		   if ( isLeft)
		   parent.LeftChild = success ;
		      else
		   parent.RightChild = success ;

           success.LeftChild = cur.LeftChild ;
				  }// end of else tow children
return true ;
	}//end of delet

}//end of tree class