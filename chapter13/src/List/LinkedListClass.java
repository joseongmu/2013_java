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
		
		list.add("����");//���ʴ�� ����
		list.add("����");
		list.add(2, "Ű��");//���� �ε����� ����
		list.add(3, "������");
		display(list);
		
		list.set(0, "�ٳ���");//���� �ε����� ������
		list.set(2, "���");//���� �ε����� ������
		display(list);
		
		list.remove(0);//�ε����� ����
		list.remove("������");//������ ã�Ƽ� ����
		display(list);
		
		System.out.println("\n*�˻�*");
		System.out.println("�ε����� 1�� ��: " + list.get(1));
		System.out.println("����� �ε���: " + list.indexOf("���"));
		System.out.println("������ ������ �ε���: " + list.lastIndexOf("����"));
	}
}
