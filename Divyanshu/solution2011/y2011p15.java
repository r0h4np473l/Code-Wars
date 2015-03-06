package solution2011;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class y2011p15 {

	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("y2011p15.txt"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("outfile.txt")));
		int numLinesOfOrig = Integer.parseInt(f.readLine());

		ArrayList<String> lines = new ArrayList<String>();
		for(int i = 0;i<numLinesOfOrig;i++){
			lines.add(f.readLine());
			//System.out.println(lines.get(i));
		}
		
		String cmd ="";
		String line="";
		int numLinesOfCmd = Integer.parseInt(f.readLine());
		String sub="";
		String sub1="";
		String sub2 ="";
		for(int i = 0; i<numLinesOfCmd;i++){
			line = f.readLine();
			System.out.println(line);
			cmd = ""+ line.charAt(0);
			if(cmd.equals("a")){
				//System.out.println("ADD");
				lines.add(Integer.parseInt(""+line.charAt(2)), line.substring(4));	
			}
			
			else if(cmd.equals("d")){
				lines.remove(Integer.parseInt(""+line.charAt(2)));
			}
			else if(cmd.equals("s")){
				System.out.println("REPLACE");
				sub = line.substring(line.indexOf("/")+1);
				sub1 = sub.substring(0,sub.indexOf("/"));
				sub2 = sub.substring(sub.indexOf("/")+1,sub.length()-1);
				lines = replaceAnArray(lines,sub.substring(0,sub.indexOf("/")),sub.substring(sub.indexOf("/")+1,sub.length()-1));
			}
			//else{
				//sub = line.substring(line.indexOf("/")+1);
				//lines.set(Integer.parseInt(cmd),(lines.get(Integer.parseInt(cmd))).replace(sub.substring(0,sub.indexOf("/")),
					//	sub.substring(sub.indexOf("/"))));
			//}
		}
		for(int i=0;i<lines.size();i++)
			System.out.println(lines.get(i));
		f.close();
		out.close();
		System.exit(0);
	}

	private static ArrayList<String> replaceAnArray(ArrayList<String> lines, String substring1,
			String substring2) {
		System.out.println(substring1 +substring2);
		for(int i =0;i<lines.size();i++){
			if((lines.get(i)).indexOf(substring1)>0){
				//System.out.println("REPLACE2");
				lines.set(i,lines.get(i).replace(substring1,substring2));
			}
		}
		return lines;
	}

}
