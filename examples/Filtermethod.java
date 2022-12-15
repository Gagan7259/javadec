package examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Filtermethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<>(Arrays.asList("Gagan", "Manoj", "Bargav", "Naveen", "Kishore", "Jairam",
				"Dharani", "Bhargavi", "Bhavani", "Mounika"));

		// List<Integer> num = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9,
		// 0));
		
		
		// foreach() method
		//num.stream().forEach(e -> System.out.println(e));
		
		
		// filter()method
		/*
		 * System.out.println("Even Numbers"); num.stream() .filter((m)->{return
		 * m%2==0;}) .forEach(e->System.out.println(e));
		 */
		/*
		 * System.out.println("% by 3"); num.stream() .filter((g)->{return g%3==0;})
		 * .forEach(k->System.out.println(k));
		 */
		
		//toUppercasr()method		
		//names.stream().map(name -> name.toUpperCase()).forEach(name -> System.out.println(name));;
		
		//toLowercase
		System.out.println("toLowercase");
		names.stream().map(name->name.toLowerCase()).forEach(name->System.out.println(name));
	}

}
