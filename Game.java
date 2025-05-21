public class Game{
    static int[][] GameBoard = new int[4][4];
    public static void Initialise(){
        GameBoard = new int[4][4];
        CreateSquare();
        CreateSquare();
    }
    public static void CreateSquare(){
        // Find a random empty cell and place a 2 or 4
        java.util.Random rand = new java.util.Random();
        int row, col;
        do {
            row = rand.nextInt(4);
            col = rand.nextInt(4);
        } while (GameBoard[row][col] != 0);
        GameBoard[row][col] = (rand.nextInt(10) > 2) ? 4 : 2;
    }
    public static boolean MovesArePossible(){
        // Check for any empty cell
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                if (GameBoard[i][j] == 0){
                    return true;
                }
            }
        }
        // Additional logic for checking possible merges can be added here
        return false;
    }
    public static void UpdateBoard(String Direction){
        // Only accept valid directions
        while (!(Direction.equals("up") || Direction.equals("right") || Direction.equals("down") || Direction.equals("left"))){
            System.out.println("Invalid direction. Please enter up, right, down, or left:");
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            Direction = scanner.nextLine();
        }
        // Call movement logic
        Sort.InDirection(Direction);
    }
    public static void PrintBoard(){
        for (int Row = 0; Row < 4; Row++){
            for (int Column = 0; Column < 4; Column++){
                System.out.print(GameBoard[Row][Column] + "\t");
            }
            System.out.println();
        }
    }
}