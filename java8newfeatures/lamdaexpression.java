package java8newfeatures;

interface lamdaexpression {
	public void m1();
}

 class test implements lamdaexpression {
	public void m1() {
		System.out.println("m1 method");

	}
	public static void main(String[] args) {
		test t=new test();
		t.m1();
		
	}
	
}
