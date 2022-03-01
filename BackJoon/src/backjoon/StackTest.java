package backjoon;

import java.util.ArrayList;
import java.util.Scanner;

//백준 10828
class MyStack{
	
	private ArrayList<Integer> arrayStack = new ArrayList<Integer>();
	
	public void push(int data) {
		arrayStack.add(data);
	}
	public int pop() {
		
		if(arrayStack.size() == 0) { //없으면 underflow error
			return -1;
		}
		else
			return arrayStack.remove(arrayStack.size()-1);
	}
	
	public int top() {
		if(arrayStack.size() == 0) { //없으면 underflow error
			return -1;
		}
		else
			return arrayStack.get(arrayStack.size()-1);
	}
	public int empty() {
		if(arrayStack.size() == 0) {
			return 1;
		}
		else
			return 0;
	}
	public int size() {
		return arrayStack.size();
	}
}

public class StackTest {
	
	
	public static void main(String[] args) {
		
		MyStack stack = new MyStack();
		
		Scanner in = new Scanner(System.in);
		
		int orderSize = in.nextInt();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < orderSize; i++) {
			String str = in.next();
			 
			switch (str) {
            
			case "push":
				stack.push(in.nextInt());
				break;
                
			case "pop":
				sb.append(stack.pop()).append('\n');
				break;
                
			case "size":
				sb.append(stack.size()).append('\n');
				break;
                
			case "empty":
				sb.append(stack.empty()).append('\n');
				break;
                
			case "top":
				sb.append(stack.top()).append('\n');
				break;
			}
			
		}
		System.out.println(sb);
	}
}
