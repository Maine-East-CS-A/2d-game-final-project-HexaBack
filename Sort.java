public class Sort{
	public static void InDirection(String TheDirection){
		switch (TheDirection){
			case "up":
				for (int col = 0; col < 4; col++) {
					int[] temp = new int[4];
					int idx = 0;
					for (int row = 0; row < 4; row++) {
						if (Game.GameBoard[row][col] != 0) {
							temp[idx++] = Game.GameBoard[row][col];
						}
					}
					for (int i = 0; i < 3; i++) {
						if (temp[i] != 0 && temp[i] == temp[i+1]) {
							temp[i] *= 2;
							temp[i+1] = 0;
						}
					}
					int[] newCol = new int[4];
					int newIdx = 0;
					for (int i = 0; i < 4; i++) {
						if (temp[i] != 0) newCol[newIdx++] = temp[i];
					}
					for (int row = 0; row < 4; row++) {
						Game.GameBoard[row][col] = newCol[row];
					}
				}
				break;
			case "down":
				for (int col = 0; col < 4; col++) {
					int[] temp = new int[4];
					int idx = 0;
					for (int row = 3; row >= 0; row--) {
						if (Game.GameBoard[row][col] != 0) {
							temp[idx++] = Game.GameBoard[row][col];
						}
					}
					for (int i = 0; i < 3; i++) {
						if (temp[i] != 0 && temp[i] == temp[i+1]) {
							temp[i] *= 2;
							temp[i+1] = 0;
						}
					}
					int[] newCol = new int[4];
					int newIdx = 0;
					for (int i = 0; i < 4; i++) {
						if (temp[i] != 0) newCol[newIdx++] = temp[i];
					}
					for (int row = 3, i = 0; row >= 0; row--, i++) {
						Game.GameBoard[row][col] = newCol[i];
					}
				}
				break;
			case "left":
				for (int row = 0; row < 4; row++) {
					int[] temp = new int[4];
					int idx = 0;
					for (int col = 0; col < 4; col++) {
						if (Game.GameBoard[row][col] != 0) {
							temp[idx++] = Game.GameBoard[row][col];
						}
					}
					for (int i = 0; i < 3; i++) {
						if (temp[i] != 0 && temp[i] == temp[i+1]) {
							temp[i] *= 2;
							temp[i+1] = 0;
						}
					}
					int[] newRow = new int[4];
					int newIdx = 0;
					for (int i = 0; i < 4; i++) {
						if (temp[i] != 0) newRow[newIdx++] = temp[i];
					}
					for (int col = 0; col < 4; col++) {
						Game.GameBoard[row][col] = newRow[col];
					}
				}
				break;
			case "right":
				for (int row = 0; row < 4; row++) {
					int[] temp = new int[4];
					int idx = 0;
					for (int col = 3; col >= 0; col--) {
						if (Game.GameBoard[row][col] != 0) {
							temp[idx++] = Game.GameBoard[row][col];
						}
					}
					for (int i = 0; i < 3; i++) {
						if (temp[i] != 0 && temp[i] == temp[i+1]) {
							temp[i] *= 2;
							temp[i+1] = 0;
						}
					}
					int[] newRow = new int[4];
					int newIdx = 0;
					for (int i = 0; i < 4; i++) {
						if (temp[i] != 0) newRow[newIdx++] = temp[i];
					}
					for (int col = 3, i = 0; col >= 0; col--, i++) {
						Game.GameBoard[row][col] = newRow[i];
					}
				}
				break;
		}
	}
}