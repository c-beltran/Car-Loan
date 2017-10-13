import java.util.Scanner;

public class MazeRunner {

	public static void main(String[] args){
		Maze myMap = new Maze();
		
		intro();
		myMap.printMap();
		String move =userMove();
		System.out.println("this is move" + move);

	}
	
	public static void intro(){
		System.out.println("Hello there!! Welcome to MAZE RUNNER!! ");
		System.out.println("Here is your current position: ");
	}
	
	public static String userMove(){
		String[] letters = {"R","L","U","D"};
		System.out.println("Where would you like to move? (R, L, U, D)");
		Scanner input = new Scanner(System.in);
		String userInput = input.nextLine();
		boolean verifyInput;
		if(userInput.equalsIgnoreCase("R") || userInput.equalsIgnoreCase("L") || userInput.equalsIgnoreCase("U") || userInput.equalsIgnoreCase("D")){
			verifyInput = true;
		}
		else{
			verifyInput = false;
		}
		
		while(!verifyInput){
			System.out.println("Please enter a valid option: ");
			userInput = input.nextLine();
			if(userInput.equalsIgnoreCase("R") || userInput.equalsIgnoreCase("L") || userInput.equalsIgnoreCase("U") || userInput.equalsIgnoreCase("D")){
				verifyInput = true;
			}
			else{
				verifyInput = false;
			}
		}
		
		return userInput;
		
	}
}
