package nested;

public class SalesReportTest {

	public static void main(String[] args) {

		SalesReport sr = new SalesReport(2006, 1);
		sr.addRecord("TV", 121, 175250000);
		sr.addRecord("세탁기", 38, 20135000);
		sr.addRecord("냉장고", 25, 17750000);

		System.out.println("\t\t" + "분기별 영업실적");
		System.out.println(" \t\t\t    " + sr.year + "년 " + sr.quarter + "/4분기\n");
		System.out.println("상품구분\t\t판매수량\t\t  판매액");
		System.out.println("_________________________________________");
		
		for (int i = 0; i < sr.list.size(); i++) {
			String name = sr.list.get(i).name;
			int num = sr.list.get(i).num;
			int amount = sr.list.get(i).amount;
			System.out.println(name + "\t\t" + num + " \t\t" + amount);
		}
		
		System.out.println("-----------------------------------------");
		System.out.println("총합계" + "\t\t\t\t" + sr.getTotal());
	}
}
