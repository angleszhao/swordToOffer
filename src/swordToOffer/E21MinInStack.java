package swordToOffer;

public class E21MinInStack {

	MyStack<Integer> minStack=new MyStack<>();
	MyStack<Integer> dataStack=new MyStack<>();
	public E21MinInStack() {
		// TODO Auto-generated constructor stub
	}
	public void push(Integer item){
		dataStack.push(item);
		if(minStack.length==0 || item<=minStack.head.data){
			minStack.push(item);
		}else{
			minStack.push(minStack.head.data);
		}
	}
	public Integer pop(){
		if(dataStack.length==0||minStack.length==0)
			return null;
		minStack.pop();
		return dataStack.pop();
	}
	public Integer min(){
		if(minStack.length==0)
			return null;
		return minStack.head.data;
	}

	public static void main(String[] args) {
		E21MinInStack test=new E21MinInStack();
		test.push(2);
		test.push(4);
		test.push(1);
		test.push(-2);
		System.out.println(test.min());
		System.out.println(test.pop());
		System.out.println(test.min());
	}
}
