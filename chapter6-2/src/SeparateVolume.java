

public class SeparateVolume implements Lendable{
	String requestNo;
	String bookTitle;
	String writer;
	String borrower;
	String checkoutDate;
	boolean state = STATE_NORMAL; // true �� ���Ⱑ���� ���·ΰ����Ѵ�.
	SeparateVolume (String requestNo,String bookTitle,String writer)
	{
		this.requestNo = requestNo;
		this.bookTitle = bookTitle;
		this.writer = writer;
	}
	 public void checkOut(String borrower, String date) {
		if(state == STATE_NORMAL)
		{
			this.borrower = borrower;
			this.checkoutDate = date;
			this.state = STATE_BORROWED;

		System.out.println("***"+bookTitle+"��(��) ����Ǿ����ϴ�. ***" );
		System.out.println("������ : " + borrower);
		System.out.println("������ : " + date + "\n");
		}
	}

	public void checkIn() {
		this.borrower = null;
		this.checkoutDate = null;
		this.state = STATE_NORMAL;
		
		System.out.println("***"+bookTitle+"��(��) �ݳ� �Ǿ����ϴ� \n");
	}
	
	

}
