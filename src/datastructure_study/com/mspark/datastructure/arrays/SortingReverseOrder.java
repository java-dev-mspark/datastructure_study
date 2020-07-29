package datastructure_study.com.mspark.datastructure.arrays;

public class SortingReverseOrder {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] reverseArr = sortingReverseOrder(arr);
		
		for(int i : reverseArr) {
			System.out.println(i);
		}
		
	}
	
	private static int[] sortingReverseOrder(int[] arr) {
		int[] cloneArr = arr.clone();
		int length = cloneArr.length;
		
		for(int i = 0 ; i < length/2 ; i ++) {
			int temp = 0;
			
			temp = cloneArr[i];
			cloneArr[i] = cloneArr[length-1-i];
			cloneArr[length-1-i] = temp;
			
		}
		return cloneArr;
	}
}
