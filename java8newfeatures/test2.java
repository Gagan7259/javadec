package java8newfeatures;
interface lam1{
	void m1();
}
public class test2 {

	public static void main(String[] args) {
		/*
		 * lam1 t=()->{System.out.println("ok its good");}; t.m1();
		 */
		lam1 l=()->{System.out.println("not bad");};
		l.m1();
		
	}

}
