package List;
import java.util.ArrayList;

public class ArrayListClass {
	
	public static void display(ArrayList<String> list){
		System.out.println("----------List----------");
		int num = list.size();//����Ʈ�� ���̸� �������ִ� �޼ҵ�
		for (int cnt = 0; cnt < num; cnt++){
			String str = list.get(cnt);
			System.out.println(str);
		}
	}
	
	public static void main(String args[]){
		ArrayList<String> list = new ArrayList<String>();
		
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
