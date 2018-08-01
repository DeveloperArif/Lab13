package Lab13;

import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String name = scan.nextLine();
		
		HumanPlayer human = new HumanPlayer(name, scan);
		
		System.out.println(human.generateRoshambo());

		RockPlayer player = new RockPlayer("Dwayne"); 
		Roshambo playerChoice = player.generateRoshambo();
		System.out.println(playerChoice);
		
	}
	

}
