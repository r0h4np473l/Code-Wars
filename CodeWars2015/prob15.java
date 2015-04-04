import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class prob15 {
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("prob15-1-in.txt"));
		int numOfLines = Integer.parseInt(f.readLine());
		ArrayList<String> sent = new ArrayList<String>();
		String word = "";
		for(int i = 0;i < numOfLines;i++){
			String line = f.readLine();
			StringTokenizer st = new StringTokenizer(line);
			String acronym = st.nextToken();
			word = "";
			sent.clear();
			while(st.hasMoreTokens()){
				if(((word=st.nextToken()).length())>2){
					sent.add(word.substring(0, 2));
				}
				else{
					sent.add(word);
				}
			}
			System.out.println(acronym+" " + sent);
		}
		f.close();
		System.exit(0);
	}
	public static String acronym(ArrayList<String> initials, String acronym){
		String type = "";
		boolean stillSimple = true;
		for(int i = 0;i<acronym.length();i++){
			for(int j = 0; j<acronym.length();j++){
				if(!stillSimple) break;
				
			}
			if(!stillSimple) break;
		}
		return type;
	}
//	public static String completeOrPartial(ArrayList<String> initials,String acronym){
//		int keepgoin=0;
//		for(int i = 0; i <acronym.length();i++){
//			for(int j = 0;j<initials.size();j++){
//				
//			}
//		}
//	}
}
