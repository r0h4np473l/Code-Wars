import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;


public class prob18 {
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("prob18-1-in.txt"));
		String line="";
		line = f.readLine();
		StringTokenizer st = new StringTokenizer(line);
		int rows = Integer.parseInt((st.nextToken()));
		int cols = Integer.parseInt((st.nextToken()));
		String[][] grid = new String[rows][cols];
		for(int i = 0; i < rows;i++){
			line = f.readLine();
			grid[i] = line.split(" ");
		}
		System.out.println(Arrays.deepToString(grid));
		
		f.close();
		System.exit(0);
	}
}
