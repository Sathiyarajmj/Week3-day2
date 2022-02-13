package week3da2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = { 3, 2, 11, 4, 6, 7 };
		Set<Integer> result = new TreeSet<Integer>();
		for (int i = 0; i < data.length; i++) {
			result.add(data[i]);
		}
		List<Integer> ecpt = new ArrayList<Integer>(result);
		System.out.println(ecpt.get(1));
	}

}
