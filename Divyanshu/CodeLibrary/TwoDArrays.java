package CodeLibrary;

import java.util.Arrays;


public class TwoDArrays {
	public static void main(String[] args) {
		int[][] x = {{1,2,3,4},{4,5,6,7,8,9}};
		String[][] x2 = {{"1","2","3","4"},{"4","5","6","7"}};
		int[] f = linearizeArray(x);
		//used for 2d arrays
		System.out.println(Arrays.deepToString(x));
		System.out.println(getArraySize(x));
		System.out.println(Arrays.deepToString(x2));
		System.out.println(Arrays.deepToString(traverse2DArray(x2)));
		//used for 1d arrays
		System.out.println(Arrays.toString(f));
	}
	//converts 2d array to simple array, returns int[], arg: int[][]
	public static int[] linearizeArray(int[][] x){
		int k=0;
		int[] newarray = new int[getArraySize(x)];
		for(int i = 0; i<x.length;i++){
			for(int j=0;j<x[i].length;j++){
				newarray[k] = x[i][j];
				k++;
			}
		}
		return newarray;
	}
	//converts 2d array to simple array, returns String[], arg: String[][]
	public static String[] linearizeArray(String[][] x){
		int k=0;
		String[] newarray = new String[getArraySize(x)];
		for(int i = 0; i<x.length;i++){
			for(int j=0;j<x[i].length;j++){
				newarray[k] = x[i][j];
				k++;
			}
		}
		return newarray;
	}
	
	//returns size of 2d array, returns int, arg:int[][]
	public static int getArraySize(int[][] x){
		int l=0;
		for(int i=0;i<x.length;i++){
			for(int j=0;j<x[i].length;j++){
				l++;
			}
		}
		return l;
	}
	//returns size of 2d string array, returns int, arg:String[][]
	public static int getArraySize(String[][] x){
		int l=0;
		for(int i=0;i<x.length;i++){
			for(int j=0;j<x[i].length;j++){
				l++;
			}
		}
		return l;
	}
	//traverses 2d array, must be a regular rectangular array. [[1, 2, 3, 4], [4, 5, 6, 7]] returns [[1, 4], [2, 5], [3, 6], [4, 7]]
	public static String[][] traverse2DArray(String[][] s1){
		String[][] s2 = new String [s1[0].length][s1.length];
		for(int i =0; i<s2.length;i++){
			for(int j=0;j<s2[0].length;j++){
				s2[i][j] = s1[j][i];
			}
		}
		return s2;
	}
}