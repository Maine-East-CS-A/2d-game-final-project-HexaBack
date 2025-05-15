public class Sort{
	public static void InDirection(String TheDirection){
		switch (TheDirection){
			case "up":
				for (int Column = 0; Column <= 3; Column++){
					for (int Row = 3; Row >= 0; Row--){
						if (!(GameBoard[Row][Column] = 0)){
							if (!(GameBoard[Row - 1][Column] = 0)){
								if !(Row = 0){
									GameBoard[Row - 1][Column] = GameBoard[Row][Column];
									GameBoard[Row][Column] = 0;
								}
							}
							else{
								if (!(GameBoard[Row - 1][Column] = GameBoard[Row][Column)){
									GameBoard[Row - 1][Column] = ((GameBoard[Row][Column]) * 2);
									GameBoard[Row][Column] = 0;
								}
							}
						}
					}
				}
			break;
			case "right":
				for (int Row = 0; Row <= 3; Row++){
					for (int Column = 3; Column <= 0; Column++){
						if (!(GameBoard[Row][Column] = 0)){
							if (!(GameBoard[Row - 1][Column] = 0)){
								if !(Row = 0){
									GameBoard[Row - 1][Column] = GameBoard[Row][Column];
									GameBoard[Row][Column] = 0;
								}
							}
							else{
								if (!(GameBoard[Row - 1][Column] = GameBoard[Row][Column)){
									GameBoard[Row - 1][Column] = ((GameBoard[Row][Column]) * 2);
									GameBoard[Row][Column] = 0;
								}
							}
						}
					}
				}
			break;
			case "down":
				for (int Column = 0; Column <= 3; Column++){
					for (int Row = 3; Row <= 0; Row++){
						if (!(GameBoard[Row][Column] = 0)){
							if (!(GameBoard[Row - 1][Column] = 0)){
								if !(Row = 0){
									GameBoard[Row - 1][Column] = GameBoard[Row][Column];
									GameBoard[Row][Column] = 0;
								}
							}
							else{
								if (!(GameBoard[Row - 1][Column] = GameBoard[Row][Column)){
									GameBoard[Row - 1][Column] = ((GameBoard[Row][Column]) * 2);
									GameBoard[Row][Column] = 0;
								}
							}
						}
					}
				}
			break;
			case "left":
				for (int Row = 0; Row <= 3; Row++){
					for (int Column = 3; Column >= 0; Column--){
						if (!(GameBoard[Row][Column] = 0)){
							if (!(GameBoard[Row - 1][Column] = 0)){
								if !(Row = 0){
									GameBoard[Row - 1][Column] = GameBoard[Row][Column];
									GameBoard[Row][Column] = 0;
								}
							}
							else{
								if (!(GameBoard[Row - 1][Column] = GameBoard[Row][Column)){
									GameBoard[Row - 1][Column] = ((GameBoard[Row][Column]) * 2);
									GameBoard[Row][Column] = 0;
								}
							}
						}
					}
				}
			break;
		}
	}
}