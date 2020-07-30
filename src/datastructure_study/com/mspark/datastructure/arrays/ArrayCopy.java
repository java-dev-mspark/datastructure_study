package datastructure_study.com.mspark.datastructure.arrays;

public class ArrayCopy {

	private void copy(int[] source, int[] target) {
		if(source.length != target.length) {
			return;
		}
		
		for(int i = 0 ; i < source.length ; i++) {
			target[i] = source[i];
		}
	}
	
	private void rcopy(int[] source, int[] target) {
		if(source.length != target.length) {
			return;
		}
		int[] reversedSource = reverseOrder(source);
		
		copy(reversedSource, target);
	}
	
	private int[] reverseOrder(int[] arr) {
		int length = arr.length;
		
		for(int i = 0; i < length/2 ; i++) {
			int temp = 0;
			temp = arr[i];
			arr[i] = arr[length-1-i];
			arr[length-1-i] = temp;
		}
		
		return arr;
	}
}
