public class WS{
    private char[][] board;
    public WS(int r, int c){
	board = new char[r][c];
	for (int i = 0; i<board.length; i++){
	    for(int j = 0; j< board[i].length; j++){
		board[i][j]='.';
	    }
	}
    }
    public WS(){
	this(20,40);
    }
    public String toString(){
	String s = "";
	for (int i =0 ; i < board.length; i++){
	    for (int j = 0; j<board[i].length; j++){
		s = s +board[i][j];
	    }
	    s = s + "\n";
	}
	return s;
    }

}
