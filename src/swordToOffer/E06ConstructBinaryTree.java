package swordToOffer;

public class E06ConstructBinaryTree {

	public E06ConstructBinaryTree() {
		// TODO Auto-generated constructor stub
	}

	public BinaryTreeNode Construct(int[] preOrder,int[] inOrder,int length){
		if(preOrder==null || inOrder==null ||length<=0)
			return null;
		return ConstructCore(preOrder,0,preOrder.length-1,inOrder,0,inOrder.length-1);
	}

	private BinaryTreeNode ConstructCore(int[] preOrder, int startPreIndex, int endPreIndex, int[] inOrder, int startInIndex, int endInIndex) {
		int rootValue=preOrder[startPreIndex];
		BinaryTreeNode root=new BinaryTreeNode(rootValue);
		if(startPreIndex == endPreIndex){//one number
			if(startInIndex == endInIndex && preOrder[startPreIndex]==inOrder[startInIndex]){
				return root;
			}else{
				System.out.println("startInIndex:"+startInIndex+" ; startPreIndex:"+startPreIndex);
				System.out.println("preOrder[startPreIndex]: "+preOrder[startPreIndex]+" ; inOrder[startInIndex]:"+inOrder[startInIndex]);
				throw new RuntimeException("Error!!!");
			}
		}
		int rootInIndex=startInIndex;
		while(rootInIndex<=endInIndex && inOrder[rootInIndex]!=rootValue){
			rootInIndex++;
		}
		if(rootInIndex==endInIndex && inOrder[rootInIndex]!=rootValue){
			throw new RuntimeException("Error");
		}
		int leftLength=rootInIndex-startInIndex;
		int leftPreOrderEndIndex=startPreIndex+leftLength;
		if(leftLength>0){
			root.setLeft(ConstructCore(preOrder, startPreIndex+1, leftPreOrderEndIndex, inOrder, startInIndex, rootInIndex-1));
			
		}
		if(leftLength<endPreIndex-startInIndex){
			root.setRight(ConstructCore(preOrder, leftPreOrderEndIndex+1, endPreIndex, inOrder, rootInIndex+1, endInIndex));
			
		}
		return root;
	}
	
	public void printPreorder(BinaryTreeNode root){
		if(root ==null){
			return;
		}else{
			System.out.println(root.getData()+" ");
		}
		if(root.getLeft()!=null)
			printPreorder(root.getLeft());
		if(root.getRight()!=null)
			printPreorder(root.getRight());
	}
	
	public static void main(String[] args) {
		E06ConstructBinaryTree test=new E06ConstructBinaryTree();
		int[] preOrder={1,2,4,7,3,5,6,8};
		int[] inOrder={4,7,2,1,5,3,6,8};
		test.printPreorder(test.Construct(preOrder, inOrder, preOrder.length));
	}
}
