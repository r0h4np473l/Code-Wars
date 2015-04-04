import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class prob05 {
	public static void main(String[] args) throws IOException {
		//BufferedReader f = new BufferedReader(new FileReader("prob05-1-in.txt"));
		BufferedReader f = new BufferedReader(new FileReader("prob05.txt"));
		String line="";
		int a = Integer.parseInt(f.readLine());
		int b=Integer.parseInt(f.readLine());
		int c= Integer.parseInt(f.readLine());
		
		int axb=a*b;
		int axc= a*c;
		int axbplusaxc= axb+axc;
		
		int bplusc=b+c;
		int atimesbplusc= a*bplusc;
		
		System.out.println(a + " x " + "(" + b + " + " + c + ")" + " = " + a + " x " + b + " + " + a + " x " + c);
		System.out.println(a + " x " + bplusc + " = " + axb + " + " + axc);
		System.out.println(atimesbplusc + " = " + atimesbplusc);
		
		f.close();
		System.exit(0);
	}
}
