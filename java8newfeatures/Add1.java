package java8newfeatures;

interface example {
	public void add(int x, int y);
}

public class Add1 implements example {
	public void add(int x, int y) {
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		example e = new Add1();
		e.add(100, 400);
	}

}
