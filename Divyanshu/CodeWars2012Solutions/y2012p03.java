package CodeWars2012Solutions;
//UNFININSHED
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class y2012p03 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader f = new BufferedReader(new FileReader("y2012p03.txt"));
		String line="";
		String[][] board = new String[8][8];
		for(int i = 0; i<board.length;i++){
			for(int j=0;j<board[i].length;j++){
				board[i][j]=".";
			}
		}
		board[3][3]="W";
		board[3][4]="B";
		board[4][3]="B";
		board[4][4]="W";
		print2DArray(board);
		int row=0;
		int col=0;
		String who = "W"; 
		Boolean reversi=false;
		int indexOfReversi=0;
		String[][] tempBoard = new String[8][8];
		while((line = f.readLine())!=null && !(line.equals("END"))){
			col = (int)(line.charAt(0)-'a');
			row = Integer.parseInt(""+line.charAt(1))-1;
			board[row][col] = who;
			tempBoard = board;

			int i = row;
			int j=col;
			while(!reversi && i>1){
				i--;
				if(tempBoard[i][col].equals(who)){
					reversi = true;
				}
				else if(tempBoard[i][col].equals(".")){
					break;
				}
				else{
					tempBoard[i][col]=who;
				}
			}
			if(!reversi){
				board = board;
				tempBoard=board;
			}
			else{
				board = tempBoard;
				reversi=false;
			}
			i = row;
			while(!reversi && i<board.length-1){
				i++;
				if(tempBoard[i][col].equals(who)){
					reversi = true;
				}
				else if(tempBoard[i][col].equals(".")){
					break;
				}
				else{
					tempBoard[i][col]=who;
				}
			}
			if(!reversi){
				board = board;
				tempBoard=board;
			}
			else{
				board = tempBoard;
				reversi=false;
			}
	
			
			
			
			
			while(!reversi && j<board[row].length-1){
				j++;
				if(tempBoard[row][j].equals(who)){
					reversi = true;
				}
				else if(tempBoard[row][j].equals(".")){
					break;
				}
				else{
					tempBoard[row][j]=who;
				}
			}
			if(!reversi){
				board = board;
				tempBoard=board;
			}
			else{
				board = tempBoard;
				reversi=false;
			}
			j=col;
			while(!reversi && j>1){
				j--;
				if(tempBoard[row][j].equals(who)){
					reversi = true;
				}
				else if(tempBoard[row][j].equals(".")){
					break;
				}
				else{
					tempBoard[row][j]=who;
				}
			}
			if(!reversi){
				board = board;
				tempBoard=board;
			}
			else{
				board = tempBoard;
				reversi=false;
			}
			if(who.equals("W"))
				who = "B";
			else who ="W";

			
			
			
			
			

			if(!reversi){
				board = board;
				tempBoard=board;
			}
			else{
				board = tempBoard;
				reversi=false;
			}
			if(who.equals("W"))
				who = "B";
			else who ="W";
			print2DArray(board);
			System.out.println();
			//System.out.println(Arrays.deepToString(board));
		}
		print2DArray(board);
	}
	public static void print2DArray(String[][] board){
		for(int i =0;i<board.length;i++){
			for(int j = 0; j<board[i].length;j++){
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}

}
