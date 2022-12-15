package examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List<Integer> ename=new ArrayList<> (Arrays.asList(1,2,3,4,5,6,7,8,9,10));
	
	/*
	 * ename.stream() .map(e->e*e). forEach(e->System.out.println(e));
	 */
	
	
	/*
	 * ename.stream() .map(e->"number : "+e) .forEach(e->System.out.println(e));
	 */
	
	
	/*
	 * ename.stream() .map(e->List.of(e*4, e*8, e*6))
	 * .forEach(e->System.out.println(e));
	 */
	
	
	/*
	 * ename.stream() .map(e->"number : "+e*2) .forEach(e->System.out.println(e));
	 */
}

}
