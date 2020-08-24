package datastructure_study.com.mspark.datastructure.recursion;

public class Recur {

	public static void main(String[] args) {
		recur(4);
		System.out.println("@@@@@@@@@@");
		remove_tail_recur(4);
		System.out.println("@@@@@@@@@@");
		recur2(4);
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
