package queue;

import java.util.Arrays;

public class LoopQueue<E> {

	public Object[] data=null;
	private int maxSize;
	private int size=0;
	private int rear;
	private int front;
	public LoopQueue() {
		this(10);
	}
	public LoopQueue(int initialSize) {
		if(initialSize>=0){
			this.maxSize=initialSize;
			rear=front=0;
			data=new Object[initialSize];
		}else{
			throw new RuntimeException("��ʼ����С����С��0��" + initialSize);
		}
	}
	public boolean isEmpty(){
		return size==0;
	}
	public boolean add(E e){
		if(size==maxSize){
			throw new RuntimeException("�����������޷������µ�Ԫ��!");
		}else{
			data[rear]=e;
			rear=(rear+1)%maxSize;
			size++;
			return true;
		}
	}
	public E peek(){
		if(isEmpty()){
			throw new RuntimeException("�ն����쳣��");
		}else{
			return (E)data[front];
		}
	}
	public E poll(){
		if(isEmpty()){
			throw new RuntimeException("�ն����쳣��");
		}else{
			E value=(E) data[front];
			data[front]=null;
			front=(front+1)%maxSize;
			size--;
			return value;
		}
	}
	public int length(){
		return size;
	}
	public void clear(){
		Arrays.fill(data, null);
		size=front=rear=0;
	}

}
