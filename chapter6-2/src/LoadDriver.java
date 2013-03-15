

public class LoadDriver {
	public static void main(String args[])
	{
		SeparateVolume obj = new SeparateVolume("863b", "어린왕자" , " 생텍쥐 페리");
		PrintState(obj);
		obj.checkOut("홍길동","60092385");
		PrintState(obj);
		obj.checkIn();
		PrintState(obj);

	}

	 static void PrintState(SeparateVolume obj)
	{
		if(obj.state == obj.STATE_NORMAL)
		{   System.out.println("---------------------------");
			System.out.println("대출상태 : 대출가능 합니다.");
			System.out.println("---------------------------");
		}
		else if(obj.state == obj.STATE_BORROWED)
		{
			System.out.println("---------------------------");
			System.out.println("대출상태 : 대출이 불가 합니다.");
			System.out.println("---------------------------");
		}
	}


}
