import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class prob04 {
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("prob04.txt"));
		//BufferedReader f = new BufferedReader(new FileReader("prob04-2-in.txt"));
		String line="";
		StringTokenizer st;
		while(!(line = f.readLine()).equals("0 0") && (line != null)){
			st = new StringTokenizer(line);
			//System.out.println(line);
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			System.out.println(num1*num2);
		}
		f.close();
		System.exit(0);
	}
}
