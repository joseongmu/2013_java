import java.util.HashSet;
import java.util.Iterator;


public class HashSetClass {
	
	public static void main(String args[]){//�ߺ��� �����͸� �������� �ʴ� ���� ���� ū Ư¡
		HashSet<String> set = new HashSet<String>();
		set.add("�ڹ�");
		set.add("īǪġ��");
		set.add("����������");
		set.add("�ڹ�");
		System.out.println("����� �������� �� = " + set.size());
		Iterator<String> iterator = set.iterator();
		
		while (iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		}
	}
}
