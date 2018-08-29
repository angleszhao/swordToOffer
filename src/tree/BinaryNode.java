package tree;

public class BinaryNode<E extends Comparable<E>> {

	E value;
	BinaryNode<E> left;
	BinaryNode<E> right;
	public BinaryNode(E value) {
		this.value=value;
		left=null;
		right=null;
	}

}
