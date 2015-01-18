import java.util.Arrays;


public class ArraysMethods {
	public static void main(String[] args) {
		int[] l = {5,2,3};
		String[] s = {"1","2","3"};
		System.out.println(Arrays.binarySearch(l, 3)); //completes binary search
		Arrays.toString(l); //or arrays.deepToString(2d array);
		Arrays.sort(l); //This sorts the array, no need to make a new array to save it either. returns void. {5,2,3} becomes {2,3,5}
		System.out.println(Arrays.toString(l));	//sorts
		s = reverseArray(s);
		System.out.println(Arrays.toString(s));
		System.out.println(Arrays.deepToString(traverseArray(l)));
	}
	//reverses an object array
	public static Object[] reverseArray(Object[] s){
		Object[] x = new Object[s.length];
		for(int i = s.length-1;i>=0;i--){
			x[s.length-1-i] = s[i];
		}
		return x;
	}
	//reverses a string array
	public static String[] reverseArray(String[] s){
		String[] x = new String[s.length];
		for(int i = (s.length-1);i>=0;i--){
			x[s.length-1-i] = s[i];
		}
		return x;
	}
	//reverses an int array {5,2,3} becomes {3,2,5}
	public static int[] reverseArray(int[] s){
		int[] x = new int[s.length];
		for(int i = s.length-1;i>=0;i--){
			x[s.length-1-i] = s[i];
		}
		return x;
	}
	//traverse an array {5,2,3} becomes {{5},{2},{3}}
	public static int[][] traverseArray(int[] x){
		int[][] s = new int[x.length][1];
		for(int i=0;i<s.length;i++){
			s[i][0] =x[i]; 
		}
		return s;
	}
}
