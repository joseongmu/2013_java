package Dog;

public class Dog {
	String name;
	String bowwow;
	String food;

	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.name = "Bart";
		dog1.food = "Meat";
		dog1.bowwow = "����!!";

		Dog[] myDogs = new Dog[3];

		myDogs[0] = new Dog();
		myDogs[1] = new Dog();
		myDogs[2] = dog1;

		myDogs[0].name = "Fred";
		myDogs[0].food = "Chicken";
		myDogs[0].bowwow = "�۸�!!";

		myDogs[1].name = "Marge";
		myDogs[1].food = "Pork";
		myDogs[1].bowwow = "�п�!!";

		int x = 0;
		while (x < myDogs.length) {
			myDogs[x].bark();
			myDogs[x].eat();
			x = x + 1;
			System.out.println();
		}
	}

	public void bark() {
		System.out.println(name + "��(��) " + bowwow + "�ϰ� ¢���ϴ�");
	}

	public void eat() {
		System.out.println(name + "��(��) " + food + "��(��) �Խ��ϴ�.");
	}
}
