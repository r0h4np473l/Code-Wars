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

public class y2013p04 {
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("y2013p04.txt"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("y2013p04out.txt")));

		String l="";
		double velocityInitial= Double.parseDouble(f.readLine());
		double degrees = Double.parseDouble(f.readLine());
		double gravity = 9.80665;

		double radians = degrees *  Math.PI/180;
		double distance = Math.pow(velocityInitial, 2) * Math.sin(2*radians)/gravity;

		out.printf("%.4f",distance);

		out.close();
		System.exit(0);
	}
}
