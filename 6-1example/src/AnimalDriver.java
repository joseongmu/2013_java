
public class AnimalDriver {
	public static void main (String args[])
	{	
		Person person = new Person(2,"���");
		person.behavior();
		System.out.println();
		
		Adult adult = new Adult(2,"����","��","��Ÿ��","������");
		adult.behavior();
		System.out.println();
		
		Baby baby  = new Baby(4,"�����Ʊ�"," �峭��"," ����");
		baby.behavior();
		System.out.println();
		
		Dog dog = new Dog(4,"������","���ٱ�","��å");
		dog.behavior();
	}

}
