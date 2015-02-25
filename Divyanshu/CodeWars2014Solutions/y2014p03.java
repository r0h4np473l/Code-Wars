package CodeWars2014Solutions;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class y2014p03 {
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("y2014p03.txt"));
		
		String line;
		int numOfLines = Integer.parseInt(f.readLine());
		for(int i=1;i<=numOfLines;i++){
			line = f.readLine();
			int j=0;
			String hour = "";
			while(!((""+line.charAt(j)).equals(":"))){
				hour += (line.charAt(j));
				j++;
			}
			j++;
			String mins="";
			while(j<line.length()){
				mins += ""+line.charAt(j);
				j++;
			}
			calculateMilliamps(hour, mins);
			
		}
		f.close();
		System.exit(0);
	}
	public static void calculateMilliamps(String hour, String mins){
		int numsOfSegments[] = {6,2,5,5,4,5,6,3,7,6};
		int milliamps =0;
		int hourMil=0;
		int minMil=0;
		for(int i=0;i<hour.length();i++){
			hourMil += numsOfSegments[Integer.parseInt((""+hour.charAt(i)))]*15;
		}
		for(int i=0;i<mins.length();i++){
			minMil += numsOfSegments[Integer.parseInt((""+mins.charAt(i)))]*15;
		}
		milliamps = minMil+hourMil+20;
		System.out.println(milliamps+" milliamps");
	}

}
