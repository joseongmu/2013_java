
public class Adult extends Person {
		String job;
	Adult(int legs,String name,String like,String hobby,String job)
	{
		super(legs, name);
		this.legs= legs;
		this.name = name;
		this.like = like;
		this.hobby = hobby;
		this.job = job;
	}

	@Override
	void behavior() {
		// TODO Auto-generated method stub
		System.out.println(name + " :"+ legs +" �߷� �ȴ´�.");
		System.out.println("�����ϴ°� : " + like);
		System.out.println("��� : " + hobby);
		System.out.println("���� : " + job);
	}


	
	

}
