package solution2011;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class y2011p07 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader f = new BufferedReader(new FileReader("y2011p07.txt"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("outfile.txt")));
		String line="";
		String key= "QWERTYUIOPASDFGHJKLZXCVBNM";
		
		while(!(line=f.readLine()).equals(".")){
		}
		
		f.close();
		out.close();
		System.exit(0);
	}

}
/*

int g=0;
for(int i=0; i<listOfArrays.size(); i++)
{
	char first='a';
	char second='a';
	if(!(i+1 == listOfArrays.size())){
	 first= listOfArrays.get(i).charAt(g);
	 second= listOfArrays.get(i+=1).charAt(g);
	}
	while(first==second && (i+1 != listOfArrays.size()))
	{
		g++;
		first=listOfArrays.get(i).charAt(g);
		second= listOfArrays.get(i+=1).charAt(g);
	}
	if(key.indexOf(first)>key.indexOf(second))
	{
		String firstWord= listOfArrays.get(i);
		String secondWord= listOfArrays.get(i+=1);
		listOfArrays.set(i, secondWord);
		listOfArrays.set(i+=1, firstWord);
	}
}
System.out.println(listOfArrays);
*/
