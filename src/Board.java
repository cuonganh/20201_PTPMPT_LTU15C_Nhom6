import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Board extends JPanel {
  
  //Board Constructor Constructs a custom board for numPlayers to play
  public Board() {
    
  }
  
  
  //Function to pre-load the points for all pieces to aid in debugging traversal issues
  public static void debugLoadPoints() {
    
  }

  
  /*
	 * Check For Winner! Return -1 for no winner, else return player index.
	 * Should only ever return -1,0,1,2,3. Nothing else.
	 */
	public static int checkWin() {
    
  }
  
  
  /*
	 * MovePlayer moves and sets the players Token locations on the board tv =
	 * turnValue Moves Player based on tv index.
	 */
	public static void movePlayer() {
    
  }
  
  
	 //Returns List of Points, for the Game Logic Array.
	public ArrayList<Point> getPoints() {
    
  }
  
  
	 //Returns Point List Length
	public int getPointLength() {
    
  }
  
  
	 //Prints out point list for debugging purposes
	public void printPoints() {
    
  }
  
  
	//Returns Block Size for Board
	public int getBlockSize() {
    
  }
  
  
  //Handles Painting the Players info and Tokens
	public void paintPlayerOverlay() {
    
  }
  
  
	 //Paints the Board, Players, and tokens
	public void paint(Graphics g) {
    
  }

}
