package test2;

public class Queue {
	
	public char []array;
	public int maxSize;
	public int front;
	public int rear;
	public int nItems;
	
	public Queue(int maxSize) {
		
		this.maxSize = maxSize;
		this.array = new char[maxSize];
		this.front = 0;
		this.rear = -1;
		this.nItems = 0;
	}
	
	public boolean isFull() {
		return nItems == maxSize;
	}
	
	public boolean isEmpty() {
		return nItems == 0;
	}
	
	public void insert(char j) {
		
		if(isFull()) {
		
			System.out.println("Stack is Full");
			
		}
		
		else {
			if(rear == maxSize-1) {
				rear = -1;
			}
			
			array[++rear] = j;
			nItems++;
		}
			
	}
	
	public char remove() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return 0;
			
		}
		else {
			char temp = array[front++];
			if(front ==maxSize) {
				front =0;
			}
			
			nItems--;
			return temp;	
			
		}
	}
	
	public int peekFront() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return -99;
			
		}
		else {
			int temp = array[front];
//			if(front ==maxSize) {
//				front =0;
//			}

			return temp;	
			
		}
	}
	
	
	

}
