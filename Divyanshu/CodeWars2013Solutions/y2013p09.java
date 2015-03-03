package CodeWars2013Solutions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class y2013p09 {
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("y2013p09.txt"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("y2013p09out.txt")));
		String line="";
		int sumOfOnes=0;
		while(!(line=f.readLine()).equals("-1 ")){
			sumOfOnes=0;
			int n = Integer.parseInt(line);
			for(int i =0;i<=n;i++){
				sumOfOnes+=checkOnes(i);
			}
			System.out.println(sumOfOnes);
		}
		f.close();
		out.close();
		System.exit(0);
	}
	public static int checkOnes(int x){
		String num = ""+x;
		int sum=0;
		for(int l=0;l<num.length();l++){
			if(num.charAt(l)=='1'){
				sum++;
			}
		}
		return sum;
	}
}
