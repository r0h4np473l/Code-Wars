package CodeWars2014Solutions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class y2014p13 {
	private static ArrayList<String> allPerms = new ArrayList<String>();
	//Recursive Code taken from http://learnprogramming.machinesentience.com/java_permutations_recursion/
	private static void permutation(String prefix, String str){
		int n = str.length();
		if (n == 0){
			//System.out.println(prefix);
			allPerms.add(prefix);
		}
		else {
			for (int i = 0; i < n; i++)
				permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1));
		}
	}
	//Code Taken From http://www.dotnetperls.com/remove-duplicates-arraylist-java
    static ArrayList<String> removeDuplicates(ArrayList<String> list) {
	// Store unique items in result
	ArrayList<String> result = new ArrayList<>();
	// Record encountered Strings in HashSet.
	HashSet<String> set = new HashSet<>();
	// Loop over argument list.
	for (String item : list) {
	    // If String is not in set, add it to the list and the set.
	    if (!set.contains(item)) {
		result.add(item);
		set.add(item);
	    }
	}
	return result;
    }
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader f =new BufferedReader(new FileReader("y2014p13.txt"));
		//number of letters, first input
		int numLet = Integer.parseInt(f.readLine());
		//line for letters
		String line = f.readLine();
		//input letters into an array
		StringTokenizer st= new StringTokenizer(line);
		String[] letters = new String[numLet];
		int i=0;
		while(st.hasMoreTokens()){
			letters[i] = st.nextToken();
			i++;
		}
		//creates combinations of 5 for all in letter array, making sure none repeat
		for(i=0;i<numLet;i++){
			for(int j=1;j<numLet;j++){
				if(i!=j)
				for(int k=2;k<numLet;k++){
					if(i!=k&&j!=k)
					for(int l=3;l<numLet;l++){
						if(i!=l&&j!=l&&k!=l)
						for(int m=4;m<numLet;m++){
							if(i!=m&&j!=m&&k!=m&&l!=m)
							permutation("", letters[i]+letters[j]+letters[k]+letters[l]+letters[m]);
		}}}}}//end all loops
		
		//sorts list
		Collections.sort(allPerms);
		//removes duplicates
		allPerms = removeDuplicates(allPerms);
		
		//Iterates through terms of K in text file
		int index=0;
		while(((line=f.readLine())!=null) && !line.equals("0")){
			//Prints Results
			index = Integer.parseInt(line)-1;	//0th index is 1st in this input style
			try{
			System.out.println(line+":"+allPerms.get(index));
			}
			catch(IndexOutOfBoundsException e){	//if number is outside of list
				System.out.println("list length: " +allPerms.size()+"\tlast:"+allPerms.get(allPerms.size()-1));
			}
		}
		//exit
		System.exit(0);
	}
}