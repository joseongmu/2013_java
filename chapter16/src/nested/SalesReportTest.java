package nested;

public class SalesReportTest {

	public static void main(String[] args) {

		SalesReport sr = new SalesReport(2006, 1);
		sr.addRecord("TV", 121, 175250000);
		sr.addRecord("��Ź��", 38, 20135000);
		sr.addRecord("�����", 25, 17750000);

		System.out.println("\t\t" + "�б⺰ ��������");
		System.out.println(" \t\t\t    " + sr.year + "�� " + sr.quarter + "/4�б�\n");
		System.out.println("��ǰ����\t\t�Ǹż���\t\t  �Ǹž�");
		System.out.println("_________________________________________");
		
		for (int i = 0; i < sr.list.size(); i++) {
			String name = sr.list.get(i).name;
			int num = sr.list.get(i).num;
			int amount = sr.list.get(i).amount;
			System.out.println(name + "\t\t" + num + " \t\t" + amount);
		}
		
		System.out.println("-----------------------------------------");
		System.out.println("���հ�" + "\t\t\t\t" + sr.getTotal());
	}
}
