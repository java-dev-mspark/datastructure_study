package datastructure_study.com.mspark.datastructure.queue;

public class IntArrayQueue {

	private int max;
	private int num;
	private int[] q;
	
	IntArrayQueue(int capacity){
		max = capacity;
		num = 0;
		q = new int[capacity];
	}
	
	public void offer(int x) {
		if(num >= max) {
			// throw new CapacityOverflow
		}
		q[num++] = x;
	}
	
	public int poll() {
		if(num <= 0) {
			// throw new EmptyQueue
		}
		int rtnVal = q[0];
		
		if(num > 1) {
			for(int i = 1 ; i < num ; i++) {
				q[i-1] = q[i];
			}
		}
		num--;
		
		return rtnVal;
	}
	
	public int peek() {
		if(num == 0) {
			// throw new EmptyQueue
		}
		
		return q[0];
	}
	
	public boolean isEmpty() {
		return num == 0;
	}
}
