import java.util.HashMap;


public class HashMapClass {
	public static void main (String args[]){//키로 검색과 삭제 등이 가능한 자료구조 형태
		HashMap<String, Integer> hashtable = new HashMap<String, Integer>();
		hashtable.put("사과", new Integer(3000));
		hashtable.put("배", new Integer(5000));
		hashtable.put("복숭아", new Integer(2500));
		hashtable.put("귤", new Integer(300));
		hashtable.put("감", new Integer(1000));
		
		Integer num = hashtable.get("배");
		
		System.out.println("Hashtable 키값: " + hashtable.keySet());
		System.out.println("Hashtable [키=가격]: " + hashtable.entrySet());
		System.out.println("배의 가격은? " + num);
	}
}
