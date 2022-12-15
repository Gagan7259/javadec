package examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> n = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		n.stream().flatMap(e -> Stream.of("number:" + e * 4)).forEach(e -> System.out.println(e));
	}

}
