package datastructure_study.com.mspark.datastructure.recursion;

public class Hanoi {

	public static void main(String[] args) {
		move(3, 1, 3);
	}
	
	private static void move(int n , int x, int y) {
		
		if(n > 1) {
			//맨 밑에 한개를 제외한 모두를 가운데로 옮긴다
			move(n-1, x, 6-x-y);
		}
		
		System.out.println(n + " 번째 원반을 " + x + " 에서  " +y +"로 옮김");
		
		if(n > 1) {
			//맨 밑에 한개를 제외한 모두를 가운데 에서 맨 뒤로 옮긴다
			move(n-1, 6-x-y, y);
		}
	}
	/**
	 * 								3 1 3
	 * 							2 1 2    2 2 3
	 * 				1 1 3 	1 3 2		1 2 1 	1 1 3	
	 * 					  
	 * 
	 * 
	 */
	
	
}
