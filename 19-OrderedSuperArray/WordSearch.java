import java.util.*;
public class WordSearch {
	private char[][] board;
	private char[] alph = new char['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'];
	public WordSearch(int r, int c){
		board = new char[r][c];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j]='.';
			}
		}
	}
	public WordSearch() {
		this(20,40);
	}

	public String toString(){
		String s = "";
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				s = s + board[i][j];
			}
			s = s + "\n";
		}
		return s;
	}

	public Boolean addWordH(String w, int row, int col){
		int c = col;
		for (int i=0; i < w.length();i++){
			if(board[row][c] == w.charAt(i)){
			}
			if(board[row][c] != w.charAt(i) && board[row][c] != '.'){
				return false;
				System.exit(0);
			}
			board[row][c] = w.charAt(i);
			c++;



		}
		return true;
	}

	public Boolean addWordDR(String w, int r, int col){
		int c = col;
		int row = r;
		for (int i=0; i < w.length();i++){
			if(board[row][c] == w.charAt(i)){
			}
			if(board[row][c] != w.charAt(i) && board[row][c] != '.'){
				return false;
				System.exit(0);
			}
			board[row][c] = w.charAt(i);
			c++;
			row++;


		}
		return true;
	}

	public Boolean addWordDL(String w, int r, int col){
		int c = col;
		int row = r;
		for (int i=0; i < w.length();i++){
			if(board[row][c] == w.charAt(i)){
			}
			if(board[row][c] != w.charAt(i) && board[row][c] != '.'){
				return false;
				System.exit(0);
			}
			board[row][c] = w.charAt(i);
			c--;
			row--;


		}
		return true;
	}




	public Boolean addWordV(String w, int row, int col){
		int r = row;
		for(int i = 0; i < w.length(); i++){
			if(board[r][col] == w.charAt(i)){
			}
			if(board[r][col] != w.charAt(i) && board[r][col] != '.'){
				return false;
				System.exit(0);
			}
			board[r][col] = w.charAt(i);
			r++;

		}
		return true;
	}

	public void addWord(String w){
		Random a = new Random();
		int r = a.nextInt(4)+1;
		Random b = new Random();
		int randomB = b.nextInt(board.length+1);
		Random c = new Random();
		int randomC = c.nextInt(board[0].length+1);
		if (r==1){
			addWordV(w,randomB,randomC);
		}
		if(r==2){
			addWordH(w,randomB,randomC);
		}
		if(r==3){
			addWordDR(w,randomB,randomC);

		}
		if(r==4){
			addWordDL(w, randomB, randomC);
		}
	}

	public void buildPuzzle(int numWords){
		words = new ArrayList<String>();
		for ( int i = 0 ; i< numWords; i++){
			int wordIndex = rnd.nextInt(wordlist.size());
			String word = wordlist.get(wordIndex);
			if( addWord(word)){
				words.add(word);
				wordlist.remove(wordIndex);
			}
		}
	}

	public String getWords(){
		return(""+words);
	}

	public boolean addWord(String w){
	}
	public boolean addWordHelper(String w, int row, int col, int deltaRow, int deltaCol){
		int r= row;
		int c = col;

	}
	public void makeKey(){
		int[] key = new int[board.length];
		key=board;
	}


	public static void main(String[] args) {
		WordSearch w = new WordSearch();
		System.out.println(w);
		for(int d = 0; d < 20; d++){
			w.addWord();
		}
		System.out.println(w);
		System.out.println(w.getWords());
		w.makeKey();
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if(board[i][j]=='.')
				{
					int a = new Random().nextInt(alph.length);
					String random = (alph[a]);
					board[i][j] = random;
				}
			}
		}
	}
}
