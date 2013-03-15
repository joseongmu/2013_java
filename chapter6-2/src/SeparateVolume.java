

public class SeparateVolume implements Lendable{
	String requestNo;
	String bookTitle;
	String writer;
	String borrower;
	String checkoutDate;
	boolean state = STATE_NORMAL; // true 가 대출가능인 상태로가정한다.
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

		System.out.println("***"+bookTitle+"이(가) 대출되었습니다. ***" );
		System.out.println("대출인 : " + borrower);
		System.out.println("대출일 : " + date + "\n");
		}
	}

	public void checkIn() {
		this.borrower = null;
		this.checkoutDate = null;
		this.state = STATE_NORMAL;
		
		System.out.println("***"+bookTitle+"이(가) 반납 되었습니다 \n");
	}
	
	

}
