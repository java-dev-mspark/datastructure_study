package datastructure_study.com.mspark.datastructure.recursion;

public class Euclid {

	
	public static void main(String[] args) {
		System.out.println(gcp(6, 9));
	}
	
	private static int gcp (int x, int y) {
		if(y == 0) {
			return x;
		}else {
			return gcp(y, x%y);
		}
	}
}
