package Stack;

import java.util.Iterator;
import java.util.Stack;

public class StackClass {
	
	public static void display(Stack<String> stack){
		System.out.println("----------Stack----------");
		Iterator<String> iterator = stack.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
	
	public static void main(String args[]){
		Stack<String> stack = new Stack<String>();
		
		stack.push("포도");//마지막 인덱스에 차례대로 삽입
		stack.push("딸기");
		stack.push("키위");
		stack.push("복숭아");
		display(stack);
		
		stack.set(0, "바나나");//지정 인덱스의 값수정
		stack.set(2, "멜론");
		display(stack);
		
		stack.pop();//마지막 인덱스의 값을 리턴하고 삭제
		stack.pop();
		display(stack);
		
		System.out.println("\n*검색*");
		System.out.println("마지막 인덱스의 값: " + stack.peek());
		System.out.println("인덱스가 1인 값: " + stack.get(1));
		System.out.println("바나나의 인덱스: " + stack.indexOf("바나나"));
		System.out.println("딸기의 마지막 인덱스: " + stack.lastIndexOf("딸기"));
	}
}
