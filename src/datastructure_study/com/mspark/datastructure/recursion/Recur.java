package datastructure_study.com.mspark.datastructure.recursion;

import datastructure_study.com.mspark.datastructure.stack.IntStack;

public class Recur {

	public static void main(String[] args) {
//		recur(4);
//		System.out.println("@@@@@@@@@@");
//		remove_tail_recur(4);
//		System.out.println("@@@@@@@@@@ recur2");
//		recur2(4);
//		System.out.println("@@@@@@@@@@ non_recur2");
//		non_recur2(4);
		System.out.println("@@@@@@@@@@ recur3");
		recur3(4);
		System.out.println("@@@@@@@@@@ non_recur3");
		non_recur3(4);
		
	}
	
	private static void recur(int n){
		if(n > 0) {
			recur(n-1);
			System.out.println(n);
			recur(n-2);
		}
	}
	
	private static void remove_tail_recur(int n) {
		while(n > 0) {
			recur(n-1);
			System.out.println(n);
			n -= 2;
		}
	}
	
	private static void recur2(int n){
		if(n > 0) {
			recur2(n-2);
			System.out.println(n);
			recur2(n-1);
		}
	}
	
	private static void non_recur2(int n) {
		IntStack stack = new IntStack(n);
		
		while(true) {
			if(n > 1) {
				stack.push(n);
				n -= 2;
				continue;
			}
			
			if(n > 0) {
				stack.push(n);
				n -= 1;
				continue;
			}
			
			if(!stack.isEmpty()) {
				n = stack.pop();
				System.out.println(n);
				n -= 1;
				continue;
			}
			
			break;
		}
	}
	
	private static void recur3(int n) {
		if(n > 0) {
			recur3(n-1);
			recur3(n-2);
			System.out.println(n);
		}
	}
	
	private static void non_recur3(int n) {
		IntStack stack = new IntStack(n);
		
		while(true) {
			if(n > 0) {
				stack.push(n);
				n -= 1;
				continue;
			}
			
			if(n > 1) {
				stack.push(n);
				n -= 2;
				continue;
			}

			if(!stack.isEmpty()) {
				n = stack.pop();
				System.out.println(n);
				n -= 1;
				continue;
			}
			
			break;
		}
		
	}
	
	/**
	 * recur2 하향식 분석 
	 * n = 4
	 *                                     2 "4" 3
	 * 						0 "2" 1						1 "3" 2
	 * 				-				-1 "1" 0		-1 "1" 0	0 "2" 1
	 * 																	-1 "1" 0
	 *  -> 21413121
	 *  
	 *  recur2 상향식 분석
	 *  recur2(1) -> recur2(-1) 1 recur2(0) : 1
	 *  recur2(2) -> recur2(0) 2 recur2(1) : 21
	 *  recur2(3) -> recur2(1) 3 recur2(2) : 1321
	 *  recur2(4) -> recur2(2) 4 recur2(3) : 2141321
	 */

}
