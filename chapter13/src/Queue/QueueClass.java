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
		
		queue.add("����");//ù��° �ε������� ���ʴ�� ����
		queue.add("����");
		queue.add("Ű��");
		queue.add("������");
		display(queue);
		
		queue.poll();//ù��° �ε����� ���� �����ϰ� ����
		display(queue);
		
		System.out.println("\n*�˻�*");
		System.out.println("ť�� ù��° ��: " + queue.peek());
	}
}
