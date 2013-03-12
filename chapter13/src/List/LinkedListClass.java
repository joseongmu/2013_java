package List;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListClass {
	
	public static void display(LinkedList<String> list){
		System.out.println("----------List----------");
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
	
	public static void main(String args[]){
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("포도");//차례대로 삽입
		list.add("딸기");
		list.add(2, "키위");//지정 인덱스에 삽입
		list.add(3, "복숭아");
		display(list);
		
		list.set(0, "바나나");//지정 인덱스의 값수정
		list.set(2, "멜론");//지정 인덱스의 값수정
		display(list);
		
		list.remove(0);//인덱스로 삭제
		list.remove("복숭아");//값으로 찾아서 삭제
		display(list);
		
		System.out.println("\n*검색*");
		System.out.println("인덱스가 1인 값: " + list.get(1));
		System.out.println("멜론의 인덱스: " + list.indexOf("멜론"));
		System.out.println("딸기의 마지막 인덱스: " + list.lastIndexOf("딸기"));
	}
}
