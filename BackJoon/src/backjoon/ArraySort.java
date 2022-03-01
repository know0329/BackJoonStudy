package backjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// น้มุ 2751น๘
public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();	
		int arraySize = scn.nextInt();
		ArrayList<Integer> array = new ArrayList<Integer>(arraySize);
		for(int i = 0; i < arraySize ; i++) {
			int num = scn.nextInt();
			array.add(num);
			
		}
		Collections.sort(array);
		for(int i = 0; i < arraySize ; i++) {
			sb.append(array.get(i)).append('\n');
			
		}
		System.out.println(sb);
	}

}
