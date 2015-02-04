package Solutions2013;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.*;

public class y2013p03 {

	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("y2013p03.txt"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("y2013p03out.txt")));
		
		String l="";
		String name="";
		String namePlanet="";
		double weight = 0.0;
		double conversion = 0.0;
		
		while(!(l = f.readLine()).equals("END 0 0 0 ")){
			StringTokenizer st = new StringTokenizer(l);
			name=st.nextToken();
			weight = Double.parseDouble(st.nextToken());
			namePlanet = st.nextToken();
			conversion = Double.parseDouble(st.nextToken());
			
			double newWeight = weight * conversion;
			
			out.println("On " + namePlanet + ", " + name + " would weigh " + newWeight + " pounds.");
		}
		out.close();
		System.exit(0);
	}
}
