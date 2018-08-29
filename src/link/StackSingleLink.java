package link;

public class StackSingleLink {

	private SingleLinkedList link;
	public StackSingleLink() {
		link=new SingleLinkedList();
	}
	public void push(Object obj){
		link.addHead(obj);
	}
	public Object pop(){
		Object obj=link.deleteHead();
		return obj;
	}
	public boolean isEmpty(){
		return link.isEmpty();
	}
	public void display(){
		link.display();
	}

}
