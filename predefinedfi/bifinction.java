package predefinedfi;

import java.util.function.BiFunction;

public class bifinction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BiFunction <Integer,Integer ,Integer> sum=(num1,num2)->num1+num2;
System.out.println(sum.apply(200, 300));
	}

}
