import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 
 * This class will read json string from file
 * @author Mohan 
 */
public class ReadInput {
	String PATH_TO_INPUT_FILE = ".\\src\\\\input.json";

	/**
	 * This method will return the content of input file
	 * @return content
	 */
	public String readJson() {
		Path path = Paths.get(PATH_TO_INPUT_FILE);

		String content = null;
		try {
			// Reading all bytes from given file path
			byte[] encoded = Files.readAllBytes(path);
			content = new String(encoded);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return content;
	}
}
