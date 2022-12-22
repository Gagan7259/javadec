package Stream;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class agecaluclater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LocalDate birthDate=LocalDate.of(1999, 3, 9);
LocalDate currentDate=LocalDate.now();
long ageinyears=ChronoUnit.YEARS.between(birthDate, currentDate);
System.out.println(ageinyears);
	}

}
