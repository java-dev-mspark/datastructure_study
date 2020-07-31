package datastructure_study.com.mspark.datastructure.searching;

import java.util.Arrays;

public class BinarySearching {

	
	public static void main(String[] args) {
		System.out.println(doBinSearch(new int[] {1, 2, 4, 6, 9, 7, 11, 10}, 3));
	}
	
	private static boolean doBinSearch(int[] arr , int target) {
	
		Arrays.sort(arr);
		
		int half = arr.length/2;
		int pos = half;
		
		while(half != 0) {
			int val = arr[pos];
			if(val == target) return true;
			
			half /= 2;
			
			if(val > target) {
				pos = half;
			}else {
				pos += half;
			}
		}
		
		
		return false;
	}
}
