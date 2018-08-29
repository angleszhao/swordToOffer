package swordToOffer;

public class E39BinaryDepth {

	public boolean isBalanced(BinaryTreeNode root) {
		int depth=0;
		return isBalanced(root,depth);
	}

	private boolean isBalanced(BinaryTreeNode root, int depth) {
		if(root==null){
			depth=0;
			return true;
		}
		int left=0,right=0;
		if(isBalanced(root, left)&& isBalanced(root, right)){
			int diff=right-left;
			if(diff>=-1 && diff<=1){
				depth=1+(left>right?left:right);
				return true;
			}
		}
		return false;
	}

}
