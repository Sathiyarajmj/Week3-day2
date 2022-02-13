package week3da2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		int[] a = { 3, 2, 11, 4, 6, 7 };
		int[] b = { 1, 2, 8, 4, 9, 7 };
		List<Integer> result = new ArrayList<>();

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					result.add(a[i]);
				}
			}

		}
		for (Integer lastresult : result) {
			System.out.println(lastresult);

		}
	}

}
