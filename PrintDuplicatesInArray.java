package week3da2;

import java.util.ArrayList;
import java.util.List;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		List<Integer> one = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					one.add(arr[i]);

				}
			}

		}
		System.out.println("--Duplicates of array values is--");
		for (Integer value : one) {
			System.out.println(value);
		}
	}

}
