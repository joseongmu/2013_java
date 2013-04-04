package kr.ac.mju.dislab.car;

public class CarTestDriver {

	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();

		car1.setName("car1");
		car2.setName("car2");
		car3.setName("car3");

		car1.goEast(3);
		car2.goWest(6);
		car3.goSouth(2);
		car1.goNorth(5);
		car2.goSouth(3);
		car3.goWest(2);
		car2.goEast(11);

		System.out.println(car1.getInformation() + " Distance: "
				+ car1.getTotalMovingDistance());
		System.out.println(car2.getInformation() + " Distance: "
				+ car2.getTotalMovingDistance());
		System.out.println(car3.getInformation() + " Distance: "
				+ car3.getTotalMovingDistance());
	}

}
