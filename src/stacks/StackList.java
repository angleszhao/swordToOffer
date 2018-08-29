package stacks;

import java.util.LinkedList;

/**
 * ����LinkedListʵ��ջ
 * ��LinkedListʵ����ֻѡ�񲿷ֻ���ջʵ�ֵĽӿ�
 */
public class StackList<E> {

	private LinkedList<E> l1=new LinkedList<E>();
	public void push(E e){
		l1.addFirst(e);
	}
	public E peek(){
		return l1.getFirst();
	}
	public E pop(){
		return l1.removeFirst();
	}
	public boolean empty(){
		return l1.isEmpty();
	}
	public String toString(){
		return l1.toString();
	}

}
