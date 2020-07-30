package datastructure_study.com.mspark.datastructure.numbertransformation;

import java.util.Arrays;

public class CardConversion {

	public static void main(String[] args) {
		conversionCard(10, 4);
	}

	private static void conversionCard(int num, int r) {
		final String baseString = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		char[] charArr = new char[32];
		
		int mok = num;
		int index = 0;
		while (mok != 0) {
			charArr[index] = baseString.charAt(mok%r);
			mok /= r;
			index ++;
		}
		
		char[] resanableArr = Arrays.copyOfRange(charArr, 0, index);
		
		int leng = resanableArr.length;
		for(int i = 0 ; i < leng/2; i++) {
			char temp = '0';
			temp = resanableArr[i];
			resanableArr[i] = resanableArr[leng-1-i];
			resanableArr[leng-1-i] = temp;
		}
		
		System.out.println(String.valueOf(resanableArr));
		
	}
}
