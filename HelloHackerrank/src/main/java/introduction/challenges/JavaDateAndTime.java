package introduction.challenges;

import java.time.LocalDate;
import java.util.Scanner;

public class JavaDateAndTime {

	private static String dayName;
	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		String month = in.next();
		String day = in.next();
		String year = in.next();

		System.out.println(getDay(day, month, year));
	}

	public static String getDay(String day, String month, String year) {
		LocalDate localDate = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
		dayName = "";
		return dayName = String.valueOf(localDate.getDayOfWeek());
	}
}
