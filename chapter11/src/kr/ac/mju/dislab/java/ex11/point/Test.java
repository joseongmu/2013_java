package kr.ac.mju.dislab.java.ex11.point;


public class Test {
	public static void main(String args[]) {
		Point[] point = new Point[5];
		ClonedPoint clonedPoint = new ClonedPoint();
		
		int[] array1 = {1,2};
		int[] array2 = {1,2};
		int[] array3 = {1,2,3};
		int[] array4 = {7,4,5};
		int[] array5 = {1,2,3,4};
		
		point[0] = new Point(2, array1);
		point[1] = new Point(2, array2);
		point[2] = new Point(3, array3);
		point[3] = new Point(3, array4);
		point[4] = new Point(4, array5);
		
		System.out.println(point[0].toString());
		System.out.println("point[0] dim : " + point[0].getDim());
		System.out.println("point[0] 1st axis value : " + point[0].getValues()[0]);
		System.out.println("point[3]과 point[2]사이의 거리는? " + point[0].measureDistance(point[3], point[2]));
		
		System.out.print("deepClone으로 (1,2)를 (1,2)만큼 이동시키면?");
		clonedPoint.moveDeepClonePoint(point[0], point[1].getValues()).showValues();
		System.out.print("원본 포인터는?");
		point[0].showValues();
		
		System.out.print("shallowClone (1,2)를 (1,2)만큼 이동시키면?");
		clonedPoint.moveShallowClonePoint(point[0], point[1].getValues()).showValues();
		System.out.print("원본 포인터는?");
		point[0].showValues();
		
		System.out.println("\ndeepClone Point 원래 포인터가 같은 좌표인가?"
							+ point[0].equals(clonedPoint.deepClone(point[0])));
		System.out.println("deepClone Point 원래 포인터가 같은 객체인가?"
							+ (point[0] == clonedPoint.deepClone(point[0])));
		
		System.out.println("shallowClone Point 원래 포인터가 같은 좌표인가?"
							+ point[0].equals(clonedPoint.shallowClone(point[0])));
		System.out.println("shallowClone Point 원래 포인터가 같은 객체인가?"
							+ (point[0] == clonedPoint.shallowClone(point[0])));
	}
}
