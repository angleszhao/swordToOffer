package stacks;

public class Stack<E> {
	private Object[] data=null;
	private int maxSize=0;
	private int top=-1;

	Stack() {
		this(10);//Ĭ��ջ��С
	}
	Stack(int initialSize){
		if(initialSize>=0){
			this.maxSize=initialSize;
			data=new Object[initialSize];
			top=-1;
		}else{
			throw new RuntimeException("��ʼ����С����С��0��"+initialSize);
		}
	}
	public boolean isEmpty(){
		return top==-1;
	}
	public boolean push(E e){
		if(top == maxSize-1){
			throw new RuntimeException("ջ�������޷�����Ԫ����ջ");
		}else{
			data[++top]=e;
			return true;
		}
	}
	public E pop(){
		if(top==-1){
			throw new RuntimeException("ջΪ��");
		}else{
			return (E)data[top--];
		}
	}
	 //�鿴ջ��Ԫ�ص����Ƴ�
    public E peek(){
        if(top == -1){
            throw new RuntimeException("ջΪ�գ�");
        }else{
            return (E)data[top];
        }
    }
	public int search(E e){
		int i=top;
		while(top!=-1){
			if(peek()!=e)
				top--;
			else
				break;
		}
		int result=top+1;
		top=i;
		return result;
	}
}
