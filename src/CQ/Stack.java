package CQ;

public class Stack {
	
	public char[]array;
	public int maxSize;
	public int top;
	
	public Stack(int maxSize) {
		this.maxSize = maxSize;
		this.array = new char[maxSize];
		this.top = -1;
	}
	
	public boolean isFull() {
		return top == maxSize-1;
	}	
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public void push(char j) {
		if(isFull()) {
			System.out.println("Stack is Full");
		}
		else {
			array[++top] = j;	
		}
		
	}
	
	public char pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return 0;
		}
		else {
			return array[top--];
		}
		
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return -99;
		}
		else {
			return array[top];
		}
	}
	
	
	
	

}
