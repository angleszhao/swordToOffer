package swordToOffer;


public class E16ReverseList {

	private class Node{
        private Object data;
        private Node next;
        
        public Node(Object data){
            this.data = data;
        }
	}
	public E16ReverseList() {
		// TODO Auto-generated constructor stub
	}

	public Node ReverseList(Node head){
		if(head==null)
			return null;
		Node preNode=null;
		Node nowNode=head;
		while(nowNode!=null){
			Node nextNode = nowNode.next;
			nowNode.next=preNode;
			preNode=nowNode;
			nowNode=nextNode;
		}
		return preNode;
	}
	public static void main(String[] args) {
		E16ReverseList test=new E16ReverseList();
		Node head=test.new Node(1);
		Node second=test.new Node(2);
		Node third=test.new Node(3);
		Node forth=test.new Node(4);
		head.next=second;
		second.next=third;
		third.next=forth;
		Node res=test.ReverseList(head);
		while(res!=null){
		System.out.println(res.data);
		res=res.next;
		}
	}
}
