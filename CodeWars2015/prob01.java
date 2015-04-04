import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class prob01 {
	public static void main(String[] args) throws IOException {
		//BufferedReader f = new BufferedReader(new FileReader("prob01-1-in.txt"));
		BufferedReader f = new BufferedReader(new FileReader("prob01.txt"));
		String ourJudgesName = f.readLine();
		System.out.println("Greetings, " + ourJudgesName + 
				" the Great! I genuflect in your general direction!");
		f.close();
	}
}
