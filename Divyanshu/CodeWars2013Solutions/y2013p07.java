package CodeWars2013Solutions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class y2013p07 {

	public static void main(String[] args) throws IOException {
		//file declarations
		BufferedReader f = new BufferedReader(new FileReader("y2013p07.txt"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("y2013p07out.txt")));
		//loop through until you get to -1
		String line="";
		int h=0;
		while(!(line=f.readLine()).equals("-1")){
			int min =Integer.parseInt(line);
			//round to the highest 5
			int min2 =(int) (5*(Math.ceil(Math.abs(min/5.0))));
			//find the distance in minutes from the 6 hour clock
			int dist = Math.abs(30-min2);
			//if on the left hand side create counter part on right
			if(min/5<6){
				h=6+dist/5;
			}
			//if on the right hand side, create counterpart on left
			else if(min/5>6){
				h=6-dist/5;
			}
			//Print this stuff out
			if((""+min2).length()==1){
				System.out.println(h+":0"+min);
				out.println(h+":0"+min);
			}
			else {
				System.out.println(h+":"+min);
				out.println(h+":"+min);
			}	
		}
		f.close();
		out.close();
		System.exit(0);
	}
	//rounds decimal x to sth place
	public static double round(int x,int s){
		double l =x;
		l=(int)(l*Math.pow(10,s));
		l=l/Math.pow(10,s);
		return l;
	}
}
