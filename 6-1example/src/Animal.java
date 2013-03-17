public abstract class Animal {
	int legs ;
	String name;
	String like;
	String hobby;
	
	Animal(int legs)
	{
		 this.legs = legs;
	}
	abstract void behavior();
	
}
