package swordToOffer;

import java.util.Stack;

public class E07QueueWithTwoStacks {

	Stack<String> stack1=new Stack<>();
	Stack<String>  stack2=new Stack<>();
	public E07QueueWithTwoStacks() {
		// TODO Auto-generated constructor stub
	}
	public void appendTail(String s){
		stack1.push(s);
	}
	public String deletedHead() throws Exception{
		if(stack2.isEmpty()){
			while(!stack1.isEmpty()){
				stack2.push(stack1.pop());
			}
		}
		if(stack2.isEmpty()){
			throw new Exception("null queue");
		}
		return stack2.pop();
	}

}
