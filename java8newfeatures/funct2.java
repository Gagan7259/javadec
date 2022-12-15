package java8newfeatures;

interface functwo {
	public void displayd();
}

public class funct2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		functwo n = () -> {
			System.out.println("ok ");
		};
		n.displayd();
	}

}
