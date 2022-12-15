package java8newfeatures;

interface sum {
	/*
	 * public void a(int a, int b);
	 */
	public void b(int x, int y);
}

class add {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * sum s = (a, b) -> { System.out.println(a + b); }; s.a(10, 30);
		 */
		sum s = (a, b) -> {
			System.out.println(a - b);
		};
		s.b(100, 20);
	}

}
