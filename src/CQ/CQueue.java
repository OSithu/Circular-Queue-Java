package CQ;

public class CQueue {
	
	public int []array;
	public int maxSize;
	public int front;
	public int rear;
	public int nItems;
	
	public CQueue(int maxSize) {
		
		this.maxSize = maxSize;
		this.array = new int[maxSize];
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
	
	public void insert(int j) {
		
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
	
	public int remove() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return -99;
			
		}
		else {
			int temp = array[front++];
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
