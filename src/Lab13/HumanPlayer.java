package Lab13;

import java.util.Scanner;

public class HumanPlayer extends Player {
	
	private Scanner scan;
	
	public HumanPlayer(String name, Scanner scan) {
		super(name);
		this.scan = scan;
	}
	
	@Override	
	public Roshambo generateRoshambo() {
		String choice = Validator.getStringMatchingRegex(scan, "Would you like to play rock, paper or scissors?", "rock|paper|scissors");
		
		if (choice.equals("rock")) {
			return Roshambo.ROCK;
			
		} else if (choice.equals("paper")) {
			return Roshambo.PAPER;
			
		} else {
			return Roshambo.SCISSORS; 
		}
	}

}
