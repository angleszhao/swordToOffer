package queue;

public class LinkQueue<E> {

	private class Node<E>{
		E e;
		Node<E> next;
		public Node(){}
		public Node(E e,Node next){
			this.e=e;
			this.next=next;
		}
	}
	private Node front;
	private Node rear;
	private int size;
	public LinkQueue() {
		rear=front=null;
	}
	public boolean isEmpty(){
		return size==0;
	}
	public boolean add(E e){
		if(isEmpty()){
			front=new Node(e,null);
			rear=front;
		}else{
			Node<E> newNode=new Node<E>(e,null);
			rear.next=newNode;
			rear=newNode;
		}
		size++;
		return true;
	}
	public Node<E> peek(){
		if(isEmpty()){
			throw new RuntimeException("空队列异常！");
		}else{
			return front;
		}
	}
	public Node<E> poll(){
		if(isEmpty()){
			throw new RuntimeException("空队列异常！");
		}else{
			Node<E> value=front;
			front=front.next;
			value.next=null;
			size--;
			return value;
		}
	}
	public int length(){
		return size;
	}

}
