package predefinedfi;

import java.util.function.Predicate;

public class apply {
	// static Function<Integer,Integer>f=i->i*i;
	// static Function<Integer, Integer> a = a -> a * a;
	static Predicate<Integer> k = a -> a % 2 == 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println(f.apply(100));
		// System.out.println(a.apply(500));
		System.out.println(k.test(400));
	}

}
