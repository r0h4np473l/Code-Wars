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
		int numLines = Integer.parseInt(f.readLine());
		String token;
		//int[][] codes = new int[numLines][12];
		for(int i =1;i<=numLines;i++){
			line = f.readLine();
			System.out.print(line);
			StringTokenizer st = new StringTokenizer(line);
			int j=0;
			int evenSum=0;
			int oddSum=0;
			int sum=0;
			int result=0;
			while(st.hasMoreTokens()){
				token = st.nextToken();
				//codes[i][j] = Integer.parseInt(token);
				if((j+1)%2==0){
					evenSum+=Integer.parseInt(token);
				}
				else{
					oddSum+=Integer.parseInt(token);
				}
				j++;
			}
			sum = evenSum+oddSum*3;
			result = sum%10;
			if(result!=0){
				result = 10-result;
			}
			System.out.print(" "+result+"\n");
		}
		f.close();
	}
}
