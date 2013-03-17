
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
		System.out.println(name + " : " + legs +" 발로 걷는다");
		System.out.println("좋아하는것 : "+ like);
		System.out.println("취미 : " + hobby);
	}

}
