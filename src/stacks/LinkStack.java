package stacks;

public class LinkStack<E> {

	private class Node<E>{
		E e;
		Node<E> next;
		public Node(){}
		public Node(E e,Node next){
			this.e=e;
			this.next=next;
		}
	}
	private Node<E> top;
	private int size;
	
	public LinkStack() {
		top=null;
	}
	public int length(){
		return size;
	}
	public boolean isEmpty(){
		return size==0;
	}
	public boolean push(E e){
		top =new Node(e,top);
		size++;
		return true;
	}
	public Node<E> peek(){
		if(isEmpty()){
			throw new RuntimeException("ø’’ª“Ï≥£");
		}else{
			return top;
		}
	}
	public Node<E> pop(){
		if(isEmpty()){
			throw new RuntimeException("ø’’ª“Ï≥£");
		}else{
			Node<E> value=top;
			top=top.next;
			value.next=null;
			size--;
			return value;
		}
	}

}
