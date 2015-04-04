import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class prob07 {
	public static void main(String[] args) throws IOException {
		//BufferedReader f = new BufferedReader(new FileReader("prob07-1-in.txt"));
		BufferedReader f = new BufferedReader(new FileReader("prob07.txt"));
		String line="";
		double P = 0.0;
		double R = 0.0;
		while(!(line = f.readLine()).equals("0")){
			P=Double.parseDouble(line);
			R = Math.pow(P,(2/3.0));
			System.out.println(round(R,3));
		}
		f.close();
		System.exit(0);
	}
	public static double round(double x,int s){
		double l =x;
		l=(int)(l*Math.pow(10,s));
		l=l/Math.pow(10,s);
		return l;
	}
}
