package inner;

public class ChickenFarm {
	/*
	public static void main(String args[]){
		Animal cock =new Animal() {
			void say() {
				System.out.println("꼬끼오");
			}
		};
		cock.say();
	}
	*위와 같은 익명 클래스를 로컬 이너 클래스로 바꾸는 방법
	*/
	
	public static void main(String args[]){
		
		class Cock {
			Cock(){}
			void say(){
				System.out.println("꼬끼오");
			}
		}
		
		Cock cock = new Cock();
		cock.say();
	}
}
