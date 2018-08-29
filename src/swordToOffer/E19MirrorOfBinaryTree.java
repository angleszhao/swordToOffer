package swordToOffer;

public class E19MirrorOfBinaryTree {

	public E19MirrorOfBinaryTree() {
		// TODO Auto-generated constructor stub
	}

	public void MirrorRecursively(BinaryTreeNode node){
		if(node==null)
			return;
		if(node.getLeft()==null && node.getRight()==null)
			return;
		BinaryTreeNode temp=node.getLeft();
		node.setLeft(node.getRight());
		node.setRight(temp);
		if(node.getLeft()!=null)
			MirrorRecursively(node.getLeft());
		if(node.getRight()!=null)
			MirrorRecursively(node.getRight());
	}
}
