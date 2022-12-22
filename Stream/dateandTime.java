package Stream;

import java.time.LocalDate;
import java.time.Period;

public class dateandTime {

	public static void main(String[] args) {
		LocalDate curdate = LocalDate.now();
		LocalDate birthdate = LocalDate.of(1999, 3, 9);
		Period p=Period.between(birthdate, curdate);
System.out.println("years"+p.getYears());
System.out.println("Months"+p.getMonths());
System.out.println("Days"+p.getDays());

	}

}
