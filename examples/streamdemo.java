package examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class streamdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<>(Arrays.asList("Gagan", "Manoj", "Bargav", "Naveen", "Kishore", "Jairam",
				"Dharani", "Bhargavi", "Bhavani", "Mounika"));
		// foreach() method
		names.stream()
		.forEach(e -> System.out.println(e));
		
	}

}
