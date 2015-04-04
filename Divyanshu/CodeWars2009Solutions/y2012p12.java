package CodeWars2009Solutions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class y2012p12 {
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("y2009p12.txt"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("outfile.txt")));
		String line="";
		StringTokenizer st = new StringTokenizer(line);
		String totalString="";
		while(!(line=f.readLine()).equals("###")){
			totalString+=line;
		}
		totalString = totalString.toUpperCase();
		st = new StringTokenizer(line);
		ArrayList<String> s = new ArrayList<String>();
		ArrayList<Integer> i = new ArrayList<Integer>();
		String w ="";
		while(st.hasMoreTokens()){
			w=st.nextToken();
			if(s.isEmpty()){
				s.add(w);
				i.add(1);
			}
			else if(search(s,w)<0){
				s.add(w);
				i.add(1);
			}
			else{
				int temp = search(s,w);
				i.set(temp,i.get(temp)+1);
			}
		}
		findTopFive(i,s);
		f.close();
		out.close();
		System.exit(0);
	}
    public static int search(ArrayList<String> input, String key){
    	for(int i =0; i<input.size();i++){
    		if(input.get(i).equals(key))
    			return i;
    	}
    	return -1;
    }
    public static void findTopFive(ArrayList<Integer> i, ArrayList<String> s ){
    	int[] maxes = new int[5];
    	maxes[0]=Integer.MIN_VALUE;
    	maxes[1]=Integer.MIN_VALUE;
    	maxes[2]=Integer.MIN_VALUE;
    	maxes[3]=Integer.MIN_VALUE;
    	maxes[4]=Integer.MIN_VALUE;
    	String[] stringMaxes = new String[5];
    	for(int i1 =0;i1<i.size();i1++){
    		if(i.get(i1)>maxes[0]){
    			maxes[0] = i.get(i1);
    			stringMaxes[0]=s.get(i1);
    			for(int j = 1;j<maxes.length;j++){
    				maxes[j]=maxes[j-1];
    				stringMaxes[j] = stringMaxes[j-1];
    			}
    		}
    		else if(i.get(i1)>maxes[1]){
    			maxes[1] = i.get(i1);
    			stringMaxes[1]=s.get(i1);
    			for(int j = 2;j<maxes.length;j++){
    				maxes[j]=maxes[j-1];
    				stringMaxes[j] = stringMaxes[j-1];
    			}
    		}
    		else if(i.get(i1)>maxes[2]){
    			maxes[2] = i.get(i1);
    			stringMaxes[2]=s.get(i1);
    			for(int j = 2;j<maxes.length;j++){
    				maxes[2]=maxes[j-1];
    				stringMaxes[j] = stringMaxes[j-1];
    			}
    		}
    		else if(i.get(i1)>maxes[3]){
    			maxes[3] = i.get(i1);
    			stringMaxes[3]=s.get(i1);
    			for(int j = 3;j<maxes.length;j++){
    				maxes[3]=maxes[j-1];
    				stringMaxes[j] = stringMaxes[j-1];
    			}
    		}
    		else if(i.get(i1)>maxes[4]){
    			maxes[4] = i.get(i1);
    			stringMaxes[4]=s.get(i1);
    		}
    	}
    	displayHist(stringMaxes,maxes);
    }
	public static void displayHist(String[] stringMaxes, int[] maxes){
		for(int i = 0;i<maxes.length;i++){
			for(int j = maxes[i];j>0;j--)
				System.out.print("*");
			System.out.print("#"+i+": "+stringMaxes[i]+" - "+maxes[i]);
		}
	}
	
}
