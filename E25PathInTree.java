package swordToOffer;

import java.util.Stack;

public class E25PathInTree {

	public void findPath(BinaryTreeNode root,int target) {
		if(root==null)
			return;
		Stack<Integer> stack=new Stack<>();
		findPath(root,target,stack);
	}

	public void findPath(BinaryTreeNode root, int target, Stack<Integer> stack) {
		if(root.getLeft()==null && root.getRight()==null){
			if(root.getData()==target){
				System.out.println("PATH:");
				for(int i:stack)
					System.out.print(i+",");
				System.out.println(root.getData());
			}
		}else{
			stack.push(root.getData());
			findPath(root.getLeft(), target-root.getData(), stack);
			findPath(root.getRight(), target-root.getData(), stack);
			stack.pop();
		}
	}
	
	public static void main(String[] args) {
		BinaryTreeNode root1 = new BinaryTreeNode();
		BinaryTreeNode node1 = new BinaryTreeNode();
		BinaryTreeNode node2 = new BinaryTreeNode();
		BinaryTreeNode node3 = new BinaryTreeNode();
		BinaryTreeNode node4 = new BinaryTreeNode();
		BinaryTreeNode node5 = new BinaryTreeNode();
		BinaryTreeNode node6 = new BinaryTreeNode();
		root1.setLeft(node1);
		root1.setRight(node2); 
		node1.setLeft(node3);
		node1.setRight(node4); 
		node4.setLeft(node5);
		node4.setRight(node6);
		root1.setData(8);
		node1.setData(8);
		node2.setData(7);
		node3.setData(9);
		node4.setData(2);
		node5.setData(4);
		node6.setData(7);
		E25PathInTree test = new E25PathInTree();
		test.findPath(root1, 25);
	}

}
