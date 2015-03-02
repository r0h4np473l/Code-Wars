package CodeWars2013Solutions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class y2013p06 {
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("y2013p06.txt"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("y2013p06out.txt")));
		String line="";
		StringTokenizer st = new StringTokenizer(line);
		double[] x = new double[3];
		double[] y = new double[3];
		while(!(line = f.readLine()).equals("0 0 0 0 0 0")){
			x = new double[3];
			y = new double[3];
			//System.out.println(line);
			st = new StringTokenizer(line);
			x[0] = Double.parseDouble(st.nextToken());
			y[0] = Double.parseDouble(st.nextToken());
			x[1] = Double.parseDouble(st.nextToken());
			y[1] = Double.parseDouble(st.nextToken());
			x[2] = Double.parseDouble(st.nextToken());
			y[2] = Double.parseDouble(st.nextToken());
			
			//System.out.println(distance(x[0],x[1],y[0],y[1]));
			double a = distance(x[0],x[1],y[0],y[1]);
			double b = distance(x[1],x[2],y[1],y[2]);
			double c = distance(x[0],x[2],y[0],y[2]);
			double w = cosLaw( a,  b,  c);
			System.out.println(round(genTriArea( a,  b,  w),4));
			out.println(round(genTriArea( a,  b,  w),4));
		}
		f.close();
		out.close();
		System.exit(0);
	}
	public static double distance(double x, double x0, double y, double y0){
		return Math.sqrt(Math.pow(x-x0, 2)+Math.pow(y-y0, 2));
	}
	public static double cosLaw(double a, double b, double c){
		return Math.acos((Math.pow(a,2) + Math.pow(b,2) - Math.pow(c, 2))/(2 * a * b)); 
	}
	public static double genTriArea(double a, double b, double w){
		return (a*b*Math.sin(w)/2);
	}
	public static double round(double x,int s){
		double l =x;
		l=(int)(l*Math.pow(10,s));
		l=l/Math.pow(10,s);
		return l;
	}
}
