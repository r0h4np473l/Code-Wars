package solution2011;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class y2011p01 {
	public static void main(String[] args) throws IOException {
		//BufferedReader f = new BufferedReader(new FileReader("infile.txt"));
		BufferedReader user = new BufferedReader(new InputStreamReader(System.in));
		int l = 0;
		int l2=0;
		System.out.print("Enter projected 2012 state budget (in billions): ");
		l = Integer.parseInt(user.readLine());
		System.out.print("Enter projected 2012 state revenues (in billions): ");
		l2=Integer.parseInt(user.readLine());
		System.out.println("Estimated budget shortfall in 2012: " + (l- l2) + " billions");
		user.close();
		System.exit(0);
	}
}
