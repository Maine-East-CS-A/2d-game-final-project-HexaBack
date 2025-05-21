import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Game.Initialise();
		while (Game.MovesArePossible()){
			System.out.println("Input the direction of your move. Valid inputs: up, right, down, left");
			Game.UpdateBoard(scanner.nextLine());
			Game.CreateSquare();
			Game.PrintBoard();
		}
		System.out.println("You lose bye bye");
	}
}