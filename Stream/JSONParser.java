package Stream;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class JSONParser {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		JSONParser jsonperser = new JSONParser();
		FileReader reader = new FileReader(".\\jsonmovie\\movies");
		jsonperser.parse(reader);

		System.out.println();
	}

	private void parse(FileReader reader) {
		// TODO Auto-generated method stub

	}

}
