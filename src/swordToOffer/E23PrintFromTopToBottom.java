package swordToOffer;

import java.util.LinkedList;
import java.util.Queue;

public class E23PrintFromTopToBottom {

	public void PrintFromTopToBottom(BinaryTreeNode root) {
		if(root == null)
			return;
		Queue<BinaryTreeNode> queue=new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()){
			BinaryTreeNode node=queue.poll();
			System.out.print(node.getData()+",");
			if(node.getLeft()!=null)
				queue.add(node.getLeft());
			if(node.getRight()!=null)
				queue.add(node.getRight());
		}
	}

	
}
