package chapter09;

import java.util.Arrays;

public class Ex9_10 {
		public static void main(String[] args) {
		 int[] arr = {1,2,3,4};
		 int[] arrclone = arr.clone();
		 arrclone[0] = 6;
		 
		 System.out.println(Arrays.toString(arr));
		 System.out.println(Arrays.toString(arrclone));
			}
	}


