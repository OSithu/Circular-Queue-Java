package CQ;


public class LinearQueue {
	
	public int []array;
	public int maxSize;
	public int front;
	public int rear;
	public int nItems;
	
	public LinearQueue(int maxSize) {
		
		this.maxSize = maxSize;
		this.array = new int[maxSize];
		this.front = 0;
		this.rear = -1;
		this.nItems = 0;
	}
	
	public boolean isFull() {
		return rear == maxSize-1;
	}
	
	public boolean isEmpty() {
		return nItems == 0;
	}
	
	public void insert(int j) {
		
		if(isFull()) {
		
			System.out.println("Queue is Full");
			
		}
		
		else {
			array[++rear] = j;
			nItems++;
		}
			
	}
	
	public int remove() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return -99;
			
		}
		else {
			
			nItems--;
			return array[front++];	
			
		}
	}
	
	public int peekFront() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return -99;
			
		}
		else {
			
			nItems--;
			return array[front];	
			
		}
	}
	
	
	

}
