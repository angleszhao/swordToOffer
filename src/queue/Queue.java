package queue;

import java.util.Arrays;

public class Queue<E> {
	public Object[] data=null;
	private int maxSize;
	private int rear;//����β
	private int front;//����ͷ
	private int size=0;

	public Queue() {
		this(10);
	}
	public Queue(int initialSize){
		if(initialSize>=0){
			this.maxSize=initialSize;
			data=new Object[initialSize];
			front=rear=0;
		}else{
			throw new RuntimeException("��ʼ����С����С��0��" + initialSize);
		}
	}
	public boolean isEmpty(){
		return size==0;
	}
	public boolean add(E e){
		if(size==maxSize)
			throw new RuntimeException("�����������޷������µ�Ԫ��");
		else{
			data[rear]=e;
			rear=(rear+1)%maxSize;
			size++;
			return true;
		}
	}
	
	public E peek(){
		if(isEmpty()){
			throw new RuntimeException("�ն����쳣");
		}else{
			return (E)data[front];
		}
	}
	public E poll(){
		if(isEmpty()){
			throw new RuntimeException("�ն����쳣");
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
		size=0;front=0;rear=0;
	}

}
