import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class prob09 {
	public static void main(String[] args) throws IOException {
		//BufferedReader f = new BufferedReader(new FileReader("prob09-1-in.txt"));
		BufferedReader f = new BufferedReader(new FileReader("prob09.txt"));
		//PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("outfile.txt")));
		String line="";
		StringTokenizer st = new StringTokenizer(line);
		line = f.readLine();
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<Integer> points = new ArrayList<Integer>();
		int temp = 0;
		String tempName = "";
		int tempPoints = 0; 
		int tempIndex=0;
		while(!(line = f.readLine()).equals("0 0")){
			st = new StringTokenizer(line);
			tempName= st.nextToken();
			tempPoints = Integer.parseInt(st.nextToken());
			tempIndex = search(names, tempName);
			if(tempIndex<0){
				names.add(tempName);
				points.add(tempPoints);
			}
			else{
				points.set(tempIndex,points.get(tempIndex)+tempPoints);
			}
		}
		//System.out.println(names);
		//System.out.println(points);
		for(int i = 1 ; i < 6;i++){
			temp = indexOfMax(points);
			System.out.println(i+" "+ names.get(temp)+" "+points.get(temp));
			names.remove(temp);
			points.remove(temp);
		}
		f.close();
		//out.close();
		System.exit(0);
	}
	public static int indexOfMax(ArrayList<Integer> points){
		int maxIndex = 0;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i<points.size();i++){
			if(points.get(i)>max){
				max = points.get(i);
				maxIndex = i;
			}
		}
		return maxIndex;
	}
    public static int search(ArrayList<String> input, String key){
    	for(int i =0; i<input.size();i++){
    		if(input.get(i).equals(key))
    			return i;
    	}
    	return -1;
    }
}
