import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class prob06 {
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("prob06.txt"));
		//BufferedReader f = new BufferedReader(new FileReader("prob06-1-in.txt"));
		Double len = Double.parseDouble(f.readLine())/3;
		Double wid = Double.parseDouble(f.readLine())/3;
		Double hei = Double.parseDouble(f.readLine())/3;
		
		int cubYards = (int)Math.round((len*wid*hei));
		//System.out.println(""+len+" "+wid+" "+hei+" "+(len*wid*hei)+" "+cubYards);
		System.out.println(cubYards);
		f.close();
		System.exit(0);
	}
}
