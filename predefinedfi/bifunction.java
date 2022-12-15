package predefinedfi;

import java.util.function.BiConsumer;

public class bifunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BiConsumer<String,Integer> student=(name,marks)->System.out.println(name+"got"+marks); 
	
	student.accept("Gagan",75 );
	}

}
