import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class BufferedReadingSamples {
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("infile.txt"));
		BufferedReader user = new BufferedReader(new InputStreamReader(System.in));
		String l="";
		
		//iterating through file
		while((l = f.readLine())!=null){
			System.out.println(l);
		}
		
		//asking for user input
		System.out.println("Enter Team Name: ");
		l = user.readLine();
		
		//using tokens, word by word analysis
		String token;
		StringTokenizer st = new StringTokenizer(l);
		while(st.hasMoreTokens()){
			token = st.nextToken();
		}
		
		//output
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("outfile.txt")));
		out.print("Hello");
	}
}
