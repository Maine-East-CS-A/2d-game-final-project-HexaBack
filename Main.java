import java.util.*;
public class Main{
	public static void Main(String[] args){
		Scanner Scanener = new Scanner(System.in);
		Game.Initialise();
		while (Game.MovesArePossible()){
			System.out.println("Input the direction of your move. Valid inputs: up, right, down, left");
			Game.UpdateBoard(Scanener.nextLine());
			Game.CreateSquare();
			Game.PrintBoard();
		}
		System.out.println("You lose bye bye");
	}
}