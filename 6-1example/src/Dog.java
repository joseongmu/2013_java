
public class Dog extends Animal {
		
	Dog(int legs, String name,String like,String hobby)
	{
		super(legs);
		this.name = name;
		this.like = like;
		this.hobby = hobby;
	}
	void behavior()
	{
		System.out.println(name + " : " + legs +" �߷� �ȴ´�");
		System.out.println("�����ϴ°� : "+ like);
		System.out.println("��� : " + hobby);
	}

}
