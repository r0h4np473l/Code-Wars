package solution2011;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class y2011p11 {
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("y2011p11.txt"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("outfile.txt")));
		String line="";
		String[] names = new String[4];
		StringTokenizer st = new StringTokenizer(line);
		int nameCount = 0;
		String tempName="";
		String tempName2="";
		String function = "";
		ArrayList<String> wasRelation = new ArrayList<String>();
		ArrayList<String> beatRelation = new ArrayList<String>();
		while((line = f.readLine())!=null){
			st = new StringTokenizer(line);
			while(st.hasMoreTokens()){
				tempName = st.nextToken();
				names[nameCount]=tempName.substring(0, tempName.length()-1);
				//System.out.println(names[nameCount]);
				tempName2 = st.nextToken();
				if (tempName2.equals("I"))
					tempName2=names[nameCount];
				//System.out.println(tempName2);
				function = st.nextToken();
				//System.out.println(function);
				if(function.equals("WAS")){
					wasRelation.add(tempName2);
					wasRelation.add(st.nextToken());
					//System.out.println(wasRelation.toString());
				}
				else{
					beatRelation.add(tempName2);
					beatRelation.add(st.nextToken());
					//System.out.println(beatRelation.toString());
				}
			}
			nameCount++;
		}
		//System.out.println("complete");
		String[] testnam = new String[4];
		//System.out.println("complete");
		for(int i = 0;i<testnam.length;i++){
			testnam[i]="";
			//System.out.println("complete");
		}
		boolean ans = false;
		for(int i = 0;i<nameCount;i++){
			//System.out.println("complete");
			//System.out.println(i);
			for(int j = 0;j<nameCount;j++){
				if(i!=j)
				for(int k = 0; k<nameCount;k++){
					if(i!=j && i!=k && j!=k)
					for(int l = 0; l<nameCount;l++){
						if(i!=j && i!=k && j!=k && i!=l && j!=l && k!=l){
							testnam[0] = names[i];
							testnam[1] = names[j];
							testnam[2] = names[k];
							testnam[3] = names[l];
							if(invChecks((ArrayList<String>) wasRelation.clone(),
									(ArrayList<String>) beatRelation.clone(),testnam)){
								//System.out.println("ans");
								System.out.println(Arrays.toString(testnam));
								ans = true;
								break;
							}
						}
					}
					if(ans) break;
				}
				if(ans) break;
			}
			if(ans) break;
		}
		f.close();
		out.close();
		System.exit(0);
	}
    public static int search(int[] input, int key){
    	for(int i =0; i<input.length;i++){
    		if(input[i]==key)
    			return i;
    	}
    	return -1;
    }
    public static boolean invChecks(ArrayList<String> was, ArrayList<String> beat, 
    		String[] tester){
    	String name = "";
    	String name2 = "";
    	String place = "";
    	int siz = was.size()/2;
    	for(int i = 0;i<siz;i++){
    		name = was.get(0);
    		place = was.get(1);
    		//System.out.println(name+" was "+place);
    		//System.out.println(search(tester,name));
    		was.remove(0);
    		was.remove(0);
    		//System.out.println(was);
    		switch (place){
    		case "FIRST":
    			if(search(tester,name)==0)
    				return false;
    		case "SECOND":
    			if(search(tester,name)==1)
    				return false;
    		case "THIRD":
    			//System.out.println("yup");
    			if(search(tester,name)==2)
    				return false;
    		case "LAST":
    			//System.out.println("yup");
    			if(search(tester,name)==3)
    				return false;
    		}
    	}
    	siz = beat.size()/2;
    	for(int i = 0;i<siz;i++){
    		name = beat.get(0);
    		name2 = beat.get(1);
    		beat.remove(0);
    		beat.remove(0);
    		//System.out.println(beat);
    		if(search(tester,name)<search(tester,name2)){
    			//System.out.println("got beat");
    			return false;
    		}
    	}
    	
    	return true;
    }
    
    public static int search(String[] input, String key){
    	for(int i =0; i<input.length;i++){
    		if(input[i].equals(key))
    			return i;
    	}
    	return -1;
    }
}
