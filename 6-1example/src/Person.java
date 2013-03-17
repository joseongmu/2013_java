
public class Person extends Animal {
		String name;
	Person(int legs,String name) {
		super(legs);
		// TODO Auto-generated constructor stub
		this.legs = legs;
		this.name = name;
	}
	@Override
	void behavior() {
		// TODO Auto-generated method stub
		System.out.println(name+":"+ legs +" ¹ß·Î °È´Â´Ù.");
	}
	

}
