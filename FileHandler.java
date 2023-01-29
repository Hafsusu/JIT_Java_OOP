import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] names = {"Sumeya", "Sofia", "Remla"};
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"));
			writer.write("This is me writing to a file.");
			writer.write("\nThis is anothe line to be written on the file.");
			writer.close();
			for(String name : names) {
				writer.write("\n" + name);
			}
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
			String line;
			try {
				while((line = reader.readLine()) != null) {
					System.out.println(line);
					}
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
//Written by : Sofia Alemu - RU3049/13
//             Sumeya Abesha - RU0020/13
