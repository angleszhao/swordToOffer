package tree;

import java.util.LinkedList;
import java.util.Queue;

//https://www.jb51.net/article/138495.htm
public class BinarySortTree<E extends Comparable<E>> {

	private BinaryNode<E> root;
	public BinarySortTree() {
		root=null;
	}

	public void insertNode(E value){
		if(root==null){
			root=new BinaryNode<E>(value);
			return;
		}
		BinaryNode<E> currentNode=root;
		while(true){
			if(value.compareTo(currentNode.value)>0){
				if(currentNode.right==null){
					currentNode.right=new BinaryNode<E>(value);
					break;
				}
				currentNode=currentNode.right;
			}else{
				if(currentNode.left==null){
					currentNode.left=new BinaryNode<E>(value);
					break;
				}
				currentNode=currentNode.left;
			}
		}
	}
	public BinaryNode<E> getRoot(){
		return root;
	}
	
	//�������
	public void preOrderTraverse(BinaryNode<E> node){
		System.out.print(node.value+" ");
		if(node.left!=null)
			preOrderTraverse(node.left);
		if(node.right!=null)
			preOrderTraverse(node.right);
	}
	//�������
	public void inOrderTraverse(BinaryNode<E> node){
		if(node.left!=null)
			inOrderTraverse(node.left);
		System.out.print(node.value+" ");
		if(node.right!=null)
			inOrderTraverse(node.right);
	}
	//�������
	public void postOrderTraverse(BinaryNode<E> node){
		if(node.left!=null)
			postOrderTraverse(node.left);
		if(node.right!=null)
			postOrderTraverse(node.right);
		System.out.print(node.value+" ");
	}
	//����������ǵݹ飩
	public void preOrderNoRecursion(BinaryNode<E> root){
		LinkedList<BinaryNode<E>> stack=new LinkedList<>();
		BinaryNode<E> currentNode=null;
		stack.push(root);
		while(!stack.isEmpty()){
			currentNode=stack.pop();
			System.out.print(currentNode.value+" ");
			if(currentNode.right!=null)
				stack.push(currentNode.right);
			if(currentNode.left!=null)
				stack.push(currentNode.left);
		}
	}
	//����������ǵݹ飩
		public void inOrderNoRecursion(BinaryNode<E> root){
			LinkedList<BinaryNode<E>> stack=new LinkedList<>();
			BinaryNode<E> currentNode=root;
			while(currentNode!=null || !stack.isEmpty()){
				// һֱѭ������������������˵�Ҷ�ӽ�㣨currentNode��null��
				while(currentNode!=null){
					stack.push(currentNode);
					currentNode=currentNode.left;
				}
				currentNode=stack.pop();
				System.out.print(currentNode.value+" ");
				currentNode=currentNode.right;
			}
		}
	//����������ǵݹ飩
		public void postOrderNoRecursion(BinaryNode<E> root){
			LinkedList<BinaryNode<E>> stack=new LinkedList<>();
			BinaryNode<E> currentNode=root;
			BinaryNode<E> rightNode=null;
			while(currentNode!=null || !stack.isEmpty()){
				// һֱѭ������������������˵�Ҷ�ӽ�㣨currentNode��null��
				while(currentNode!=null){
					stack.push(currentNode);
					currentNode=currentNode.left;
				}
				currentNode=stack.pop();
				// ��ǰ���û���ҽ�����һ����㣨�Ѿ�����Ľ�㣩�ǵ�ǰ�����ҽ�㣬�������ǰ���
				while(currentNode.right==null || currentNode.right==rightNode){
					System.out.print(currentNode.value+" ");
					rightNode=currentNode;
					if(stack.isEmpty()){
						return;//root����������������
					}
					currentNode=stack.pop();
				}
				stack.push(currentNode);
				currentNode=currentNode.right;
			}
		}
		//������ȱ���
		public void BFS(BinaryNode<E> root){
			Queue<BinaryNode<E>> queue=new LinkedList<>();
			BinaryNode<E> currentNode=null;
			queue.offer(root);
			while(!queue.isEmpty()){
				currentNode=queue.poll();
				System.out.print(currentNode.value+" ");
				if(currentNode.left!=null)
					queue.offer(currentNode.left);
				if(currentNode.right!=null)
					queue.offer(currentNode.right);
			}
		}
		//������ȱ���
		public void DFS(BinaryNode<E> root){
			LinkedList<BinaryNode<E>> stack=new LinkedList<>();
			BinaryNode<E> currentNode=null;
			stack.push(root);
			while(!stack.isEmpty()){
				currentNode=stack.pop();
				System.out.print(currentNode.value+" ");
				if(currentNode.right!=null)
					stack.push(currentNode.right);
				if(currentNode.left!=null)
					stack.push(currentNode.left);
			}
		}
		
		public static void main(String[] args) {
			BinarySortTree<Integer> tree=new BinarySortTree<>();
			tree.insertNode(35);
			tree.insertNode(20);
		    tree.insertNode(15);
		    tree.insertNode(16);
		    tree.insertNode(29);
		    tree.insertNode(28);
		    tree.insertNode(30);
		    tree.insertNode(40);
		    tree.insertNode(50);
		    tree.insertNode(45);
		    tree.insertNode(55);
		    System.out.print("����������ݹ飩��");
		    tree.preOrderTraverse(tree.getRoot());
		    System.out.println();
		    System.out.print("����������ݹ飩��");
		    tree.inOrderTraverse(tree.getRoot());
		    System.out.println();
		    System.out.print("����������ݹ飩��");
		    tree.postOrderTraverse(tree.getRoot());
		    System.out.println();
		    System.out.print("����������ǵݹ飩��");
		    tree.preOrderNoRecursion(tree.getRoot());
		    System.out.println();
		    System.out.print("����������ǵݹ飩��");
		    tree.inOrderNoRecursion(tree.getRoot());
		    System.out.println();
		    System.out.print("����������ǵݹ飩��");
		    tree.postOrderNoRecursion(tree.getRoot());
		    System.out.println();
		    System.out.print("������ȱ�����");
		    tree.BFS(tree.getRoot());
		    System.out.println();
		    System.out.print("������ȱ�����");
		    tree.DFS(tree.getRoot());
		}
}
