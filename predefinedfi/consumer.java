package predefinedfi;

import java.util.function.Consumer;

public class consumer {
	static void c1(String name) {
		System.out.println("Hello" + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> c = (name) -> System.out.println("Hello" + name);
		c.accept("Gagan");
	}

}
