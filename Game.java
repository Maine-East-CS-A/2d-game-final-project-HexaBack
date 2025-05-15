public class Game{
	public static void Initialise(){
		int [][] GameBoard = new int[4][4];
		CreateSquare(); // create 2 initial squares for a new game
		CreateSquare(); // create 2 initial squares for a new game
	}
	public static void CreateSquare(){
		if ((int)(Math.random() * 10) > 2){
			// i must warn, this part is going to be very inefficient 'bad code'. it's just forever gonna bruteforce cells until it finds an empty one. MUST RUN AFTER REMAINING MOVES CHECK STATES 'TRUE' !!!
			GameBoard[((Math.random() * 3.0) + 1)][((Math.random() * 3.0) + 1)] = 4; // this scary math is to make sure every cell has an (almost) equal chance of being occupied by a number
		}
		else{
			GameBoard[((Math.random() * 3.0) + 1)][((Math.random() * 3.0) + 1)] = 2; // this time, 2 (should be triggered more often than 4)
		}
	}
	public static boolean MovesArePossible(){
		private boolean AreTheyReally = false;
		for (int IndexRows = 0; IndexRows < grid.length; IndexRows++){
			for (int IndexColumns = 0; IndexColumns < grid[IndexRows].length; IndexColumns++){
				if (grid[IndexRows][IndexColumns] = 0){
					AreTheyReally = true;
				}
			}
		}
		return AreTheyReally;
	}
	public static void UpdateBoard(String Direction){
		private String DirectionVerify = Direction;
		while !(Direction == "up" || Direction == "right" || Direction == "down" || Direction == "left"){
			DirectionVerify = Scanener.nextLine();
		}
		Sort.InDirection(DirectionVerify);
	}
	public static void PrintBoard(){
		for (int Row = 0; Row <= 3; Row++){
			for (int Column = 0; Column <= 3; Column++){
				System.out.println(GameBoard[Row][Column]);
			}
		}
	}
}