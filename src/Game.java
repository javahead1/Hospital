import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		runGame();
	}

	private static ArrayList<Item> inventory = new ArrayList<Item>();
	
	public static void runGame() {
		Room currentRoom = World.buildworld();
		Scanner input = new Scanner(System.in);
		
		String command; // player's command
		do {
			System.out.println(currentRoom);
			System.out.print("Where do you want to go? ");
			command = input.nextLine();
			
			switch(command) {
			case "e":
			case "w":
			case "n":
			case "s":
			case "u":
			case "d":
				currentRoom = currentRoom.getExit(command.charAt(0));
				break;
			case "x":
				System.out.println("Bye! Goodluck next time :)");
				break;
			default:
				System.out.println("Elaborate further"); 
			}
	
		
		} while(!command.equals("x"));
		input.close();
	}
}

