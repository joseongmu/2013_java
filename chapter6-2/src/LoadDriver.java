

public class LoadDriver {
	public static void main(String args[])
	{
		SeparateVolume obj = new SeparateVolume("863b", "�����" , " ������ �丮");
		PrintState(obj);
		obj.checkOut("ȫ�浿","60092385");
		PrintState(obj);
		obj.checkIn();
		PrintState(obj);

	}

	 static void PrintState(SeparateVolume obj)
	{
		if(obj.state == obj.STATE_NORMAL)
		{   System.out.println("---------------------------");
			System.out.println("������� : ���Ⱑ�� �մϴ�.");
			System.out.println("---------------------------");
		}
		else if(obj.state == obj.STATE_BORROWED)
		{
			System.out.println("---------------------------");
			System.out.println("������� : ������ �Ұ� �մϴ�.");
			System.out.println("---------------------------");
		}
	}


}
