package inner;

public class ChickenFarm {
	/*
	public static void main(String args[]){
		Animal cock =new Animal() {
			void say() {
				System.out.println("������");
			}
		};
		cock.say();
	}
	*���� ���� �͸� Ŭ������ ���� �̳� Ŭ������ �ٲٴ� ���
	*/
	
	public static void main(String args[]){
		
		class Cock {
			Cock(){}
			void say(){
				System.out.println("������");
			}
		}
		
		Cock cock = new Cock();
		cock.say();
	}
}
