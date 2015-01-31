package CodeWars2014Solutions;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class y2014p02 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader f = new BufferedReader(new FileReader("y2014p02.txt"));
		String line;
		String line2;
		int numLines = Integer.parseInt(f.readLine());
		//System.out.println(numLines);
		int evenSum;
		int oddSum;
		int sum;
		while((line  = f.readLine())!=null){
			evenSum=0;
			oddSum=0;
			sum=0;
			line2 = line.replaceAll(" ", "");
			//System.out.println(line);
			for(int i =0;i<line2.length();i+=2){
				oddSum+=Integer.parseInt(""+line2.charAt(i));
				//System.out.println(""+line2.charAt(i));
				if(i!=10)
					evenSum+=Integer.parseInt(""+line2.charAt(i+1));
			}
			sum = (oddSum*3+evenSum)%10;
			if(sum!=0){
				sum = 10-sum;
			}
			System.out.println(line + " " + sum);
		}
	}
}
