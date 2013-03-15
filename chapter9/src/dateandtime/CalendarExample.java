package dateandtime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class CalendarExample {
	public static void main(String args[]) {
		GregorianCalendar calendar = new GregorianCalendar();
		GregorianCalendar calendar_1 = new GregorianCalendar();
		GregorianCalendar calendar_2 = new GregorianCalendar();

		TimeZone timeZone = TimeZone.getTimeZone("Europe/London");
		calendar_1.setTimeZone(timeZone);

		SimpleDateFormat dateFormat = new SimpleDateFormat(
				"yyyy년 MM 월 dd일 hh시 mm분 ss초");
		dateFormat.setTimeZone(TimeZone.getTimeZone("America/New_York"));
		String str = dateFormat.format(calendar_2.getTime());

		print(calendar);
		print(calendar_1);
		System.out.println(str);
	}

	public static void print(GregorianCalendar calendar) {
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int date = calendar.get(Calendar.DATE);
		int amPm = calendar.get(Calendar.AM_PM);
		int hour = calendar.get(Calendar.HOUR);
		int min = calendar.get(Calendar.MINUTE);
		int sec = calendar.get(Calendar.SECOND);
		String KoramPm = amPm == Calendar.AM ? "오전" : "오후";
		System.out.printf("%d년 %d월 %d일 %s %d분 %d초 ", year, month, date,
				KoramPm, hour, min, sec);
		System.out.println();
	}

}
