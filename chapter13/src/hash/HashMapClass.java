import java.util.HashMap;


public class HashMapClass {
	public static void main (String args[]){//Ű�� �˻��� ���� ���� ������ �ڷᱸ�� ����
		HashMap<String, Integer> hashtable = new HashMap<String, Integer>();
		hashtable.put("���", new Integer(3000));
		hashtable.put("��", new Integer(5000));
		hashtable.put("������", new Integer(2500));
		hashtable.put("��", new Integer(300));
		hashtable.put("��", new Integer(1000));
		
		Integer num = hashtable.get("��");
		
		System.out.println("Hashtable Ű��: " + hashtable.keySet());
		System.out.println("Hashtable [Ű=����]: " + hashtable.entrySet());
		System.out.println("���� ������? " + num);
	}
}
