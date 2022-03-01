package backjoon;

//น้มุ 10989
import java.util.ArrayList;
import java.util.Scanner;

public class CountingSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] prefixSum = new int[10000];
		int [] result = new int[10001];
		Scanner scn = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();	
		int arraySize = scn.nextInt();
		ArrayList<Integer> array = new ArrayList<Integer>(arraySize);
		
		for(int i = 0; i < arraySize ; i++) {
			int num = scn.nextInt();
			array.add(num);
			prefixSum[num] += 1;
		}
		
		for(int i = 1; i < prefixSum.length; i++) {
			prefixSum[i] += prefixSum[i-1] ;
		}
		
		for(int i = arraySize - 1; i > 0; i --) {
			int value = array.get(i);
			
			int resultIndex = prefixSum[value]--; 
			result[resultIndex] = value;
		}
		
		for(int i = 0; i < result.length; i++) {
			if(result[i] > 0)
				System.out.println(result[i]);
		}
	}

}
