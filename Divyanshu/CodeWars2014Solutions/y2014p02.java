package CodeWars2014Solutions;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class y2014p02 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader f = new BufferedReader(new FileReader("y2014p02.txt"));
		String line, line2;
		//Only used to get rid of that number
		int numLines = Integer.parseInt(f.readLine());
		//ints to define
		int evenSum, oddSum, sum;
		//iterate through the file
		while((line  = f.readLine())!=null){
			evenSum=0;
			oddSum=0;
			sum=0;
			//takes out all spaces
			line2 = line.replaceAll(" ", "");
			//iterate through the odds, first index is 1
			for(int i =0;i<line2.length();i+=2){
				oddSum+=Integer.parseInt(""+line2.charAt(i));
				if(i!=10)
					evenSum+=Integer.parseInt(""+line2.charAt(i+1));
			}
			//compute by the formula
			sum = (oddSum*3+evenSum)%10;
			if(sum!=0){
				sum = 10-sum;
			}
			//prints
			System.out.println(line + " " + sum);
		}
		f.close();
		System.exit(0);
	}
}
