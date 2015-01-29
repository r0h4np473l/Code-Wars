package CodeWars2014Solutions;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class y2014p01 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		String x;
		BufferedReader f = new BufferedReader(new FileReader("y2014p01.txt"));
		while(((x = f.readLine())!=null) && !(x.equals("0"))){
			double input = Integer.parseInt(x);
			System.out.println(x+"\t"+Math.round(P(input)));
		}
		f.close();
	}
	public static double P(double t){
		double answer = 100* Math.sqrt(t)+(201/(t+1))+1;
		return answer;
	}
}
