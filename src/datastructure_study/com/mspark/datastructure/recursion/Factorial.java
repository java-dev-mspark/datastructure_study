package datastructure_study.com.mspark.datastructure.recursion;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(doFactorial(3));
	}
	
	private static int doFactorial(int n) {
		
		if(n >= 1) {
			return n * doFactorial(n-1);
		}else {
			return 1;
		}
		
	}
}
