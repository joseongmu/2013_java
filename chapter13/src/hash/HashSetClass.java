import java.util.HashSet;
import java.util.Iterator;


public class HashSetClass {
	
	public static void main(String args[]){//중복된 데이터를 저장하지 않는 것이 가장 큰 특징
		HashSet<String> set = new HashSet<String>();
		set.add("자바");
		set.add("카푸치노");
		set.add("에스프레소");
		set.add("자바");
		System.out.println("저장된 데이터의 수 = " + set.size());
		Iterator<String> iterator = set.iterator();
		
		while (iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		}
	}
}
