package Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueClass {
	
	public static void display(Queue<String> Queue){
		System.out.println("----------Queue----------");
		Iterator<String> iterator = Queue.iterator();
		while(iterator.hasNext()){
			String str = iterator.next();
			System.out.println(str);
		}
	}
	
	public static void main(String args[]){
		Queue<String> queue = new LinkedList<String>();
		
		queue.add("포도");//첫번째 인덱스부터 차례대로 삽입
		queue.add("딸기");
		queue.add("키위");
		queue.add("복숭아");
		display(queue);
		
		queue.poll();//첫번째 인덱스의 값을 리턴하고 삭제
		display(queue);
		
		System.out.println("\n*검색*");
		System.out.println("큐의 첫번째 값: " + queue.peek());
	}
}
