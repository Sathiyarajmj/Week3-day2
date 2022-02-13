package week3da2;

import java.util.ArrayList;
import java.util.List;

public class RemoveStringDuplicates {

	public static void main(String[] args) {
		String input = "We learn java basics as part of java sessions in java week1";
		int Count = 0;
		String[] split = input.split(" ");
		List<String> list = new ArrayList<>();
		for (int i = 0; i < split.length; i++) {
			list.add(split[i]);

		}
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).equals(list.get(j))) {
					Count = Count + 1;
					list.remove(i);
				}

			}

		}
		for (String string : list) {
			System.out.println(string);

		}
		System.out.println("Total no count of duplicates =" + Count);
	}

}
