package datastructure_study.com.mspark.datastructure.queue;

public class Gqueue<E> {

	private int max;
	private int front;
	private int rear;
	private int num;
	private E[] que;
	
	public Gqueue(E[] que) {
		max = que.length;
		front = rear = num = 0;
		this.que = que;
	}
	
	public void enque(E e) {
		if(num >= max) {
			throw new RuntimeException("OverflowGqueue");
		}

		que[rear++] = e;
		num++;
		
		if(num == max) {
			rear = 0;
		}
	}
	
	public E deque() {
		if(num <=0) {
			throw new RuntimeException("EmptyQueue");
		}
		
		E e = que[front++];
		num--;
		
		if(front == max) {
			front = 0;
		}
		
		return e;
	}
	
	public E peek() {
		if(num <= 0) {
			throw new RuntimeException("EmptyQueue");
		}
		
		E e = que[front];
		
		return e;
	}
	
	
	public int size() {
		return num;
	}
	
}
