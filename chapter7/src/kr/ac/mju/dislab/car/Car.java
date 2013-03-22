package kr.ac.mju.dislab.car;

public class Car {
	String name;
	int x = 0, y = 0;
	int total;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void goEast(int a) {
		x += a;
		total += a;
	}

	public void goWest(int a) {
		x -= a;
		total += a;
	}

	public void goNorth(int b) {
		y += b;
		total += b;
	}

	public void goSouth(int b) {
		y -= b;
		total += b;
	}

	public String getInformation() {
		return name + " (" + x + "," + y + ")";
	}

	public int getTotalMovingDistance() {
		return total;
	}
}
