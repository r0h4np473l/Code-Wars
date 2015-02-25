package CodeLibrary;
/**
 * @author Divyanshu Gandhi
 * @description This is a shell for all of our files in codewars, saves some time.
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SHELL {

	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("infile.txt"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("outfile.txt")));
		while(f.readLine()!=null){
			
		}
		f.close();
		out.close();
		System.exit(0);
	}

}
