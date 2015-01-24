package CodeWars2014Solutions;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class y2014p11 {
	public static void main(String[] args) throws IOException {
		BufferedReader f =new BufferedReader(new FileReader("y2014p11.txt"));
		String line="";
		Boolean NFound=false;
		//iterate through file until end
		while((line = f.readLine())!=null && !line.equals("-1 -1 -1 -1 -1 -1")){
			//read in all inputs
			StringTokenizer st= new StringTokenizer(line);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int z = Integer.parseInt(st.nextToken());
			//System.out.println(a +" " + b + " " + c + " " + x + " " + y + " " + z);
			//declare before loop
			int k = 1;
			int test =0;
			NFound=false;
			//keep going until N is found
			while(!NFound){
				//create a temporary N
				test = k*a+x;
				//check if that N meets value for b
				if(test%b==y){
					//check if N meets value for c
					if(test%c==z){
						//print result
						System.out.println(test);
						//N has been found
						NFound=true;
					}
				}
				k++;
			}
		}
		System.exit(0);
	}
}