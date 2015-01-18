package CodeLibrary;

import java.util.ArrayList;
import java.util.Collections;

public class ListsMethods {
	public static void main(String[] args){
		ArrayList<Integer> x = new ArrayList<Integer>();
		x.add(0);
		x.add(1);
		x.add(2);
		x.add(5);
		
		//x.set(index,value) changes value of certain index
		x.set(3, 3);
		
		//creates a copy of the arraylist
		ArrayList<Integer> x3 = (ArrayList<Integer>) x.clone();
		
		//converts arraylists to object[]
		Object[] x2 =  x.toArray();
		
		//returns nothing, x is sorted without declaration
		Collections.sort(x);
		
		//returns index of key through binary search
		Collections.binarySearch(x, 1);	
	}
}
