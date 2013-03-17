
public class Baby extends Person {
		
	Baby(int legs, String name,String like,String hobby) {
		super(legs, name);
		this.like = like;
		this.hobby = hobby ;
	}
	void behavior(){
		System.out.println(name + ":" +legs+" 발로 기어 다닌다.");
		System.out.println("좋아하는 것 : " + like);
		System.out.println("취미  : " + hobby);
	}
	

}
