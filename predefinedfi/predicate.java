package predefinedfi;

import java.util.function.Predicate;

public class predicate {
	//static Predicate<Integer> s=f->f%2==0;
	static Predicate <Integer> m=s->s%7==1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(s.test(100));
		System.out.println(m.test(181));
	}

}
