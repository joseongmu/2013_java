
public class Baby extends Person {
		
	Baby(int legs, String name,String like,String hobby) {
		super(legs, name);
		this.like = like;
		this.hobby = hobby ;
	}
	void behavior(){
		System.out.println(name + ":" +legs+" �߷� ��� �ٴѴ�.");
		System.out.println("�����ϴ� �� : " + like);
		System.out.println("���  : " + hobby);
	}
	

}
