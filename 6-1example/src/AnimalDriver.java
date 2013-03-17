
public class AnimalDriver {
	public static void main (String args[])
	{	
		Person person = new Person(2,"사람");
		person.behavior();
		System.out.println();
		
		Adult adult = new Adult(2,"성인","돈","술타령","선생님");
		adult.behavior();
		System.out.println();
		
		Baby baby  = new Baby(4,"갓난아기"," 장난감"," 낮잠");
		baby.behavior();
		System.out.println();
		
		Dog dog = new Dog(4,"강아지","뼈다귀","산책");
		dog.behavior();
	}

}
