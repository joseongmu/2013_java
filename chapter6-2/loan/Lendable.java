package loan;

public interface Lendable {
	final static boolean STATE_BORROWED = false;
	final static boolean STATE_NORMAL = true;
	abstract void checkOut (String borrower, String date) throws Exception;
	void checkIn();

}
