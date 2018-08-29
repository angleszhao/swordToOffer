package link;
//https://www.cnblogs.com/ysocean/p/7928988.html#_labelTop
public class SingleLinkedList {

	private class Node{
		private Object data;
		private Node next;
		public Node(Object data) {
			super();
			this.data = data;
		}
		
	}
	int size;
	private Node head;
	public SingleLinkedList() {
		size=0;
		head=null;
	}
	public Object addHead(Object obj){
		Node newHead=new Node(obj);
		if(size==0){
			head=newHead;
		}else{
			newHead.next=head;
			head=newHead;
		}
		size++;
		return obj;
	}
	public Object deleteHead(){
		Object obj=head.data;
		head=head.next;
		size--;
		return obj;
	}
	public Node find(Object obj){
		Node current=head;
		int tempsize=size;
		while(tempsize>0){
			if(obj.equals(current.data)){
				return current;
			}else{
				current=current.next;
			}
			tempsize--;
		}
		return null;
	}
	public boolean delete(Object value){
		if(size==0){
			return false;
		}
		Node current=head;
		Node previous=head;
		while(current.data!=value){
			if(current.next==null)
				return false;
			else{
				previous=current;
				current=current.next;
			}
		}
		if(current==head){
			head=current.next;
			size--;
		}else{
			previous.next=current.next;
			size--;
		}
		return true;
	}
	public boolean isEmpty(){
		return (size==0);
	}
	public void display(){
		if(size>0){
			Node node=head;
			int tempsize=size;
			if(tempsize==1){
				System.out.print("["+head.data+"]");
				return;
			}
			while(tempsize>0){
				if(node.equals(head)){
					System.out.print("["+head.data+"->");
				}else if(node.next==null){
					System.out.print(node.data+"]");
				}else{
					System.out.print(node.data+"->");
				}
				node=node.next;
				tempsize--;
			}
			System.out.println();
		}else{
			System.out.println("[]");
		}
	}
	public static void main(String[] args) {
		
		    SingleLinkedList singleList = new SingleLinkedList();
		    singleList.addHead("A");
		    singleList.addHead("B");
		    singleList.addHead("C");
		    singleList.addHead("D");
		    //打印当前链表信息
		    singleList.display();
		    //删除C
		    singleList.delete("C");
		    singleList.display();
		    //查找B
		    System.out.println(singleList.find("B"));
		
	}
}
