package java8newfeatures;

interface funcone {
	public void display();
}

public class funct1 implements funcone {
	public void display() {
		System.out.println("funct1 method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		funct1 fc = new funct1();
		fc.display();
	}

}
