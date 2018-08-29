package swordToOffer;

public class E18SubstructureInTree {

	public E18SubstructureInTree() {
		// TODO Auto-generated constructor stub
	}

	public boolean hasSubTree(BinaryTreeNode root1,BinaryTreeNode root2){
		if(root2==null)
			return true;
		if(root1==null)
			return false;
		boolean res=false;
		if(root1!=null && root2!=null){
			if(root1.getData()==root2.getData()){
				res=doesTree1HaveTree2(root1,root2);
			}
			if(!res)
				res=hasSubTree(root1.getLeft(), root2);
			if(!res)
				res=hasSubTree(root1.getRight(), root2);
		}
		return res;
	}

	private boolean doesTree1HaveTree2(BinaryTreeNode root1, BinaryTreeNode root2) {
		if(root2==null)
			return true;
		if(root1==null)
			return false;
		if(root1.getData()!=root2.getData())
			return false;
		return doesTree1HaveTree2(root1.getLeft(), root2.getLeft()) && doesTree1HaveTree2(root1.getRight(), root2.getRight());
	}
}
