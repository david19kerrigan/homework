import java.util.*;
public class WordSearch {
    private char[][] board;

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

    public void addWordH(String w, int row, int col){
	int c = col;
	for (int i=0; i < w.length();i++){
	    if(board[row][c] == w.charAt(i)){
	    }
	    if(board[row][c] != w.charAt(i) && board[row][c] != '.'){
		System.out.println("illegal overlap");
		System.exit(0);
	    }
	    board[row][c] = w.charAt(i);
	    c++;
	    
		
				
	}
    }

    public void addWordDR(String w, int r, int col){
	int c = col;
	int row = r;
	for (int i=0; i < w.length();i++){
	    if(board[row][c] == w.charAt(i)){
	    }
	    if(board[row][c] != w.charAt(i) && board[row][c] != '.'){
		System.out.println("illegal overlap");
		System.exit(0);
	    }
	    board[row][c] = w.charAt(i);
	    c++;
	    row++;
		
				
	}
    }

    public void addWordDL(String w, int r, int col){
	int c = col;
	int row = r;
	for (int i=0; i < w.length();i++){
	    if(board[row][c] == w.charAt(i)){
	    }
	    if(board[row][c] != w.charAt(i) && board[row][c] != '.'){
		System.out.println("illegal overlap");
		System.exit(0);
	    }
	    board[row][c] = w.charAt(i);
	    c--;
	    row--;
		
				
	}
    }



    
    public void addWordV(String w, int row, int col){
	int r = row;
	    for(int i = 0; i < w.length(); i++){
		if(board[r][col] == w.charAt(i)){
	    }
	    if(board[r][col] != w.charAt(i) && board[r][col] != '.'){
		System.out.println("illegal overlap");
		System.exit(0);
	    }
		board[r][col] = w.charAt(i);
		r++;
		
	    }
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
	words = new ArrayList<Strign>();
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
	return ""+words;
    }

    public boolean addWord(String w){
    }
    public boolean addWordHelper(String w, int row, int col, int deltaRow, int deltaCol){
	int r= row;
	int c = col;

    }
    public void makeKey(){
	key = board;
    }
      
    
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	System.out.println(w);
	w.addWord("hello"); // should work
	//w.addWordH("look",3,14); // test illegal overlap
	//w.addWordH("look",3,18); // test legal overlap
	//w.addWordH("look",-3,20); // test illegal row
	//w.addWordH("look",3,55); // test illegal col
	// etc
	System.out.println(w);
	System.out.println(w.getWords());
	w.makeKey();
    }
}
