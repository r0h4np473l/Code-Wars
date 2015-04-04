import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class prob02 {
	public static void main(String[] args) throws IOException {
		//BufferedReader f = new BufferedReader(new FileReader("prob02-1-in.txt"));
		BufferedReader f = new BufferedReader(new FileReader("prob02.txt"));
		//String line="";
		long cMean = Long.parseLong(f.readLine());
		long numFems = Long.parseLong(f.readLine());
		System.out.println(cMean*numFems);
		f.close();
		System.exit(0);
	}
}
