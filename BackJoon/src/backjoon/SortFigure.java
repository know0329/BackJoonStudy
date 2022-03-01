package backjoon;


import java.util.Scanner;

//น้มุ 2750น๘
	
public class SortFigure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scn = new Scanner(System.in);
		
		int arraySize = scn.nextInt();
		int figureList[] = new int[arraySize];
		for(int i = 0; i < arraySize; i++) {
			figureList[i] = scn.nextInt();
		}
		
		for(int i = 0; i < arraySize; i++) {
			for(int j = i+1; j < arraySize; j++) {
				if(figureList[i] > figureList[j]) {
					int temp = figureList[i];
					figureList[i] = figureList[j];
					figureList[j] = temp;
				}
				
			}
		}
		
		for(int i = 0 ; i < arraySize; i++) {
			System.out.println(figureList[i]);
		}
	}

}
