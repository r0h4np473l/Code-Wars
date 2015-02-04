package Solutions2013;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;

public class y2013p01A {
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("y2013p01.txt"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("y2013p01out.txt")));
		
		int numShirts = Integer.parseInt(f.readLine());
		int priceTotal = 8 * numShirts - 95;
		
		System.out.println(priceTotal);
		
		out.println(priceTotal);
		out.close();
	} 	
}
