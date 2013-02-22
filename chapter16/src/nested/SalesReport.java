package nested;

import java.util.ArrayList;

class SalesReport {
	int year;
	int quarter;
	ArrayList<Record> list;

	SalesReport(int year, int quarter) {
		list = new ArrayList<Record>();
		this.year = year;
		this.quarter = quarter;
	}

	void addRecord(String name, int num, int amount) {
		list.add(new Record(name, num, amount));
	}

	int getTotal() {
		int total = 0;
		for (Record record : list)
			total += record.amount;
		return total;
	}

	class Record {
		String name;
		int num;
		int amount;

		Record(String name, int num, int amount) {
			this.name = name;
			this.num = num;
			this.amount = amount;
		}
	}
}
