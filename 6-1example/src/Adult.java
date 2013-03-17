
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
		System.out.println(name + " :"+ legs +" 발로 걷는다.");
		System.out.println("좋아하는것 : " + like);
		System.out.println("취미 : " + hobby);
		System.out.println("직업 : " + job);
	}


	
	

}
