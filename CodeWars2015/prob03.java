import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class prob03 {
	public static void main(String[] args) throws IOException {
		//BufferedReader f = new BufferedReader(new FileReader("prob06-2-in.txt"));
		BufferedReader f = new BufferedReader(new FileReader("prob03.txt"));
		
		String[] nums = {"one","two","three","four","five","six","seven","eight","nine","ten"};
		int index=Integer.parseInt(f.readLine());
		//System.out.println(index);
		//int index = search(nums,line);
		System.out.println("Number "+ nums[(index-1)] +" is alive!");
		f.close();
		System.exit(0);
	}
    public static int search(String[] input, String key){
    	for(int i =0; i<input.length;i++){
    		if(input[i].equals(key))
    			return i;
    	}
    	return -1;
    }
}
