package Solutions2013;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.*;

public class y2013p02 {

	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("y2013p02.txt"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("y2013p02out.txt")));

		double ounces = Double.parseDouble(f.readLine());
		double grams = ounces * 28.3495;
		System.out.println(grams);

		out.println(grams);
		out.close();
		System.exit(0);
	}
}
