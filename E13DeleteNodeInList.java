package swordToOffer;

public class E13DeleteNodeInList {

	private class Node{
        private Object data;
        private Node next;
        
        public Node(Object data){
            this.data = data;
        }
	}
    
	public E13DeleteNodeInList() {
		// TODO Auto-generated constructor stub
	}

	public void deleteNode(Node head,Node deleteNode){
		if(deleteNode==null || head==null)
			return;
		if(head==deleteNode)
			head=null;
		else{
			if(deleteNode.next==null){
				Node printlistNode=head;
				while(printlistNode.next.next!=null){
					printlistNode=printlistNode.next;
				}
				printlistNode.next=null;
			}else{
				deleteNode.data=deleteNode.next.data;
				deleteNode.next=deleteNode.next.next;
			}
		}
	}
}
