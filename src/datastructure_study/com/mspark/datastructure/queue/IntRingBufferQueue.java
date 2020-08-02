package datastructure_study.com.mspark.datastructure.queue;

public class IntRingBufferQueue {

	private int max;
	private int front;
	private int rear;
	private int num;
	private int[] que;
	
	public class EmptyIntQueueException extends RuntimeException{
		public EmptyIntQueueException(){}
	}
	
	public class OverflowuIntQueueException extends RuntimeException{
		public OverflowuIntQueueException(){}
	}
	
	public IntRingBufferQueue(int capacity) {
		max = capacity;
		front = rear = num = 0;
		que = new int[capacity];
	}
	
	public int enque(int x ) throws OverflowuIntQueueException{
		if(num >= max) {
			throw new OverflowuIntQueueException();
		}
		
		que[rear++] = x;
		num++;
		
		if(rear == max) {
			rear = 0;
		}
		return x;
	}
	
	public int deque() throws EmptyIntQueueException {
		if(num <= 0) {
			throw new EmptyIntQueueException();
		}
		int val = que[front++];
		num--;
		if(front == max) {
			front = 0;
		}
		return val;
	}
	
	public int peek() throws EmptyIntQueueException {
		if(num <= 0) {
			throw new EmptyIntQueueException();
		}
		
		return que[front];
	}
	
	public int indexOf(int x) {
	
		for(int i = 0; i < num ; i ++) {
			int idx = (i + front) % max;
			if(que[idx] == x) {
				return idx;
			}
		}
		return -1;
	}
	
	public void clear() {
		front = rear = num = 0;
	}
	
	public int capacity() {
		return max;
	}
	
	public int size() {
		return num;
	}
	
	public boolean isEmpty() {
		return num <= 0;
	}
	
	public boolean isFull() {
		return num >= max;
	}
}
