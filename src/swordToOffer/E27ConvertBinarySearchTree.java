package swordToOffer;

public class E27ConvertBinarySearchTree {

	public BinaryTreeNode convert(BinaryTreeNode root) {
		BinaryTreeNode node=null;
		convert(root,node);
		while(node!=null &&node.getLeft()!=null){
			node=node.getLeft();//find the head
		}
		return node;
	}

	public void convert(BinaryTreeNode root, BinaryTreeNode lastNode) {
		if(root==null)
			return;
		BinaryTreeNode current=root;
		if(current.getLeft()!=null){
			convert(current.getLeft(), lastNode);
		}
		current.setLeft(lastNode);
		if(lastNode!=null)
			lastNode.setRight(current);
		lastNode=current;
		if(current.getRight()!=null)
			convert(root.getRight(), lastNode);
		
	}

}
