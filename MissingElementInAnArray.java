package week3da2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,};
		int a=1;
		Arrays.sort(arr);
		List<Integer> ecpt = new ArrayList<Integer>();
		List<Integer> ecpt1 = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			 ecpt.add(arr[i]);
			 
		}
		
		for (int i = 0; i < ecpt.size(); i++) {
			if(a!=ecpt.get(i)) {
		ecpt1.add(a);
		i=i-1;
			}
			a++;
		}
		for (Integer missed : ecpt1) {
			System.out.println("Missing Element In AnArray  =   " +missed);
			
		}
		}
		
	}


