package swordToOffer;

import java.util.Stack;

class Node {
	public int data;
	public Node nextNode;
 
	public Node() {
 
	}
 
	public Node(int data) {
		this.data = data;
	}
}
public class E05FromTailToStart {

	public E05FromTailToStart() {
		// TODO Auto-generated constructor stub
	}

	// 采用递归调用的方法
	public void printTailToStartRec(Node start){
		if(start==null)
			return;
		if(start.nextNode!=null){
			printTailToStartRec(start.nextNode);
		}
		System.out.println(start.data);
	}
	
	// 采用栈--先进后出的方法
	public void printTailToStartStack(Node start){
		if(start==null)
			return;
		Stack<Node> stack=new Stack<>();
		while(start!=null){
			stack.push(start);
			start=start.nextNode;
		}
		while(!stack.isEmpty()){
			System.out.println(stack.pop().data);
		}
	}
	public static void main(String[] args) {
		Node start=new Node(1);
		Node two=new Node(2);
		Node three=new Node(3);
		start.nextNode=two;
		two.nextNode=three;
		E05FromTailToStart test=new E05FromTailToStart();
		test.printTailToStartRec(start);
		test.printTailToStartStack(start);
	}
}
