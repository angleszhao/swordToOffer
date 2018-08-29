package swordToOffer;

public class E26ComplexListCopy {

	public class Node{
		int value;
		Node next;
		Node sbiling;
		public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("value = " + value);
            sb.append(", next = " + (next == null ? "null" : next.value));
            sb.append(", sbiling = " + (sbiling == null ? "null" : sbiling.value));
            return sb.toString();
        }
	}
	public Node clonelist(Node head) {
		Node node=head;
		//step1
		while(node!=null){
			Node copyNode=new Node();
			copyNode.value=node.value;
			copyNode.next=node.next;
			copyNode.sbiling=null;
			node.next=copyNode;
			node=copyNode.next;
		}
		//step2
		node=head;
		while(node!=null){
			Node copyNode=node.next;
			if(node.sbiling!=null)
				copyNode.sbiling=node.sbiling.next;
			node=copyNode.next;
		}
		//step3
		node=head;
		Node copyHead=null;
		Node copyNode=null;
		if(node!=null){
			copyHead=node.next;
			copyNode=node.next;
			node.next=copyNode.next;
			node=node.next;
		}
		while(node!=null){
			copyNode.next=node.next;
			copyNode=copyNode.next;
			node.next=copyNode.next;
			node=node.next;
		}
		return copyHead;
	}
	public static void main(String[] args) {
		E26ComplexListCopy test=new E26ComplexListCopy();
		Node head = test.new Node();
        head.value = 1;

        Node node2 = test.new Node();
        node2.value = 2;

        Node node3 = test.new Node();
        node3.value = 3;

        Node node4 = test.new Node();
        node4.value = 4;

        Node node5 = test.new Node();
        node5.value = 5;

        head.next = node2;
        head.sbiling = node3;

        node2.next = node3;
        node2.sbiling = node5;

        node3.next = node4;

        node4.next = node5;
        node4.sbiling = node2;

        Node copyHead = test.clonelist(head);

        Node node = copyHead;
        while(node != null){
            System.out.println(node);
            node = node.next;
        }
	}

}
