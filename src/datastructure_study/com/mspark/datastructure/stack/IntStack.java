package datastructure_study.com.mspark.datastructure.stack;

public class IntStack {
	int max;
	int ptr;
	int[] stk;
	
	public class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException(){};
	}
	
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException(){}
	}
	
	public IntStack(int capacity){
		this.max = capacity;
		ptr = 0;
		stk = new int[capacity];
	}
	
	public void push(int x) throws OverflowIntStackException {
		if(ptr >= max) {
			throw new OverflowIntStackException();
		}
		
		stk[ptr++] = x;
	}
	
	public int pop() throws EmptyIntStackException {
		if(ptr <= 0) {
			throw new EmptyIntStackException();
		}
		
		return stk[--ptr];
	}
	
	public int peek() throws EmptyIntStackException {
		if(ptr <= 0) {
			throw new EmptyIntStackException();
		}
		
		return stk[ptr -1];
	}
	
	public int indexOf(int x) {
		for(int i = ptr; i > -1; i--) {
			if(stk[i] == x) return i;
		}
		
		return -1;
	}
	
	public void clear() {
		ptr = 0;
	}
	
	public int capacity() {
		return stk.length;
	}
	
	public int size() {
		return ptr;
	}
	
	public boolean isEmpty() {
		return ptr <= 0;
	}
	
	public boolean isFull() {
		return ptr >= max;
	}
	
	public void dump() {
		if(ptr <= 0) {
			System.out.println("Empty Stack");
		}else {
			for(int i = 0; i < ptr ; i++) {
				System.out.print(stk[i] + " ");
				System.out.println();
			}
		}
	}
}
