import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class prob08 {
	public static void main(String[] args) throws IOException {
		//BufferedReader f = new BufferedReader(new FileReader("prob08-1-in.txt"));
		BufferedReader f = new BufferedReader(new FileReader("prob08.txt"));
		int num = Integer.parseInt(f.readLine());
		int[] cubeLocs = new int[num];
		String line = "";
		String name = "";
		int currCube=0;
		int emptyCubes=0;
		int dupes = 0;
		int without=0;
		ArrayList<Integer> allDupes = new ArrayList<Integer>();
		StringTokenizer st = new StringTokenizer(line);
		for(int i = 0; i<num;i++){
			line = f.readLine();
			//System.out.println(line);
			st = new StringTokenizer(line);
			name = st.nextToken();
			currCube = Integer.parseInt(st.nextToken());
			if(name.equals("NA")){
				emptyCubes++;
			}
			if(currCube==0){
				without++;
			}
			else if(search(cubeLocs,currCube)>=0 && search(allDupes,currCube)<0){
				dupes++;
				allDupes.add(currCube);
				//System.out.println(currCube);
			}
			cubeLocs[i] = currCube;
		}
		System.out.println("Empty Cubes: "+ emptyCubes);
		System.out.println("Duplicate Cube Assignments: "+ dupes);
		System.out.println("Employee without Cube: "+ without);
		f.close();
		System.exit(0);
	}
    public static int search(int[] input, int key){
    	for(int i =0; i<input.length;i++){
    		if(input[i]==key)
    			return i;
    	}
    	return -1;
    }
    public static int search(ArrayList<Integer> input, int key){
    	for(int i =0; i<input.size();i++){
    		if(input.get(i)==key)
    			return i;
    	}
    	return -1;
    }
}
